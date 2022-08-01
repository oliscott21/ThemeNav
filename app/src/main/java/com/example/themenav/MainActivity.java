package com.example.themenav;

/*
 * @author: Oliver Lester
 * @description: This class is responsible for showing the starting page for the ThemeNav app.
 *  While also containing the necessary methods for buttons on the page to go to their respective
 *  pages.
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This
     * @param view - is the view
     */
    public void toTextLV(View view) {
        Intent textIntent = new Intent(this, TextLV.class);
        startActivity(textIntent);
    }

    public void toImageLV(View view) {
        Intent imageIntent = new Intent(this, ImageLV.class);
        startActivity(imageIntent);
    }
}