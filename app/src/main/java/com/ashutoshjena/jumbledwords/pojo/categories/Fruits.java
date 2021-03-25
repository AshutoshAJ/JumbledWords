package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Fruits {

    public static ArrayList<String> getList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("APPLE");
        fruits.add("APRICOT");
        fruits.add("BANANA");
        fruits.add("COCONUT");
        fruits.add("DATE");
        fruits.add("GRAPES");
        fruits.add("LEMON");
        fruits.add("LITCHI");
        fruits.add("MANGO");
        fruits.add("ORANGE");
        fruits.add("PAPAYA");
        fruits.add("PEACH");
        fruits.add("PEAR");
        fruits.add("RAISINS");
        fruits.add("TAMARIND");
        fruits.add("KIWI");
        fruits.add("CHERRY");
        fruits.add("AVOCADO");
        fruits.add("QUINCE");
        fruits.add("LONGAN");
        fruits.add("CHIKOO");
        Collections.sort(fruits);
        return fruits;
    }
}
