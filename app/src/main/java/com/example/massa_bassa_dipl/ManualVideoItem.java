package com.example.massa_bassa_dipl;

public class ManualVideoItem {
    private String title;
    private String description;
    private String link;
    private int imageResId;

    public ManualVideoItem(String title, String description, String link, int imageResId) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getLink() { return link; }
    public int getImageResId() { return imageResId; }
}
