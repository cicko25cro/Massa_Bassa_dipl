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

public class RecommenderMonoblock extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMonoblockAmp adapter;
    private List<AmpsClass> ampsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of Monoblock Amps");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        ampsList = new ArrayList<>();

        ampsList.add(new AmpsClass("Soundigital SD 800.1 EVO5", R.drawable.sd_800_1, "11.3 x 14.8 x 5.1", "Monoblock, 2 or 4 ohm version", "D",
                "93", "0.2 - 4", "50Hz ~ 1000", "5 Hz ~ 80 ", "40", "8V ~ 16", "\n2 ohm - 528 Watts RMS \n4 ohm - 800", "\n2 ohm - 800", "\nN/A", 239.99,
                "The 800.1 EVO5 from Soundigital is a 1-channel amplifier that is characterized by its compact size and modern technologies. With an output of 800 W RMS, it offers a clean, true-to-the-original sound experience and impresses with its efficiency. Whether for simple or bold projects, the 800.1 EVO5 amplifier is optimized for operation at 4 ohms and 2 ohms, making it a versatile tool for audiophiles.\n" +
                        "\n", 4.7f));

        // Deaf Bonce Apocalypse Atom 2000 Pro
        ampsList.add(new AmpsClass("Deaf Bonce Apocalypse Atom 2000 Pro", R.drawable.atom_2000, "14 x 27 x 54", "Monoblock", "D",
                "87", "0.2V - 6", "40Hz - 250", "10 Hz - 50", "N/A ", "14.4", "1280", "2000", "\n12.6V - 1810 Watts RMS  \n14.4V - 2000", 279.99,
                "Discover the Apocalypse Atom 2000 PRO, a 1-channel amplifier from the Deaf Bonce brand. This class D amplifier is characterized by its extensive specifications - with a frequency range of 10 - 250 Hz and an impressive RMS power of 2000W RMS @1 Ohm. The special features of the model are the low-pass filter, the high-pass filter and, of course, its incredible power. With its handy dimensions, extensive features and impressive signal-to-noise ratio, the Apocalypse Atom 2000 PRO is a robust choice for anyone looking for quality and performance.",
                4.9f));

        ampsList.add(new AmpsClass("Stetsom EX3000 Black Edition", R.drawable.stesom_3000, "35 x 25 x 15", "Monoblock, 1, 2 or 4 ohm version", "D",
                "> 90", "200", "10Hz ~ 20K", "10Hz ~ 700", "N/A ", "9V ~ 16", "\n1 ohm - N/A  \n2 ohm - 12.6V 2000 Watts RMS - 14.4V 2500 Watts RMS \n4 ohm - 12.6V 3000 Watts RMS - 14.4V 3500", "\n1 ohm: 12.6V 2000 Watts RMS - 14.4V 2100 Watts RMS \n2 ohm: 12.6V 3000 Watts RMS - 14.4V 3700 Watts RMS \n4 ohm: N/A", "N/A ", 374.99,
                "The EX 3000 Black Edition is a 1-channel amplifier from Stetsom, a world-renowned manufacturer of audio technology. The EX series delivers powerful amplification at an affordable price and is fit for purpose for the universal bass range. Their excellent fidelity and innovative electronics make them the ideal choice for users looking for high quality in car amplifiers. This special edition is made in Brazil and is one of Stetsom's top products. It is an ideal product for those who are looking for an amplifier with four different connections, an optimal frequency output and a high current capacity. Make your music experience unique with the Stetsom EX 3000 Black Edition.", 4.6f));

        // Deaf Bonce Apocalypse Atom 5.5K Pro
        ampsList.add(new AmpsClass("Deaf Bonce Apocalypse Atom 5.5K Pro", R.drawable.db_pro, "22 x 28.9 x 66 ", "Monoblock", "D",
                "82", "0.2V - 6", "40 Hz - 250", "10 Hz - 500", "N/A ", "9V - 15 ", "1710", "2850", "12V - 3900 Watts RMS \n14.4V - 5500", 749.99,
                "Discover the Apocalypse Atom 5.5K Pro from Deaf Bonce. This 1-channel amplifier will take your sound output to the next level. Known for its high performance and versatility, the Atom 5.5K Pro offers balanced frequencies from 10 to 250 Hz. It impresses with an RMS power of up to 5500 W at 1 Ohm and an input sensitivity of 0.2 to 6 V. Whether high-pass filter or low-pass filter, the customization options are enormous. The Deaf Bonce Atom 5.5K Pro is more than just a simple amplifier - it is your partner for an impressive audio experience.",
                4.3f));

        ampsList.add(new AmpsClass("B2 Audio Riot 7500V2", R.drawable.b2_riot_7500v2, "30 x 20 x 10", "Monoblock", "D",
                "95", "0.2 - 4", "80 Hz ~ 20K", "15 Hz ~ 500 ", "600", "9V ~ 17", "3000", "5500", "8500", 899.99,
                "The Riot 7500V2 from B2 Audio is a high-performance monoblock amplifier designed to deliver powerful and clean sound. With a power output of 7500 watts RMS at 1 ohm, this amplifier is capable of driving even the most demanding subwoofer setups. It features a sleek design and advanced cooling system to ensure reliable performance even under heavy load.", 4.8f));

        // DD Audio M8000
        ampsList.add(new AmpsClass("Digital Designs M8000", R.drawable.m8000, "45 x 23 x 66", "Monoblock", "D",
                " 92", "0.2 - 8", "10 Hz - 50 ", "N/A " , "N/A " , "9 - 16", "3000", "5000", "8000", 1999.99,"The M8000 is a 1-channel amplifier from DD Audio. This part of the innovative M-Series utilizes the latest semiconductor technology and state-of-the-art amplifier design to bring you unprecedented compactness and power density. It defies even the most demanding listening sessions with its robust design, multiple power and ground inputs and high-quality internal components. In addition, the M8000 features a convenient bass remote control that allows real-time level adjustment and monitoring of the amplifier's input voltage. Experience the difference with the DD Audio M8000!",
                5f));

        // Soundigital SD 12000.1 EVOX2
        ampsList.add(new AmpsClass("Soundigital SD 12000.1 EVOX2", R.drawable.sd_12k, "53 x 22.5 x 7.1", "Monoblock, 1 or 2 ohm version", "D",
                "76", "N/A ", "5 Hz - 30 ", "50 Hz - 500", "675 ", "8V - 16", "\n2 Ohm version: 12.6V - 7920 Watts RMS, 14.4V - 8831 Watts RMS \n1 Ohm version: 12.6V - 5227 Watts RMS, 14.4V - 5828 Watts RMS", "\n2 Ohm version: 12.6V - 12000 Watts RMS, 14.4V - 13380 Watts RMS \n1 Ohm version: 12.6V - 7920 Watts RMS, 14.4V - 8831 Watts RMS", "\n2 Ohm version: N/A \n1 Ohm version: 12.6V - 12000 Watts RMS, 14.4V - 13380 Watts RMS", 1599.99,
                "The 12000.1 EVOX is an advanced 1-channel amplifier from Soundigital. This device leads the company's EVOX series and relies on ground-breaking technologies to deliver its impressive performance. Improvements in the RTGP system allow for greater efficiency, and a dynamic heat dissipation system ensures an improved heat exchange rate. With the added benefit of a unique vibration damping device, the 12000.1 EVOX offers a reliable and durable solution that meets the highest demands.",
                4.7f));

        // Soundigital SD 20000.1 EVOX
        ampsList.add(new AmpsClass("Soundigital SD 20000.1 EVOX", R.drawable.sd_20k, "86.3 x 22.5 x 7.1", "Monoblock", "D",
                "76", "N/A ", "5 Hz - 30 ", "50 Hz - 500", "1200", "8V - 16", "\n12.6V - 8712 Watts RMS, 14.4V - 9714", "\n12.6V - 13200 Watts RMS, 14.4V - 14718", "\n12.6V - 20000 Watts RMS, 14.4V - 22300", 2999.99,
                "The 20000.1 EVOX is a powerful model from Soundigital that stands out as a top contender in terms of amplifier performance. As part of the EVOX series, this unit utilizes groundbreaking technology to deliver high performance with outstanding quality in a compact design. In addition, the 1-channel amplifier is characterized by unique features such as thermal coupling through the RTGS system, Dynamic Heat Dissipation, Dynamic Heat Recovery - DTR, as well as a special vibration damping device. Thanks to this technology, this model is able to ensure long-lasting operating times with minimal distortion while increasing the service life of the appliance",
                4.5f));


        adapter = new AdapterMonoblockAmp(ampsList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderMonoblock.this, AmpMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
