package com.darshmashru.madexperiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.image);

        String[] pets = {
                "Select a pet",
                "Shiba Inu",
                "Siberian Husky",
                "Welsh Corgi",
                "Sphynx Cat",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pets);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        image.setImageResource(android.R.color.transparent);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.shiba_inu);
//                        Intent shiba_intent = new Intent(MainActivity.this, ShibaInuInformation.class);
//                        startActivity(shiba_intent);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.siberian_husky);
//                        Intent husky_intent = new Intent(MainActivity.this, SiberianHuskyInformation.class);
//                        startActivity(husky_intent);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.welsh_corgi);
//                        Intent corgi_intent = new Intent(MainActivity.this, WelshCorgiInformation.class);
//                        startActivity(corgi_intent);
                        break;
                    case 4:
//                        image.setImageResource(R.drawable.sphynx_cat);
//                        Intent bingus_intent = new Intent(MainActivity.this, SphynxCatInformation.class);
                        // USUAL WAY FOR STARTING AN ACTIVITY - startActivity(bingus_intent);
//                        new Handler().postDelayed(() -> startActivity(bingus_intent), 1000); // ADDED TO INTRODUCE DELAY AFTER SELECTION
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // DO ABSOLUTELY NOTHING WHEN NOTHING IS SELECTED
            }
        });
    }
}