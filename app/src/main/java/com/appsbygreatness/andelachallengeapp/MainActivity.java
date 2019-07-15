package com.appsbygreatness.andelachallengeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar appBar = findViewById(R.id.mainToolbar);
        setSupportActionBar(appBar);

        Button aboutALCButton = findViewById(R.id.aboutAlcButton);
        Button myProfileButton = findViewById(R.id.myProfileButton);

        aboutALCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent aboutALC = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(aboutALC);
            }
        });

        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myProfile = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(myProfile);
            }
        });


    }
}
