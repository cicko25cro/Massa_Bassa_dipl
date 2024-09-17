package com.example.massa_bassa_dipl;

import java.util.List;

public class HowTo {
    private String title;
    private List<String> steps;
    private List<Integer> images;

    public HowTo(String title, List<String> steps, List<Integer> images) {
        this.title = title;
        this.steps = steps;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getSteps() {
        return steps;
    }

    public List<Integer> getImages() {
        return images;
    }
}
