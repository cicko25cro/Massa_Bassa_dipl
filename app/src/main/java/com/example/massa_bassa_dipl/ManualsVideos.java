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
        EditText searchEditText = findViewById(R.id.searchEditText);
        searchEditText.setTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Manuals and Videos");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        manualVideoList = new ArrayList<>();
        filteredList = new ArrayList<>();
        manualVideoList.add(new ManualVideoItem("Webpage - Car Audio Fabrication", "CAF Webpage - tutorials, how-to, lessons and more!",
        "https://www.caraudiofabrication.com/learn","https://yt3.googleusercontent.com/ytc/AIdro_nwnN_1zqocbxX5jOKRIqxYBEkSMQaatDclHteDMdvKNF8=s900-c-k-c0x00ffffff-no-rj"));
        manualVideoList.add(new ManualVideoItem("Webpage - Crutchfield", "Online retailer and resource for consumer electronics that specializes in providing expert advice and support for audio and video products.",
        "https://www.crutchfield.com/S54FGDVg7qMl/","https://images.crutchfieldonline.com/ImageBank/v20190322131200/social-media/og-meta.jpg"));
        manualVideoList.add(new ManualVideoItem("Webpage - Masori", "Europe's Largest Carhifi Shop - Masori", "https://masori.de/en",
                "https://masori.de/en/cdn/shop/files/Masori-POWERED-BY-MASORI-Sticker-Sticker-Masori_de.webp?v=1721947939"));
        manualVideoList.add(new ManualVideoItem("Video - Wiring a Car Stereo and Speakers, Amp, & Sub made EASY for Beginners", "Did you like this video? If so, please consider becoming a Patreon...", "https://www.youtube.com/watch?v=72Tmq8S71F0 ","https://i.ytimg.com/vi/72Tmq8S71F0/sddefault.jpg"));
        manualVideoList.add(new ManualVideoItem("Video - How to install an amp and sub in your car?", "This video shows you a typical installation and the tools and best practices that'll help your project become a success. ", "https://www.youtube.com/watch?v=eidK7FNI0GA&ab_channel=CRUTCHFIELD","https://i.ytimg.com/vi/eidK7FNI0GA/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLChMIVRPSmKni26tL7kakrajnd81A"));
        manualVideoList.add(new ManualVideoItem("Video - Avoid these 5 common Car Audio NOOB Mistakes!", "How can we better install our subwoofers, amplifier, radio, speakers and wiring? Avoid these five mistakes! ", "https://www.youtube.com/watch?v=1FTsmUCbvoM","https://i.ytimg.com/vi/1FTsmUCbvoM/maxresdefault.jpg"));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - EXOcontralto", "Bass videos, bass builds, car audio advice and much more!", "https://www.youtube.com/@EXOcontralto","https://scontent-vie1-1.xx.fbcdn.net/v/t1.6435-9/96405107_3214873255197914_1765754032837623808_n.jpg?stp=dst-jpg_s960x960&_nc_cat=111&ccb=1-7&_nc_sid=7b2446&_nc_ohc=McUZJYTmubMQ7kNvgGT-ey7&_nc_ht=scontent-vie1-1.xx&_nc_gid=ArTF0vWaQoN_n5tFCKqdPdg&oh=00_AYB7gsMpjlnd72H05mXqnD5iIkVJItoSpRfN3niRBPLqjw&oe=67063B4E"));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - LIFEOFPRICE", "Crazy bass head videos, competitions, webshop announcements, car audio advice and much more!", "https://www.youtube.com/@THELIFEOFPRICE","https://cdn11.bigcommerce.com/s-209k8v1/images/stencil/608x608/products/2381/47970/thelifeofprice-bass-song__75488.1659029191.jpg?c=2"));
        manualVideoList.add(new ManualVideoItem("YouTube Channel - meade916", "Customization and enhancement of car audio systems, build videos and so much to explore!", "https://www.youtube.com/@meade916","https://yt3.googleusercontent.com/sAAkcnvSxd2VlBq7Dg3TTUPL-wjwLdJV_Srydig5j9a-NsVbtPKEzIbgu7UW27eij66KnW4GDw=s900-c-k-c0x00ffffff-no-rj"));
        filteredList.addAll(manualVideoList);
        manualsVideosAdapter = new ManualsVideosAdapter(filteredList);
        recyclerView.setAdapter(manualsVideosAdapter);
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int
                    count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                filterItems(s.toString());
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed(); // Handle back button press
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void filterItems(String query) {
        filteredList.clear();
        for (ManualVideoItem item : manualVideoList) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase())
                    ||
                    item.getDescription().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        manualsVideosAdapter.notifyDataSetChanged();
    }
}