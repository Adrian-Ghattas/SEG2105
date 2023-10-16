package com.example.teamprofilemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LogoSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_selector);
    }

    public void setTeamIcon(View view) {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();
        //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;
        //Adding stuff to the return intent
        returnIntent.putExtra("imageID",
                selectedImage.getId());
        setResult(RESULT_OK, returnIntent);
        //Finishing Activity and return to main screen!
        finish();
    }
}