package com.example.massa_bassa_dipl;
public class SubsSpeakersClass {
    private String name;
    private int imageResource;
    private String size;
    private int wrms;
    private int maxpower;
    private String wiring;
    private double price;
    private String description;
    private float rating;

    public SubsSpeakersClass(String name, int imageResource, String size, int wrms, int maxpower, String wiring, double price, String description, float rating) {
        this.name = name;
        this.imageResource = imageResource;
        this.size = size;
        this.wrms = wrms;
        this.maxpower = maxpower;
        this.wiring = wiring;
        this.price = price;
        this.description = description;
        this.rating = rating;
    }
    public String getPriceWithCurrency() {
        return "Price: " + "€" + price;
    }
    public String getWattsWithRMS() {
        return "Power: " + wrms + " Watts RMS / " + maxpower + " Watts Max";
    }
    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }
    public String getSize() {
        return "Size: " + size;
    }
    public String getOhm() {
        return "Impedance: " + wiring;
    }
    public String getDescription() {
        return description;
    }
    public float getRating() {
        return rating;
    }
}
