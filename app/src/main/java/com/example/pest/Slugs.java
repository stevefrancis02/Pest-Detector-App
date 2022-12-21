package com.example.pest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Slugs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slugs);


        getSupportActionBar().setTitle("Slugs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}