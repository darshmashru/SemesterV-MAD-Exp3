package com.darshmashru.madexperiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SphynxCatInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphynx_cat_information);
    }
    public void goBack(View view) {
        Intent intent = new Intent(SphynxCatInformation.this, MainActivity.class);
        startActivity(intent);
    }
}