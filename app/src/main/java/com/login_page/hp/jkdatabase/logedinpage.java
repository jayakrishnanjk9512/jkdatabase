package com.login_page.hp.jkdatabase;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class logedinpage  extends AppCompatActivity {

    TextView usertextview;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logedinpage);


//         username=getIntent().getExtras().getString("value");
//         usertextview.setText(username);
        Intent intent = getIntent();
        String  text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        usertextview = findViewById(R.id.user_textview);

        usertextview.setText(text);


//        SharedPreferences sharedPreferencesusername = getSharedPreferences("data", Context.MODE_PRIVATE);
//        String value = sharedPreferencesusername.getString()
}}

