package com.login_page.hp.jkdatabase;

import org.w3c.dom.Text;

public class Login {

    public static String tableName = "LoginTable" ,columnuser_id = "Uid", column_Username = "Username" , column_Password = "Password";

    public static String Logintablequery = " Create Table " + tableName + "(" +columnuser_id + " INTEGER PRIMARY KEY AUTOINCREMENT , "
            + column_Username + " TEXT, " + column_Password + " TEXT);";


    public  int uid;
    public  String username;
    public  String password;

    public Login(String string) {

    }

    public Login( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static String getTableName() {
        return tableName;
    }

    public static void setTableName(String tableName) {
        Login.tableName = tableName;
    }

    public static String getColumnuser_id() {
        return columnuser_id;
    }

    public static void setColumnuser_id(String columnuser_id) {
        Login.columnuser_id = columnuser_id;
    }

    public static String getColumn_Username() {
        return column_Username;
    }

    public static void setColumn_Username(String column_Username) {
        Login.column_Username = column_Username;
    }

    public static String getColumn_Password() {
        return column_Password;
    }

    public static void setColumn_Password(String column_Password) {
        Login.column_Password = column_Password;
    }

    public static String getLogintablequery() {
        return Logintablequery;
    }

    public static void setLogintablequery(String logintablequery) {
        Logintablequery = logintablequery;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

