package com.example.pest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Cutworms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutworms);


        getSupportActionBar().setTitle("Cutworms");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}