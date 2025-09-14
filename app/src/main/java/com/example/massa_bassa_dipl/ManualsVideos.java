package com.example.massa_bassa_dipl;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ManualsVideos extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ManualsVideosAdapter manualsVideosAdapter;
    private List<ManualVideoItem> manualVideoList;
    private List<ManualVideoItem> filteredList;
    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manuals_videos);

        recyclerView = findViewById(R.id.recyclerView);
        searchEditText = findViewById(R.id.searchEditText);
        searchEditText.setTextColor(Color.BLACK);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Manuals and Videos");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        manualVideoList = new ArrayList<>();
        filteredList = new ArrayList<>();

        // ➡️ Ovdje samo mijenjaš drawable slike (slika1, slika2...) po redu
        manualVideoList.add(new ManualVideoItem("Webpage - Car Audio Fabrication", "CAF Webpage - tutorials, how-to, lessons and more!", "https://www.caraudiofabrication.com/learn", R.drawable.caf));
        manualVideoList.add(new ManualVideoItem("Webpage - Crutchfield", "Online retailer and resource for consumer electronics.", "https://www.crutchfield.com/S54FGDVg7qMl/", R.drawable.crutchfield));
        manualVideoList.add(new ManualVideoItem("Webpage - Masori", "Europe's Largest Carhifi Shop - Masori", "https://masori.de/en", R.drawable.masori));
        manualVideoList.add(new ManualVideoItem("Video - Wiring a Car Stereo", "Beginner friendly wiring tutorial.", "https://www.youtube.com/watch?v=72Tmq8S71F0", R.drawable.wiring_car_stereo));
        manualVideoList.add(new ManualVideoItem("Video - How to install an amp and sub?", "Tools and best practices.", "https://www.youtube.com/watch?v=eidK7FNI0GA", R.drawable.install_amp_sub));
        manualVideoList.add(new ManualVideoItem("Video - Avoid 5 common Car Audio mistakes", "Tips for better installs.", "https://www.youtube.com/watch?v=1FTsmUCbvoM", R.drawable.caf_mistakes));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - EXOcontralto", "Bass builds, advice and more!", "https://www.youtube.com/@EXOcontralto", R.drawable.exocontralto));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - LIFEOFPRICE", "Competitions, webshop, bass vids!", "https://www.youtube.com/@THELIFEOFPRICE", R.drawable.thelifeofprice));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - meade916", "Customization and builds.", "https://www.youtube.com/@meade916", R.drawable.meade916));

        filteredList.addAll(manualVideoList);

        manualsVideosAdapter = new ManualsVideosAdapter(filteredList);
        recyclerView.setAdapter(manualsVideosAdapter);

        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override public void afterTextChanged(Editable s) {
                filterItems(s.toString());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void filterItems(String query) {
        filteredList.clear();
        for (ManualVideoItem item : manualVideoList) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase())
                    || item.getDescription().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        manualsVideosAdapter.notifyDataSetChanged();
    }
}
