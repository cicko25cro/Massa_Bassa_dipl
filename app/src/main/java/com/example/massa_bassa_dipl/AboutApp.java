package com.example.massa_bassa_dipl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AboutApp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);
        getSupportActionBar().setTitle("About Us");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(AboutApp.this, MainMenuSelector.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}