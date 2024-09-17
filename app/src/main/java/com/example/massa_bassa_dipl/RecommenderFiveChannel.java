package com.example.massa_bassa_dipl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecommenderFiveChannel extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterFiveChannel adapter;
    private List<AmpsClass> ampsList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of 5 Channel Amplifiers");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        ampsList2 = new ArrayList<>();

        // 5-Channel Amplifiers

        // ESX Signum SXE 1000.5
        ampsList2.add(new AmpsClass("ESX Signum SXE1000.5", R.drawable.esx_signum_sxe1000_5, "22 x 36 x 5.1", "5 Channel", "AB & D Hybrid", "N/A", "0.4V - 8",
                "32 Hz - 300", "32 Hz - 2K", "N/A", "N/A", "200 Watts Max / 75", "350 Watts Max / 125", "500 Watts Max / 200", 279.99,
                "The ESX Signum SXE1000.5 is a high-quality 5-channel amplifier that stands out from the crowd in terms of both design and performance. Visually, it is based on the successful HORIZON HXE series and shows with its solid connection terminals and elegant aluminum end panels that it plays in a higher class. In terms of sound, the ESX Signum SXE1000.5 impresses with NE5532 operational amplifiers in the input section, which ensure the finest resolution across the entire frequency range and guarantee the lowest distortion values. With special features such as an aluminum heat sink with acrylic glass inserts, a flat embedded diamond-cut logo and a compact bass cable remote control, this 5-channel amplifier offers an exceptional music experience.",
                4.3f));

        // Hifonics Zeus ZXS1100/5
        ampsList2.add(new AmpsClass("HIFONICS Zeus ZXS1100/5", R.drawable.hifonics_zxs, "11.2 x 30.5 x 4.4", "5 Channel", "D", "N/A", "N/A",
                "40 Hz - 500", "10 Hz - 500", "N/A", "N/A",
                "\n4 x 100 Watts RMS + 1 x 225",
                "\n4 x 175 Watts RMS + 1 x 400",
                "N/A",
                349.99,
                "All ZXS models, including the Hifonics ZEUS ZXS1100/5 5-channel amplifier, are equipped with adjustable crossovers and the latest features such as automatic switch-on, which are required for connection to modern vehicle electrical systems. The high-level inputs are equipped with advanced EPS to suppress error messages in vehicle diagnostic systems. Low-emission HiFonics IFT digital technology ensures uninterrupted radio reception.",
                4.5f));

        // ZAPCO ST-X Class AB Series - ST-5X II
        ampsList2.add(new AmpsClass("ZAPCO ST-X Class AB Series - ST-5X II", R.drawable.zapco_st_x, "16 x 43.2 x 5.2", "5 Channel", "AB", "95", "0.25V - 5",
                "N/A", "N/A", "100", "7V - 15",
                "\n2 x 300 Watt Max + 1 x 300 Watt Max / 4 x 100 Watts RMS + 1 x 200",
                "\n4 x 150 Watts RMS + 1 x 200",
                "N/A",
                489.99,
                "The Zapco ST-5X III 5-channel amplifier from the ST-X Class AB Series is a powerful Class AB stereo amplifier with 4x 150 watts RMS and 1x 150 watts RMS into 2 ohms. It has both a high level and low level in via RCA. On the front panel you will find crossover settings and a variable bass boost control.",
                4.4f));

        // Audison Voce AV 5.1k HD
        ampsList2.add(new AmpsClass("Audison Voce AV 5.1k HD", R.drawable.audison_voce, "22 x 47 x 5.8", "5 Channel", "AB", "78-80", "N/A",
                "N/A", "N/A", "100", "7V - 15",
                "\n2 x 75 Watts RMS + 2 x 140 Watts RMS  + 1 x 600",
                "\n2 x 75 Watts RMS + 2 x 250 Watts RMS  + 1 x 1000",
                "N/A",
                1089.99,
                "Immerse yourself in the impressive sound world of the Audison Voce AV 5.1k HD, a 5-channel amplifier of the extra class. With a total power of 1650 W, distributed between two 75 W Class A channels, two 250 W Class AB channels and one 1000 W Class D channel, this device offers you a unique combination of technologies. The amplifier is exclusively equipped with digital inputs, which gives you the possibility to connect it directly to the digital outputs of a digital signal processor. Special features such as Hi-Res Audio certification and the ability to create a Full DA HD chain with the bit One HD Virtuoso processor, set the Audison Voce AV 5.1k HD apart from other amplifiers on the market.",
                4.9f));

        adapter = new AdapterFiveChannel(ampsList2);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderFiveChannel.this,
                    AmpMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
