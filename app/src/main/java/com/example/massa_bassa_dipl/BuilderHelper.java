package com.example.massa_bassa_dipl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class BuilderHelper extends AppCompatActivity {

    private Spinner itemSpinner;
    private String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_helper);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Builder Helper");

        itemSpinner = findViewById(R.id.itemSpinner);

        // Definiranje stavki za spinner
        items = new String[]{"Select an item", "How to build an enclosure?", "How to tune your amplifier?", "How to install your car speakers?", "How to wire a car stereo?"};

        // Adapter za spinner
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, R.layout.custom_spinner_item, items);
        spinnerAdapter.setDropDownViewResource(R.layout.custom_spinner_item);
        itemSpinner.setAdapter(spinnerAdapter);

        // Postavljanje listener-a za Spinner
        itemSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) { // Preskače "Select an item"
                    Intent intent = new Intent(BuilderHelper.this, StepsActivity.class);
                    intent.putExtra("item", items[position]);
                    intent.putExtra("itemPosition", position);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Nije selektovan ni jedan item
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        itemSpinner.setSelection(0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
