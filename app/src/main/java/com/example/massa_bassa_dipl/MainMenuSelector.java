package com.example.massa_bassa_dipl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainMenuSelector extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pred_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(MainMenuSelector.this,
                    EnterMainPage.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void ChangeFragment(View view) {
        int id = view.getId();
        Intent intent;

        if (id == R.id.PrviSelect) {
            intent = new Intent(this, CalculatorSelection.class);
        } else if (id == R.id.DrugiSelect) {
            intent = new Intent(this, ManualsVideos.class);
        } else if (id == R.id.FrequencySelect) {
            intent = new Intent(this, FrequencyGenerator.class);
        } else if (id == R.id.Recommend) {
                intent = new Intent(this, HelperMenu.class);
        } else if (id == R.id.BuilderHelper) {
            intent = new Intent(this, BuilderHelper.class);
        } else if (id == R.id.thirdselect) {
            intent = new Intent(this, EventsActivity.class);
        } else if (id == R.id.CetvrtiSelect) {
            intent = new Intent(this, AboutApp.class);
        } else {
            // Dodajte dodatnu logiku ako je id nepoznat
            return;
        }

        startActivity(intent);
    }

}