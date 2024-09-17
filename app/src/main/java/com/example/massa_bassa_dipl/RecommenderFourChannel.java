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

public class RecommenderFourChannel extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterFourChannel adapter;
    private List<AmpsClass> ampsList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of 4 Channel Amplifiers");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        ampsList2 = new ArrayList<>();

        // 4-Channel Amplifiers


        // ESX Signum SXE 150.4
        ampsList2.add(new AmpsClass("ESX Signum SXE 150.4", R.drawable.esx_signum_sxe150_4, "22 x 39 x 5.3", "4 Channel", "AB", "N/A", "N/A",
                "50 Hz - 250", "10 Hz - 250", "N/A", "N/A", "14.4V 4 x 100 Watts RMS \nBridged 2 x 300 Watts RMS\n Max Bridged 2 x 600", "14.4V 4 x 150 Watts RMS \nMax 2 x 300", "N/A", 189.99,
                "The Signum SXE150.4 is a first-class 4-channel amplifier from ESX. This amplifier is characterized by its attractive design, which is reminiscent of the successful HORIZON HXE series and at the same time impresses with its solid connection terminals and the noble aluminium end panels. With high-quality NE5532 operational amplifiers in the input section, the Signum SXE150.4 offers excellent sound quality and extremely low distortion values. Particularly noteworthy are the high-level inputs with automatic switch-on function and the \"Error Protection System\", which guarantees interference-free connection to OEM factory radios. This amplifier is also equipped with bandpass filters.",
                4.5f));

        // Soundigital SD 600.4 EVO5
        ampsList2.add(new AmpsClass("Soundigital SD 600.4 EVO5", R.drawable.sd_600_4_evo5, "11.3 x 13.5 x 5.1", "4 Channel", "D", "88", "0.2 - 2",
                "80", "80", "35", "8V - 16", "14.4V 4 x 150 Watts RMS \nBridged 2 x 300", "14.4V 4 x 150", "N/A", 199.99,
                "The 600.4 EVO5 is an impressive 4-channel amplifier from Soundigital. This compact and modern amplifier delivers an impressive power of 600 W RMS, which can be distributed over 4 channels. It also features exclusive and patented technologies that take the listening experience to a new level in terms of clarity and authenticity. Optimized for 4 ohms, this amplifier is the ideal choice for demanding audio projects where power and efficiency are equally important.",
                4.8f));

        // B2 Audio Rage 1200.4 V2
        ampsList2.add(new AmpsClass("B2 Audio Rage 1200.4 V2", R.drawable.b2_1200_4, "27.8 x 17 x 5.7", "4 Channel", "D", "90", "0.2 - 6",
                "50 Hz ~ 5K", "20 Hz ~ 4K", "100", "9V - 17 ", "14.4V 4 x 200 Watts RMS \nBridged 2 x 600", "14.4V 4 x 300", "N/A", 449.99,
                "Discover the Rage 1200.4 V2, a sophisticated 4-channel amplifier from B2 Audio. This model is part of its new range with a single-sided front panel. Equipped with innovative features previously only found in the M and Zero series, the Rage 1200.4 V2 offers low voltage and clip sensors. The model is characterized by integrated ACCU8 crossovers with bandpass configuration on all channels and thus offers a unique sound experience. The technical details of this device speak for its high performance and versatility.",
                4.4f));

        // Deaf Bonce Machete Fight MFA-4.320
        ampsList2.add(new AmpsClass("Deaf Bonce Machete Fight MFA-4.320", R.drawable.db_4_320, "15.2 x 31.7 x 5.5", "4 Channel", "D", "90", "0.4V - 8",
                "50 Hz - 12K", "50 Hz - 12K", "N/A", "9V - 15", "14.4V 4 x 320 Watts RMS \nBridged 2 x 960", "14.4V 4 x 480", "-||-", 309.99,
                "The Machete Fight MFA-4.320 from Deaf Bonce is an impressive 4-channel amplifier. The class D technology inside guarantees efficient and powerful music reproduction over a wide frequency range of 20-20000 Hz. With an RMS power of up to 480 W x 4 and a minimum load impedance per channel of 2 ohms, precise and powerful music reproduction is possible. Nothing stands in the way of you exploiting the full potential of your sound system. Practical features such as the simultaneous activation of LPF and HPF enable more precise fine-tuning of your music playback. Take a look and discover for yourself the many functions this amplifier has to offer.",
                4.7f));


        adapter = new AdapterFourChannel(ampsList2);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderFourChannel.this,
                    AmpMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
