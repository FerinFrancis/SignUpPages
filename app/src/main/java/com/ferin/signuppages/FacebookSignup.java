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
        String text = learnMore.getText().toString();
        // Created a new text "Learn more." with blue colour and stored it in variable colourLearnMore
        String colourLearnMore = "<font color='#0000cd'>Learn more.</font>";
        // Replacing the "Learn more." words in text String with colouredLearnMore
        // And storing the output in variable finalSent
        String finalSent= text.replace("Learn more.", colourLearnMore);
        // Setting the finalSent to learnMore TextView
        // This displays selected words in blue colour in textView
        learnMore.setText(Html.fromHtml(finalSent));

        fbByClickingPrivacyPolicy = findViewById(R.id.fbByClickingPrivacyPolicy);
        String textTwo = fbByClickingPrivacyPolicy.getText().toString();
        String colourTermsPrivacy =  "<font color='#000cd'>Terms, Privacy Policy</font>";
        String textWithReplacedTermsPrivacy= textTwo.replace("Terms, Privacy Policy",colourTermsPrivacy);
        String colourCookiesPolicy =  "<font color='#000cd'>Cookies Policy.</font>";
        String finalReplacedSent= textWithReplacedTermsPrivacy.replace("Cookies Policy.",colourCookiesPolicy);
        fbByClickingPrivacyPolicy.setText(Html.fromHtml(finalReplacedSent));

    }
}