package com.example.massa_bassa_dipl;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HelperMenu extends AppCompatActivity {
    private Button FirstButtonSelection;
    private Button SecondButtonSelection;
    private Button ThirdButtonSelection;
    private Button FourthButtonSelection;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(HelperMenu.this,
                    MainMenuSelector.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_pod_menu);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        FirstButtonSelection = (Button)findViewById(R.id.FirstButtonSelection);
        SecondButtonSelection = (Button)findViewById(R.id.SecondButtonSelection);
        ThirdButtonSelection = (Button)findViewById(R.id.ThirdButtonSelection);
        FourthButtonSelection = (Button)findViewById(R.id.FourthButtonSelection);
        FirstButtonSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
        SecondButtonSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ThirdButtonSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        FourthButtonSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        getSupportActionBar().setTitle("Best of 2025");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void openActivity(){
        Intent intent = new Intent(this,
                RecommenderSub.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this,
                AmpMenu.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,
                RecommenderSpeaker.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this,
                RecommenderCompCoax.class);
        startActivity(intent);
    }
    public void ChangeFragment(View view){
        Fragment fragment;
        if (view == findViewById(R.id.FirstButtonSelection)){
            fragment = new Menu_Fragment_AmpPowerCalculator();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.SecondButtonSelection)){
            fragment = new Menu_Fragment_MidsAndHighsCalculator();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.ThirdButtonSelection)){
            fragment = new Menu_Fragment_MidsAndHighsCalculator();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.FourthButtonSelection)){
            fragment = new Menu_Fragment_MidsAndHighsCalculator();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
    }
}