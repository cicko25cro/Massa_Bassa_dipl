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

public class RecommenderTwoChannel extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterDualChannel adapter;
    private List<AmpsClass> ampsList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of 2 Channel Amplifiers");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        ampsList2 = new ArrayList<>();

        // 2-Channel Amplifiers
// Soundigital SD 400.2 EVO5
        ampsList2.add(new AmpsClass("Soundigital 400.2 EVO5", R.drawable.sd_400_2_evo5, "11.3 x 5.1 x 12.1", "2 Channel", "D", "90", "0.2V - 4",
                "80 Hz On/Off", "80 Hz On/Off", "-||-", "9V - 16", "12.6V 2 x 132 Watts RMS \nBridged 1 x 400 Watts RMS", "12.6V 2 x 200", "-||-", 158.99,
                "Experience the Soundigital 400.2 EVO5, a powerful 2-channel amplifier with an impressive power package of 400 W RMS, distributed over two channels. The amplifier packs state-of-the-art technology into a compact design and offers you top performance and efficiency for your music project. With exclusive and patented features, the 400.2 EVO5 delivers a clean and faithful sound experience. This amplifier is optimized for 4-ohm operation and takes your sound to the next level.", 4.4f));

// Ground Zero GZIA 2.240
        ampsList2.add(new AmpsClass("Ground Zero GZIA 2.240", R.drawable.gzia_2_240, "19.2 x 28.4 x 4.9", "2 Channel", "AB", "-||-", "-||-",
                "-||-", "-||-", "-||-", "-||-", "2 x 150 Watts RMS \nBridged 1 x 480", "2 x 240", "-||-", 199.99,
                "Experience the Iridium GZIA 2.240 from Ground Zero, a 2-channel amplifier that stands out with a range of attractive features. This amplifier uses Class A/B technology for optimum performance and stable power supply operation. It offers a variable active crossover and a bass boost that can be individually adjusted. Its connections are generously dimensioned and its heat sink is black anodized, rounded off with the Ground Zero logo. With an output power of 2x 150 watts RMS at 4Ω and 2x 240 watts RMS at 2Ω, it shows clear power. It also has an auto-on function for the high-level input.",
                4.5f));

// Deaf Bonce Apocalypse ASA 1000.2
        ampsList2.add(new AmpsClass("Deaf Bonce Apocalypse ASA-1000.2", R.drawable.db_asa2000, "24 x 33 x 6.35", "2 Channel", "D", "91", "0.2 - 6",
                "-||-", "-||-", "-||-", "9V - 15", "14.4V 2 x 410 Watts RMS \nBridged 1 x 1360", "14.4V 2 x 680 Watts RMS \nBridged 1 x 2060", "14.4V 2 x 1000", 369.99,
                "The Apocalypse ASA-1000.2 is a masterful 2-channel amplifier, a flagship product from the renowned manufacturer Deaf Bonce. With its remarkable frequency range of 10 - 20,000 Hz and powerful RMS values, this class D amplifier offers more than just amplification. From its simultaneous LPF and HPF switching to its impressive attenuation factor and excellent signal-to-noise ratio, the ASA-1000.2 represents the marriage of power and clarity. With a wealth of accessories, including amplifier, remote control and mounting kit, this amplifier is ready to take your audio performance to the next level.",
                4.3f));

// Soundigital SD 2000.2 EVO5
        ampsList2.add(new AmpsClass("Soundigital SD 2000.2 EVO5", R.drawable.sd_2000_2_evo5, "13.6 x 22.7 x 5.5", "2 Channel, 2 or 4 ohm version", "D", "90", "-||-",
                "80Hz On/Off ", "80Hz On/Off ", "100", "8V - 16",
                "2 ohm version: 2 x 436 Watts RMS \nBridged 1 x 1320 Watts RMS \n4 ohm version: 2 X 660 Watts RMS \nBridged 1 x 2000",
                "2 ohm version: 2 x 660 Watts RMS \nBridged 1 x 2000 Watts RMS \n4 ohm version: 2 X 1000 Watts RMS \nBridged N/A",
                "2 ohm version: 2 x 1000 Watts RMS \nBridged N/A \n4 ohm version: N/A", 539.99,
                "The 2000.2 EVO5 from Soundigital is a 2-channel amplifier in a class of its own. The special technology of this amplifier ensures outstanding performance in both the 4 Ohm and 2 Ohm versions. With its wide operating voltage range and efficient power consumption, combined with high efficiency, it delivers impressive audio output. Special features include flexibility in power output at different ohm settings and bridging capabilities. With dimensions of 13.6 cm x 22.7 cm x 5.5 cm and a weight of 1.54 kg, the 2000.2 EVO5 packs a lot of power into a compact format.",
                4.7f));

        adapter = new AdapterDualChannel(ampsList2);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderTwoChannel.this,
                    AmpMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
