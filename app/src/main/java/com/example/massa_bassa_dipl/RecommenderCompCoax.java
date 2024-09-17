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

public class RecommenderCompCoax extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterComponentsCoax adapter;
    private List<SubsSpeakersClass> subsSpeakersClassList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of Component and Coaxial");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        subsSpeakersClassList2 = new ArrayList<>();


        // Speaker Setovi

        // Vibe Audio Slick 5C-V7 - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Vibe Audio Slick 5C-V7", R.drawable.bibe_5c_v7, "5.25 inch / 13.3 cm", 80, 240, "4 ohm", 89.99,
                "The MILLE PRO MPK 130.3 from Hertz is a high-quality 5\" (13 cm) speaker set designed to deliver a wide and deep frequency spectrum, even in cars without an additional subwoofer. Using technologies such as V-cone® and Boundary Free Surround, the MP 130.3 woofers offer strong dispersion characteristics and achieve high SPL levels in compact dimensions. The dedicated MPCX 2.3 crossover ensures a seamless transition to the MP 25.3 tweeter, guaranteeing maximum natural sound emission. The speaker set impresses with its efficiency and the ability to adjust the tweeter level for sound emission calibration.",
                4.4f));

        // Hertz Mille Pro MPK 130.3 - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Hertz Mille Pro MPK 130.3", R.drawable.mpk_130, "5.25 inch / 13.3 cm", 100, 200, "4 ohm", 259.99,
                "The MILLE PRO MPK 130.3 from Hertz is a high-quality 5\" (13 cm) speaker set designed to deliver a wide and deep frequency spectrum, even in cars without an additional subwoofer. Using technologies such as V-cone® and Boundary Free Surround, the MP 130.3 woofers offer strong dispersion characteristics and achieve high SPL levels in compact dimensions. The dedicated MPCX 2.3 crossover ensures a seamless transition to the MP 25.3 tweeter, guaranteeing maximum natural sound emission. The speaker set impresses with its efficiency and the ability to adjust the tweeter level for sound emission calibration.",
                4.7f));

        // Ground Zero Iridium GZIC 165.2 - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Ground Zero Iridium GZIC 165.2", R.drawable.gzic_165, "6.5 inch / 16.5 cm", 100, 150, "4 ohm", 109.99,
                "The Ground Zero IRIDIUM GZIC 165.2 speaker set brings a rich and high-quality sound into your home or car. With its size of 6.5\" (16.5cm) it fits perfectly into any standard installation space. As a 2-way component system and with a 19 mm silk dome tweeter, it delivers impressive audio performance. The HQPP cone with 3D structure and the cast aluminum basket guarantee a high sound standard and stability. Thanks to the low-resonance steel basket structure and the universal 4 Ohm design, this set offers versatile installation options and compatibility. The equipment is complemented by the included hexagon protective grille for additional protection.",
                4.9f));

        // Audison Slick6C-V7 - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Audison Slick6C-V7", R.drawable.vibe_6c_v7, "6.5 inch / 16.5 cm", 90, 270, "4 ohm", 359.99,
                "Experience the Slick 6C-V7 from Vibe Audio, a 6.5\" (16.5cm) speaker set that takes your audio experience to the next level. Highlighted by an extended bandwidth and high efficiency, it also offers a range of tweeters that produce excellent sound. The special feature is the unique upgrade it represents for factory speaker systems. Equipped with key features such as a super-lightweight woofer and a balanced voice coil, this speaker set stands out in its class.",
                4.3f));

        // ESX QXE8.2C - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("ESX QXE8.2C", R.drawable.qxe_8, "8 inch / 20 cm", 125, 250, "4 ohm", 329.99,
                "The QXE8.2C is an innovative 8 inch (20cm) speaker set from ESX. Unlike conventional 16.5 cm bass speakers, this model has a diameter of 20 cm, which enables a significantly improved sound experience. It is compatible with standard 20 cm adapters and can therefore be easily integrated into various vehicle models. Thanks to the neodymium drive and an installation depth of just 57 mm, the speaker set is characterized by its easy handling. The technical profile is rounded off by a 25 mm fabric neodymium tweeter, which ensures sound quality well above 24,000 Hz. Another plus point is the inline crossover specially optimized for this system. With this, ESX has developed a speaker set in a class of its own, aimed at efficient signal processing.",
                4.4f));

        // Ground Zero Competition GZCC 200COAX - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Ground Zero Competition GZCC 200COAX", R.drawable.gzcc_200, "8 inch / 20 cm", 200, 380, "4 ohm", 399.99,
                "Discover the powerful Ground Zero speaker set \"Competition GZCC 200.2SQL\". With a diameter of 8 inches (20 cm), this 2-way component speaker system offers remarkable special features. Fiber-reinforced paper cone, long-throw foam W surround and a CCA voice coil are among the main features. The set also demonstrates its quality with a low-resonance steel basket and a heavy-duty 4 Ohm design. Last but not least, it offers unique extras such as an SPL crossover with double-woofer option and an included protective grille.",
                4.5f));


        // Coaxial zvučnici

        // JBL Stage3 527 - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("JBL Stage3 527", R.drawable.stage3_527, "5.25 inch / 13.3 cm", 40, 200, "4 ohm", 59.99,
                "Immerse yourself in the world of top sound performance with the STAGE3 527 from the popular JBL brand. These remarkable 5\" (13cm) coaxial speakers combine patented technologies and premium engineering for an unparalleled listening experience in your vehicle. With a focus on performance and fit, they deliver solid low bass and high output. Highlights include the patented Plus One™ woofer cones, which provide increased cone area and overall efficiency, and the dome tweeters, which provide a wider and smoother high frequency response. Whether you're planning an upgrade to your existing system or a complete overhaul, these speakers promise a unique sound experience.",
                4.3f));

        // Ground Zero Radioactive GZRF 5.2SQ (Coaxial) - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Ground Zero Radioactive GZRF 5.2SQ", R.drawable.gzrf_5_2, "5.25 inch / 13.3 cm", 80, 120, "4 ohm", 99.99,
                "Discover the Radioactive GZRF 5.2SQ, a high quality 5\" (13cm) coaxial speaker system from Ground Zero. This 2-way coaxial speaker system features an aluminum cone, rubber surround, Nomex spider and a low-resonance steel basket. The 13 mm PEI tweeter with integrated tweeter and overload protection ensures excellent sound. Another plus point is the highly efficient 3 Ohm design. A protective grille and a crossover (capacitor) for the tweeter are included. Prepare yourself for an incomparable sound experience.",
                4.5f));

        // Ground Zero Radioactive GZRF 6.5SQ - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Ground Zero Radioactive GZRF 6.5SQ", R.drawable.gzrf_6_5, "6.5 inch / 16.5 cm", 100, 140, "4 ohm", 119.99,
                "The Radioactive GZRF 6.5SQ is a 2-way coaxial speaker system from Ground Zero. This 16.5 cm coaxial speaker model asserts itself with features such as an aluminum cone, rubber surround and a Nomex spider. The low-resonance steel basket paired with a highly efficient 3 Ohm design guarantees you an outstanding listening experience. The system is protected by a tweeter and overload protection as well as an included protective grille. The sound is specifically tuned by a crossover supplied for the 25 mm silk dome tweeter.",
                4f));

        // Hertz SPL Show SX 165 NEO - DONE
        subsSpeakersClassList2.add(new SubsSpeakersClass("Hertz SPL Show SX 165 NEO", R.drawable.sx_165, "6.5 inch / 16.5 cm", 100, 200, "4 ohm", 199.99,
                "Immerse yourself in the world of the Hertz SPL SHOW SX 165 Neo, a 6.5\" (16.5cm) coax type loudspeaker that has plenty of technical refinements to offer. The speaker is made of natural, UV- and moisture-resistant pressed paper, which not only ensures maximum durability but also first-class acoustic performance. With features such as a double-layer copper voice coil wound on a polyamide former and a special N38 H neodymium magnet, this speaker offers unparalleled power handling and high performance with minimal volume. The SX 165 NEO also scores with a Hi-SPL 1.4-inch PEI dome tweeter with resettable short-circuit protection. All in all, this speaker from Hertz radiates a safe, powerful and high-quality performance.",
                4.9f));

        // DD Audio VO-XN8
        subsSpeakersClassList2.add(new SubsSpeakersClass("DD Audio VO-XN8", R.drawable.xn8, "8 inch / 20 cm", 75, 300, "4 ohm", 269.99,
                "Discover the DD Audio VO-XN8, a powerful 8\" (20cm) coaxial loudspeaker from the VO series. This particular model series is specialized in optimal voice reproduction and impresses with its efficiency and high performance while at the same time reducing weight and compact installation dimensions. Equipped with neodymium magnet mids and tweeters, it delivers an outstanding level at medium and high frequencies to counteract ambient noise without any worries. Whether for motorcycle, boat or bass demo vehicle - the VO-XN8 is the perfect solution for versatile application scenarios.",
                4.2f));

        // B2 Audio Rage 8CXP
        subsSpeakersClassList2.add(new SubsSpeakersClass("B2 Audio Rage 8CXP", R.drawable.rage_8xcp, "8 inch / 20 cm", 250, 500, "4 ohm", 249.99,
                "Discover the RAGE 8CXP, an innovative and high-quality 8\" (20cm) coaxial loudspeaker from B2 Audio. The RAGE 8CXP impresses with its unique design and outstanding specifications, including a heavy 8\" mid-woofer and a compression driver that extends the frequency response up to 20 kHz. With an efficiency of 98 dB and a power handling capacity of 250 W RMS, the speaker is extremely robust and durable. Its compact size makes it ideal for audio setups where space is at a premium. With the RAGE 8CXP you can expect a clear and powerful sound.",
                4.6f));

        adapter = new AdapterComponentsCoax(subsSpeakersClassList2);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderCompCoax.this,
                    HelperMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
