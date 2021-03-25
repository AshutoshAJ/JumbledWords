package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Animals {

    public static ArrayList<String> getList() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("LION");
        animals.add("TIGER");
        animals.add("ELEPHANT");
        animals.add("HOUND");
        animals.add("DOLPHIN");
        animals.add("ANTELOPE");
        animals.add("RABBIT");
        animals.add("HEDGEHOG");
        animals.add("HYENA");
        animals.add("BEAVER");
        animals.add("BISON");
        animals.add("KANGAROO");
        animals.add("WHALE");
        animals.add("CHIMP");
        animals.add("BUFFALO");
        animals.add("CAMEL");
        animals.add("CAPYBARA");
        animals.add("SQUIRREL");
        animals.add("CHEETAH");
        animals.add("LEOPARD");
        animals.add("GORILLA");
        Collections.sort(animals);
        return animals;
    }
}
