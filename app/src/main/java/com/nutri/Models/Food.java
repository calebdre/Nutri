package com.nutri.Models;

import com.nutri.Nutrition.NutritionInfo;

public class Food {
    private String name, imageUrl;
    private NutritionInfo info;

    public Food(String name, String imageUrl, NutritionInfo info) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public NutritionInfo getInfo() {
        return info;
    }
}