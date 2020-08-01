package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button loginButton = findViewById(R.id.login_btn);

      /*  loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(login_intent);
            }
        });*/


    }

    public void launchRegistrationScreen(View view) {
        Intent intent=new Intent(this,RegistrationScreen.class);
        startActivity(intent);
    }
}