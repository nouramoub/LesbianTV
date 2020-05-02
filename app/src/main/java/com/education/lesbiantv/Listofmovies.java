package com.education.lesbiantv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Listofmovies extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.logo1};
    String videos[] = {"https://www.veoh.com/watch/v142017589H86pF2YP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmovies);

        simpleGrid = (GridView) findViewById(R.id.grid);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Listofmovies.this, MainActivity.class);
                intent.putExtra("video", videos[position]);// put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
