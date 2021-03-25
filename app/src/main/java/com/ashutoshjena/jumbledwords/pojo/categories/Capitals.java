package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Capitals {

    public static ArrayList<String> getList() {
        ArrayList<String> capitals = new ArrayList<>();
        capitals.add("ALGIERS");
        capitals.add("CANBERRA");
        capitals.add("VIENNA");
        capitals.add("MANAMA");
        capitals.add("DHAKA");
        capitals.add("BRUSSELS");
        capitals.add("BRASILIA");
        capitals.add("BEIJING");
        capitals.add("PRAGUE");
        capitals.add("ROSEAU");
        capitals.add("CAIRO");
        capitals.add("PARIS");
        capitals.add("BERLIN");
        capitals.add("ATHENS");
        capitals.add("JAKARTA");
        capitals.add("DUBLIN");
        capitals.add("ROME");
        capitals.add("TOKYO");
        capitals.add("NAIROBI");
        capitals.add("BISHKEK");
        capitals.add("BEIRUT");
        Collections.sort(capitals);
        return capitals;
    }
}
