package com.ferin.signuppages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //i am from web

    Button instaSign;
    Button googleSignup;
    Button facebookSignup;
    Button ownNutellaSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instaSign = findViewById(R.id.instaSignup);
        instaSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insta = new Intent(MainActivity.this, InstagramSignup.class);
                startActivity(insta);
            }
        });

        googleSignup = findViewById(R.id.googleSignup);
        googleSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent google = new Intent(MainActivity.this, GoogleSignup.class);
                startActivity(google);
            }
        });

        facebookSignup = findViewById(R.id.facebookSignup);
        facebookSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = new Intent(MainActivity.this, FacebookSignup.class);
                startActivity(facebook);
            }
        });

        ownNutellaSignup = findViewById(R.id.ownNutellaSignup);
        ownNutellaSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nutella = new Intent(MainActivity.this,NewOwnSignup.class);
                startActivity(nutella);
            }
        });

    }
}
