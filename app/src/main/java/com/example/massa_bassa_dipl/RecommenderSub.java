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

public class RecommenderSub extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterSub adapter;
    private List<SubsSpeakersClass> subsSpeakersClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommender);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Best of Subwoofers");
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize product list with sample data
        subsSpeakersClassList = new ArrayList<>();

        //8 - Best up to 500rms

        subsSpeakersClassList.add(new SubsSpeakersClass("B2 Audio Rage 8 V2", R.drawable.rage_v8, "8 inch / 20 cm", 500, 1000, "DVC -> 2x2 ohm (D2) / 2x4 ohm (D4)",169.99,
                "Discover the Rage 8 V2 - a special 8\" (20cm) subwoofer from B2 Audio. As part of the new RAGE series, this model has a lot to offer. Version 2 comes with a significantly reinforced drive unit and a carbon dustcap, resulting in a lower resonance frequency. With its impressive design and powerful functions, it sets new standards on the market. The Rage 8 V2 is one of the most powerful and attractive 8\" subwoofers. Its frequency response ranges from 10 Hz to 500 Hz and it has a power handling capacity of 500 watts, which makes it particularly efficient.",
                4.35f));

        //8 - Best up to 1000rms
        subsSpeakersClassList.add(new SubsSpeakersClass("B2 Audio Rampage 8 V2 Carbon", R.drawable.rampage_8_v2, "8 inch / 20 cm", 1000,2000, "DVC -> 2x1 ohm (D1) / 2x2 ohm (D2)",339.99,
                "Discover the B2 Audio Rampage 8 V2 Carbon, an 8\" (20cm) subwoofer that has entered a new generation and offers numerous improvements. This model features a red spider, a new basket design and a more powerful drive unit. It also shines with its carbon cone in a glossy look. And not to forget, the power of this model has been significantly increased to 1000 watts RMS, which is a significant increase over the previous 750 watts RMS.",
                4.75f));

        //10

        //10 - Best up to 300W
        subsSpeakersClassList.add(new SubsSpeakersClass("JL Audio 10W0V3-4", R.drawable.jl_10w0v3, "10 inch / 25 cm", 75, 300, "SVC - 4 ohm",145.99,
                "The 10W0V3-4 subwoofer from JL Audio is one of the top sellers in its class and offers a range of outstanding features. As a 10\" (25cm) subwoofer with an impressive 300W @ 4 Ohm, it shines with excellent excursion and linearity. Its powerful 2-inch voice coil and patented Elevated Frame Cooling design ensure improved power handling and reliability. It benefits optimally from amplifier outputs in the 75W - 300W range and is designed for use in both compact, sealed enclosures and bass reflex cabinets. The 10W0V3-4 thus sets the benchmark for the performance that can be expected in this price range.",
                4.2f));

        //10 - Best up to 500rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Hertz Mille Pro MPS 250 S4/S2", R.drawable.hertz_mille_pro_mps250, "10 inch / 25 cm", 500,100, "SVC - 4 ohm (D4) / 2 ohm (D2) ",319.99,
                "The MILLE PRO MPS 250 S4/S2, manufactured by renowned audio manufacturer Hertz, is a 10\" (25cm) subwoofer known for its impressive performance despite its flat design. This subwoofer is optimized for use in ultra-compact, closed cabinets and offers exceptional performance despite limited space. Its special design allows it to achieve high performance even in difficult installation conditions, such as under the back seat of pickup trucks. With a cone excursion capacity that is 20% higher than conventional designs, this subwoofer offers a bass/power ratio that is second to none.",
                5.0f));

        //10 - Best up to 1200rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Digital Designs 710 D2/D4", R.drawable.dd_710d, "10 inch / 25 cm", 1200,3600, "DVC -> 2x2 ohm (D2) / 2x4 ohm (D4) ",309.99,
                "The Redline 710d from DD Audio is a 10\" (25cm) subwoofer from the 700 series designed for serious performance. With a DD cast basket, triple stack magnet motor and heavy duty suspension, this subwoofer combines stability with performance. A high-strength cone, coupled with a massive EROM environment, ensures optimal performance in vented or multi-order enclosures. Powerful features such as a high-temperature resistant voice coil, a three-layer low bass spider system and a unique fiberglass and natural cellulose cone enhance its ability to deliver deep and accurate bass.",
                4.5f));

        //12

        //12 - Best up to 1000-1200rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Ground Zero GZHW 30XSPL", R.drawable.gzhw30, "12 inch / 30 cm", 1500, 3600, "DVC -> 2x1 ohm (D1) / 2x2 ohm (D2) ",319.99,
                "The Hydrogen GZHW 30XSPL is a high performance subwoofer from Ground Zero. With a diameter of 12\" (30cm), this subwoofer offers a number of impressive features, such as the Klippel optimization, a reinforced paper cone and a long excursion U-shape surround, all housed in a solid cast aluminum basket. The 75mm copper voice coil and 2-layer Polycot centering ensure an impressive sound. With an output of 1500 / 3000 watts RMS/SPL and an installation depth of 198 mm, this subwoofer promises to take your audio experience to a new level.",
                4.8f));

        //12 - Best up to 1500rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Digital Designs 712D D2", R.drawable.dd712, "12 inch / 30 cm", 1200,3600, "DVC -> 2x2 ohm (D2) / 2x4 ohm (D4) ",299.99,
                "The 700 series is designed for serious performance. It features a DD cast basket supporting a triple stack magnet motor, heavy duty suspension, and a high strength cone coupled to a massive EROM surround, making them best suited for duty in vented or multi-order enclosures.",
                4.5f));

        //12 - Best for 2000rms +
        subsSpeakersClassList.add(new SubsSpeakersClass("Avatar STU1246 D1/D2", R.drawable.avatar_stu12, "12 inch / 30 cm", 3000,6000, "DVC -> 2x1 ohm (D1) / 2x2 ohm (D2) ",499.99,
                "Discover the Avatar STU 1246, an outstanding 12\" (30cm) subwoofer. This model is characterized by its impressive technical specifications - a 4\" voice coil, a power handling of up to 3000 watts RMS and an XMAX of 28mm per direction. All these features give it a performance and quality normally found in a higher price segment. Take your chance to discover the full potential of this powerful subwoofer and take your audio experience to a new level.",
                4f));

        //15

        //15 - best up to 1000rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Dayton Audio Ultimax UM15-22", R.drawable.dayton_um1522, "15 inch / 38 cm", 800, 1600, "DVC -> 2x2 ohm (D2) ",369.99,
                "The Ultimax UM15-22 is a 15\" (38cm) subwoofer from Dayton Audio. This unit has been specifically designed to move an enormous amount of air and produce clear, precise bass that is a testament to powerful sound. It will give you a peak output of 800 watts RMS and features two 2 ohm copper coils with 2 layers. The design of this subwoofer also includes two linear stiffness spiders to limit any distortion and ensure a flawless musical experience. And that's just the beginning of the ultimate subwoofer experience that awaits you with the Ultimax UM15-22.",
                4.5f));

        //15 - Best up to 2500rms
        subsSpeakersClassList.add(new SubsSpeakersClass("Digital Designs 815F", R.drawable.dd_815f, "15 inch / 38 cm", 2500,7500, "DVC -> 2x1 ohm (D1) / 2x2 ohm (D2) ",999.99,
                "Discover the Power Tuned 815F, a premium 15\" (38cm) subwoofer from renowned manufacturer DD Audio. Famous for its evolution of the 800 series, DD Audio is constantly improving and innovating in terms of performance and durability. With features such as improved thermal cooling, a vented aluminum voice coil insert and a finned aluminum heat sink, this subwoofer offers maximum efficiency in converting power into sound. At the same time, it rises to the challenge of the heat generated by this conversion. The larger excursion allows for a robust Siicke and enables greater Xmax for unsurpassed sound enjoyment. With its elegant design, including finely carved aluminum logos and a newly embossed motor design, the Power Tuned 815F sets new standards in the audio industry.",
                4.8f));

        //15 - Best for 3000rms+
        subsSpeakersClassList.add(new SubsSpeakersClass("Sundown Audio Nightshade NSv6 15", R.drawable.nsv6_15, "15 inch / 38 cm", 3000,10000, "DVC -> 2x1 ohm (D1) / 2x2 ohm (D2)",2399.99,
                "The Nightshade NSv6 15 from Sundown Audio is an outstanding 15\" (38cm) subwoofer. This model is characterized by its precision in sound production and its high performance, which are underlined by outstanding technical data. Whether you are an audio professional or an amateur enthusiast, the Nightshade NSv6 15 will deliver an unparalleled listening experience. This subwoofer promises to take the music in your life to the next level.",
                5f));

        // Add more products...

        adapter = new AdapterSub(subsSpeakersClassList);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(RecommenderSub.this,
                    HelperMenu.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
