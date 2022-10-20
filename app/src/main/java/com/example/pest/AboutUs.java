package com.example.pest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {

        Home.openDrawer(drawerLayout);
    }

    public void ClickHome(View view) {

        Home.redirectActivity(this, Home.class);
    }

    public void ClickLogo(View view) {

        Home.closeDrawer(drawerLayout);


    }


    public void ClickHistory(View view) {

        Home.redirectActivity(this, History.class);
    }

    public void ClickAboutUs(View view) {

        recreate();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Home.closeDrawer(drawerLayout);
    }

}