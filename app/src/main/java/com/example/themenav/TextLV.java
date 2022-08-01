package com.example.themenav;

/*
 * @author: Oliver Lester
 * @description: This class display the page that contains the ListView with only text.
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class TextLV extends AppCompatActivity {

    String[] locList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_lv);
        ListView textLV = (ListView) findViewById(R.id.text_list_view);

        locList = new String[] {this.getString(R.string.loc1), this.getString(R.string.loc2),
                this.getString(R.string.loc3), this.getString(R.string.loc4),
                this.getString(R.string.loc5), this.getString(R.string.loc6),
                this.getString(R.string.loc7), this.getString(R.string.loc8),
                this.getString(R.string.loc9), this.getString(R.string.loc10)};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.text_lv_row, R.id.text_lv_view, locList);

        textLV.setAdapter(arrayAdapter);
    }

}