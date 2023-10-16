package com.example.teamprofilemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        Intent intent = getIntent();
        Team team = (Team) getIntent().getSerializableExtra("teamInfo");
        TextView teamName = (TextView) findViewById(R.id.teamNameTextViewId);
        teamName.setText(team.getName());
        TextView teamPostalCode = (TextView) findViewById(R.id.postalCodeTextViewId);
        teamPostalCode.setText(team.getPostalCode());
        ImageView logoImage = (ImageView) findViewById(R.id.teamLogoId);
        int resID = getResources().getIdentifier(team.getDrawableName(), "drawable", getPackageName());
        logoImage.setImageResource(resID);
    }
}