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

public class RecommenderSpeaker extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterSpeaker adapter2;
    private List<SubsSpeakersClass> subsSpeakersClassList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of Loudspeakers");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        subsSpeakersClassList2 = new ArrayList<>();

        //4 - 6.5 inch loudspeakers

        //4 - Best up to 30rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("Dayton Audio Reference RS100", R.drawable.e150he, "4 inch / 10 cm", 30, 60, "SVC -> 4 ohm",47.99,
                "The Dayton Audio Reference RS100 is a 4-inch midrange speaker characterized by its compact size and outstanding sound quality. This versatile loudspeaker enables a wide reproduction of the low to high frequency range thanks to its full-range system. Equipped with a low-distortion motor system, it offers a clear and crisp sound, while its long-excursion motor and low-loss rubber surround guarantee incredible bass performance.",
                4.35f));

        //4 - Best up to 60rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("HIFONICS Zeus ZSW-4 inch", R.drawable.hifonics, "4 inch / 10 cm", 60, 120, "SVC -> 4 ohm",69.99,
                "In the style of the high quality ZX loudspeakers, theHiFonics now offers as an attractively priced complementary series the ZEUS ZS models, to which the Hifonics ZEUS ZSW-4 4\" (10cm) midrange driver belongs, with steel baskets. These also feature the elaborately constructed Honeycomb sandwich cone made of a special glass-fiber-paper composite mix, which delivers optimal sonic results.",
                4f));

        //5 - Best up to 80rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("Deaf Bonce Machete MM-50L", R.drawable.machete, "5 inch / 13 cm", 80, 160, "SVC -> 4 ohm",59.99,
                "Discover the MM-50L Machete, a robust 5\" (13cm) midrange driver from Deaf Bonce. With an impressive power output of RMS 80W and a maximum output of 160W, this technically advanced model has been designed to deliver a frequency range of 120Hz - 16000Hz. The midrange driver features a pressed paper cone, a ferrite magnet material and a 1.00 inch voice coil to ensure the best possible sound quality.",
                4.35f));

        //5 - Best up to 200rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("Dayton Audio Epique E150HE-44", R.drawable.e150he, "5 inch / 13 cm", 200, 400, "DVC -> 2x4 ohm",135.99,
                "The Epique E150HE-44 is a sophisticated 5\" (13cm) bass-midrange driver from Dayton Audio. This innovative mid-bass driver is renowned for its outstanding performance characteristics thanks to its revolutionary MMAG dual-gap motor, carbon fiber cone and maximum excursion of 14mm. " +
                        "Thanks to comprehensive inductance control and remarkable ventilation, the Epique E150HE-44 delivers smooth reproduction with minimal distortion, even when driven to its limits. " +
                        "With its impressive versatility, you are able to develop highly accurate and faithful sounding systems, making it one of the leading concepts on the market for 5\" midbass drivers.",
                4.5f));

        //6.5 - Best up to 150rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("Deaf Bonce Apocalypse AP-M61 SE", R.drawable.ap_m61, "6.5 inch / 16.5 cm", 130,260, "SVC -> 4 ohm",109.99,
                "Discover the Apocalypse AP-M61 SE, a highly effective 6.5\" (16.5cm) bass-midrange driver from the manufacturer Deaf Bonce. This bass-midrange driver scores particularly well with its low cut-off frequency, which makes it the ideal partner for midrange drivers. Thanks to a patented ribbed construction, the cone is extra-stiffened within the paper cone, a special feature that ensures excellent sound quality even under maximum load. A bass-midrange driver that is clearly designed for excellent performance.",
                4.75f));

        //6.5 - Best up to 300rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("Deaf Bonce Apocalypse AP-M67AC", R.drawable.m67ac, "6.5 inch / 16.5 cm", 300,600, "SVC -> 4 ohm",159.99,
                "The Deaf Bonce AP-M67AC 6.5\" (16.5cm) woofer features the new ribbed and star-shaped paper cone structure of Deaf Bonce's AC Series, which increases cone stiffness and matches the increased magnetic force of the powerful ferrite magnet. The diaphragm is driven by a 1.75 inch voice coil, allowing for 300 watts RMS.",
                4.75f));

        //8 - 10 inch loudspeakers

        //8 - Best up to 150Wrms
        subsSpeakersClassList2.add(new SubsSpeakersClass("DD Audio VO-W8b", R.drawable.w8b, "8 inch / 20 cm", 150, 450, "SVC - 4 ohm",119.99,
                "The DD Audio VO-W8b is an 8\" (20cm) bass-midrange speaker in a class of its own. As part of the renowned VO series (Voice Optimized), this speaker impresses with its high efficiency and performance, combined with a low weight and compact installation dimensions. The ferrite-driven high-performance loudspeaker stands out due to its higher level in the low and mid-frequency range, allowing it to easily overcome ambient noise. The VO-W8b offers you added flexibility thanks to its convertibility to a high-performance coaxial loudspeaker. With the optional addition of CT-25 high frequency drivers and the VO-CTAL8 installation, you can enjoy powerful, high-quality sound.",
                4.4f));

        //8 - Best up to 300Wrms
        subsSpeakersClassList2.add(new SubsSpeakersClass("B2 Audio Riot 8P", R.drawable.b2_riot_8p, "8 inch / 20 cm", 150, 300, "SVC - 4 ohm",119.99,
                "The Riot 8P from B2 Audio is a high quality 8\" (20cm) bass-midrange driver with an impressive sound quality. As a cost-effective pro audio solution, it is characterized by its biting, clear and loud reproduction and is based on the sound of the original HN8P. B2 Audio also delivers a surprise with the UV-treated cone, which ensures both water resistance and color stability outdoors. In addition, customers will experience something very special with the new black themed gift box including a detailed manual and an exclusive B2 sticker.",
                4.5f));

        //10 - Best up to 500rms
        subsSpeakersClassList2.add(new SubsSpeakersClass("DD Audio VO-W10a", R.drawable.w10a, "10 inch / 25 cm", 300,900, "SVC - 4 ohm (D4) ",159.99,
                "The VO-W10a is a 10\" (25cm) bass-midrange driver from DD Audio. This high-quality device combines elements of pro audio and high-end car audio to deliver optimized sound quality and high performance. Equipped with large diameter voice coils and high energy motors in a cast frame, the VO-W10a guarantees not only powerful but also clean sound. Particularly exciting is the option to connect the matching CT-25 or CT-45 high frequency drivers to turn the compact unit into an ultra-powerful 10\" coaxial speaker. An efficient, lightweight device with outstanding performance, that's the VO-W10a from DD Audio.",
                5.0f));

            adapter2 = new AdapterSpeaker(subsSpeakersClassList2);
        recyclerView.setAdapter(adapter2);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderSpeaker.this,
                    HelperMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
