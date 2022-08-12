package com.ferin.signuppages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InstagramSignup extends AppCompatActivity {

    TextView learnMore;
    TextView privacyCookies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_signup);

        learnMore = findViewById(R.id.learnMoreView);

        String text = learnMore.getText().toString();
        String sourceString = text.replace("Learn More", "<b>" + "Learn More" + "</b>");
        learnMore.setText(Html.fromHtml(sourceString));

        privacyCookies = findViewById(R.id.privacyCookiesView);
        String textTwo = privacyCookies.getText().toString();
        String sourceStringTwo = textTwo.replace("Terms, Privacy Policy", "<b>" + "Terms, Privacy Policy" + "</b>");
        String sourceStringThree = sourceStringTwo.replace("Cookies Policy .", "<b>" + "Cookies Policy ." + "</b>");
        privacyCookies.setText(Html.fromHtml(sourceStringThree));

    }
}