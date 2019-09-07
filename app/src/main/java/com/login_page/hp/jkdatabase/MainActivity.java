package com.login_page.hp.jkdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final  String EXTRA_TEXT  = "com.login_page.hp.jkdatabase";


    Button loginbutton;
    EditText usernameedittext;
    EditText passwordedittext;
    DatabaseHelper db;
    String usernname;
    String password;
//    SharedPreferences sharedPreferences;

  //  public static final String usernamepreference = "MyPrefsFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//       sharedPreferences = getSharedPreferences("save name",MODE_PRIVATE);
//       SharedPreferences.Editor editor = sharedPreferences.edit();
//       editor.putString("value",usernameedittext.getText().toString());
//       editor.apply();
        setContentView(R.layout.activity_main);
        loginbutton = findViewById(R.id.login_button);

        passwordedittext = findViewById(R.id.password_editText);


//        bindviews();
        db = new DatabaseHelper(this);
        Log.d("table", "onCreate: "+Login.Logintablequery);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernname = usernameedittext.getText().toString();
                usernameedittext = findViewById(R.id.username_editText);
                               // password = passwordedittext.getText().toString();
                boolean isTrue=db.insert(new Login(usernname,password));

                if(TextUtils.isEmpty(usernname)){
                    usernameedittext.setError("Enter the username");
                    usernameedittext.requestFocus();
                }
                else if (TextUtils.isEmpty(password))
                {
                    passwordedittext.setError("Enter the password ");
                    passwordedittext.requestFocus();
                }
                else
                setContentView(R.layout.logedinpage);
                String text = usernameedittext.getText().toString();
//                Intent loginintent =  new Intent(MainActivity.this,logedinpage.class);
//                loginintent.putExtra(Intent.EXTRA_TEXT,text);
//                startActivity(loginintent);
//                Intent loginintent =  new Intent(MainActivity.this,logedinpage.class);
//                usernname=usernameedittext.getText().toString();
                //loginintent.putExtra("value",usernname);
//                startActivity(loginintent);





                    Log.d("test", "onClick: "+isTrue);
                db.getAllUsers();
                Toast.makeText(getApplicationContext(),"Loging In",Toast.LENGTH_SHORT).show();

            }
        });

    }



//    private void bindviews() {




//    }
}
