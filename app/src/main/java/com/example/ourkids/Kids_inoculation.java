package com.example.ourkids;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class Kids_inoculation extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kids_inoculation);

        ImageButton menu = findViewById(R.id.button7);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);


        ImageButton back = findViewById(R.id.button6);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });

        Button btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Kids_list.class);
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
                        return Kids_inoculation.super.onOptionsItemSelected(item);
                }
            }
        });


        Dialog dialog1;
        dialog1 = new Dialog(Kids_inoculation.this);
        dialog1.setContentView(R.layout.popup_kidsname);
        WindowManager.LayoutParams params = dialog1.getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.show();
            }
        });

    }


}