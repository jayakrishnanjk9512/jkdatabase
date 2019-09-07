package com.login_page.hp.jkdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "login_db";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(Login.Logintablequery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insert(Login login){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Login.column_Username,login.getUsername());
        contentValues.put(Login.column_Password,login.getPassword());
        long d=db.insert(Login.tableName,null,contentValues);
        Log.d("test", "insert: "+d);
        db.close();
        return  true;
    }

    public List<Login> getAllUsers(){
        List<Login> users=new ArrayList<>();
        SQLiteDatabase db=this.getReadableDatabase();
        String query="select * from "+Login.tableName+";";
        Cursor c=db.rawQuery(query,null);
        while (c.moveToNext()) {
            Log.d("test", "getAllUsers: "+c.getString(1));
        }
        return users;

    }

    public Login get(long id){
        SQLiteDatabase db = this.getReadableDatabase();


        Cursor cursor = db.query(Login.tableName ,
                new  String[ ]{Login.columnuser_id , Login.column_Username , Login.column_Password},
                Login.columnuser_id + "=?",
         new String[]{String.valueOf(id)},null,null,null,null);

        if (cursor != null);

        cursor.moveToFirst();


        Login login = new Login(
                cursor.getString(cursor.getColumnIndex(Login.column_Username))
        );

        cursor.close();
         return login;


    }
}
