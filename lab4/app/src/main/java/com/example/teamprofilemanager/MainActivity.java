package com.example.teamprofilemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setLogo(View view) {
        Intent intent = new Intent(getApplicationContext(),
                LogoSelectorActivity.class);
        startActivityForResult(intent, 0);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
        String drawableName = "ic_logo_00";
        int imageID = data.getIntExtra("imageID", R.id.teamid00);
        if (imageID == R.id.teamid00) {
            drawableName = "ic_logo_00";
        } else if (imageID == R.id.teamid01) {
            drawableName = "ic_logo_01";
        } else if (imageID == R.id.teamid02) {
            drawableName = "ic_logo_02";
        } else if (imageID == R.id.teamid03) {
            drawableName = "ic_logo_03";
        } else if (imageID == R.id.teamid04) {
            drawableName = "ic_logo_04";
        } else if (imageID == R.id.teamid05) {
            drawableName = "ic_logo_05";
        } else {
            drawableName = "ic_logo_00";
        }
        int resID = getResources().getIdentifier(drawableName, "drawable",
                getPackageName());
        logoImage.setImageResource(resID);
    }

    public void openInGoogleMaps (View view) {
        EditText teamPostalCode = (EditText) findViewById(R.id.postalCodeId);
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamPostalCode.getText());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}