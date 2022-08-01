package com.example.themenav;

/*
 * @author: Oliver Lester
 * @description: This class display the page that contains the ListView with both images and text.
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImageLV extends AppCompatActivity {

    String[] textList;
    int[] imageList = new int[] {R.drawable.rr, R.drawable.bm, R.drawable.rb, R.drawable.f};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_lv);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>();

        textList = new String[]{this.getString(R.string.res1), this.getString(R.string.res2),
                this.getString(R.string.res3), this.getString(R.string.res4)};

        for (int i = 0; i < imageList.length; i++) {
            HashMap<String,String> hm = new HashMap<>();
            hm.put("image_lv_image", Integer.toString(imageList[i]));
            hm.put("image_lv_text", textList[i]);
            aList.add(hm);
        }

        String[] from = {"image_lv_image", "image_lv_text"};
        int[] to = {R.id.image_lv_image, R.id.image_lv_text};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList,
                R.layout.image_lv_row, from, to);

        ListView imageLV = (ListView) findViewById(R.id.image_list_view);

        imageLV.setAdapter(simpleAdapter);
    }
}