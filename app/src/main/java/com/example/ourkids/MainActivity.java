package com.example.ourkids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton back = findViewById(R.id.button6);
        ImageButton menu = findViewById(R.id.button7);
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), hospital1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), inoculationActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), first.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), data.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), graph.class);
                startActivity(intent);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuitem1:
                        Intent intent1 = new Intent(getApplicationContext(), hospital1.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent1);
                        return true;
                    case R.id.menuitem2:
                        Intent intent2 = new Intent(getApplicationContext(), inoculationActivity.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent2);
                        return true;
                    case R.id.menuitem3:
                        Intent intent3 = new Intent(getApplicationContext(), first.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent3);
                        return true;
                    case R.id.menuitem4:
                        Intent intent4 = new Intent(getApplicationContext(), data.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent4);
                        return true;
                    case R.id.menuitem5:
                        Intent intent5 = new Intent(getApplicationContext(), graph.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent5);
                        return true;
                    default:
                        Intent intent6 = new Intent(getApplicationContext(), LoginActivity.class);
                        drawerLayout.closeDrawer(GravityCompat.END);
                        startActivity(intent6);
                        return MainActivity.super.onOptionsItemSelected(item);
                }
            }
        });

    }
}

