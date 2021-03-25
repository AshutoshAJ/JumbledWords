package com.ashutoshjena.jumbledwords.pojo;

import com.ashutoshjena.jumbledwords.R;

import java.util.ArrayList;

public class Images {
    public static ArrayList<Integer> imageResources;

    public static ArrayList<Integer> getImageResources() {
        imageResources = new ArrayList<>();
        imageResources.add(R.drawable.ic_animals);
        imageResources.add(R.drawable.ic_cars);
        imageResources.add(R.drawable.ic_capitals);
        imageResources.add(R.drawable.ic_chemistry);
        imageResources.add(R.drawable.ic_countries);
        imageResources.add(R.drawable.ic_clothing);
        imageResources.add(R.drawable.ic_electricity);
        imageResources.add(R.drawable.ic_fruits);
        imageResources.add(R.drawable.ic_foods);
        imageResources.add(R.drawable.ic_flowers);
        imageResources.add(R.drawable.ic_movies);
        imageResources.add(R.drawable.ic_planets);
        imageResources.add(R.drawable.ic_physics);
        imageResources.add(R.drawable.ic_space);
        imageResources.add(R.drawable.ic_sports);
        return imageResources;
    }
}
