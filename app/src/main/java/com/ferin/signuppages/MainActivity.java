package com.ferin.signuppages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
                // Navigates from MainActivity to InstagramSignup Activity
                Intent insta = new Intent(MainActivity.this, InstagramSignup.class);
                // This code triggers the Intent event
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

    // To create menu this method is used
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Informs the method to use main_act_menu xml file for creating menu
        getMenuInflater().inflate(R.menu.main_act_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // This method gets executed when we click on the menu item
    // The same method name has to be used in the Item tag inside menu xml file
    public void aboutApp(MenuItem item) {
        Toast.makeText(this, "This App shows Signup pages of social media apps", Toast.LENGTH_SHORT).show();
    }
}
