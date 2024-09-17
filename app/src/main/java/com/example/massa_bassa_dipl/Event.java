package com.example.massa_bassa_dipl;

public class Event {
    private String title;
    private String description;
    private String date;
    private String time;

    // Default constructor
    public Event() {
        // Default values
        this.title = "";
        this.description = "";
        this.date = "";
        this.time = "";
    }

    // Parameterized constructor
    public Event(String title, String description, String date, String time) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
