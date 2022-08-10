package com.ferin.signuppages;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.widget.Button;
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


//        learnMore = findViewById(R.id.learnMoreView);
//        String text = learnMore.getText().toString();
//        SpannableString ss = new SpannableString(text);
//        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
//        ss.setSpan(boldSpan, 83, 94, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        learnMore.setText(ss);

    }
}