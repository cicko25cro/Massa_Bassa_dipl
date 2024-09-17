package com.example.massa_bassa_dipl;

public class Helper {
    private String title;
    private String imageUrl;
    private String description;
    private String category;

    public Helper(String title, String imageUrl, String description, String category) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
