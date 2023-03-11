
package com.example.vision4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    //public static DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dbHandler = new DBHandler(MainActivity.this);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);


    }

    ShowFragment homeFragment = new ShowFragment();
    SubFragment subFragment = new SubFragment();

    FolderFragment folderFragment = new FolderFragment();
    HistoryFragment historyFragment = new HistoryFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                return true;

            case R.id.sub:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, subFragment).commit();
                return true;

            case R.id.downloads:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, folderFragment).commit();
                return true;

            case R.id.history:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, historyFragment).commit();
                return true;
        }

        return false;
    }
}