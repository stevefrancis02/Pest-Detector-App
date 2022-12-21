package com.example.pest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        }

    public void ClickAphid(View view) {

        redirectActivity(this,Aphids.class);


    }


    public void ClickCutworm(View view) {

        redirectActivity(this,Cutworms.class);


    }

    public void ClickLeafMiners(View view) {

        redirectActivity(this,Leaf_Miners.class);


    }

    public void ClickSlug(View view) {

        redirectActivity(this,Slugs.class);


    }

    public void ClickWhitefly(View view) {

        redirectActivity(this,Whiteflies.class);


    }



    public void redirectActivity(Activity activity, Class aClass) {

        Intent intent = new Intent(activity,aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);




    }

}