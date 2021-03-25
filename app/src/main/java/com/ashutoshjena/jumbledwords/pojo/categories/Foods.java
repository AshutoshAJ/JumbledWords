package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Foods {

    public static ArrayList<String> getList() {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("BURGER");
        foods.add("PIZZA");
        foods.add("ROLL");
        foods.add("SANDWICH");
        foods.add("NOODLE");
        foods.add("BURRITO");
        foods.add("CHEESE");
        foods.add("TOAST");
        foods.add("HONEY");
        foods.add("HOTDOG");
        foods.add("JELLY");
        foods.add("KETCHUP");
        foods.add("LASAGNA");
        foods.add("PANCAKE");
        foods.add("WINE");
        foods.add("CAMEL");
        foods.add("BARBECUE");
        foods.add("SALAD");
        foods.add("OATMEAL");
        foods.add("PASTA");
        foods.add("STEAK");
        Collections.sort(foods);
        return foods;
    }
}
