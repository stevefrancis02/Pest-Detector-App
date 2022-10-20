package com.example.pest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class History extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {

        Home.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view) {

        Home.closeDrawer(drawerLayout);


    }

    public void ClickHome(View view) {

        Home.redirectActivity(this,Home.class);
    }


    public void ClickHistory(View view) {

        recreate();
    }

    public void ClickAboutUs(View view) {

        Home.redirectActivity(this,AboutUs.class);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Home.closeDrawer(drawerLayout);
    }

}