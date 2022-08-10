package com.ferin.signuppages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class FacebookSignup extends AppCompatActivity {

    TextView learnMore;
    TextView fbByClickingPrivacyPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_signup);

        learnMore = findViewById(R.id.fbPeopleLearnMore);
        String next = "<font color='#0000cd'>Learn more.</font>";
        String finalSent= learnMore.getText().toString().replace("Learn more.", next);
        learnMore.setText(Html.fromHtml(finalSent));

        fbByClickingPrivacyPolicy = findViewById(R.id.fbByClickingPrivacyPolicy);
        String nextOne =  "<font color='#000cd'>Terms, Privacy Policy</font>";
        String finalSentTwo= fbByClickingPrivacyPolicy.getText().toString().replace("Terms, Privacy Policy",nextOne);
        String nextTwo =  "<font color='#000cd'>Cookies Policy.</font>";
        String finalSentThree= finalSentTwo.replace("Cookies Policy.",nextTwo);
        fbByClickingPrivacyPolicy.setText(Html.fromHtml(finalSentThree));


    }
}