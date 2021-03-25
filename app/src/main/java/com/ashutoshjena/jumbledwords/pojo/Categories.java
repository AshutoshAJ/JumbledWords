package com.ashutoshjena.jumbledwords.pojo;

import java.util.ArrayList;

public class Categories {

    public static ArrayList<String> categories;

    public static ArrayList<String> getCategories() {
        categories = new ArrayList<>();
        categories.add("Animals");
        categories.add("Cars");
        categories.add("Capitals");
        categories.add("Chemistry");
        categories.add("Countries");
        categories.add("Clothing");
        categories.add("Electricity");
        categories.add("Fruits");
        categories.add("Foods");
        categories.add("Flowers");
        categories.add("Movies");
        categories.add("Planets");
        categories.add("Physics");
        categories.add("Space");
        categories.add("Sports");
        return categories;
    }
}
