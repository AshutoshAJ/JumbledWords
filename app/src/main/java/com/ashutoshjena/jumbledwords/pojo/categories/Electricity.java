package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Electricity {

    public static ArrayList<String> getList() {
        ArrayList<String> electricity = new ArrayList<>();
        electricity.add("CURRENT");
        electricity.add("ENERGY");
        electricity.add("CHARGE");
        electricity.add("CIRCUIT");
        electricity.add("AMMETER");
        electricity.add("JOULE");
        electricity.add("SOLAR");
        electricity.add("VOLTAGE");
        electricity.add("ELECTRONS");
        electricity.add("CELL");
        electricity.add("NUCLEAR");
        electricity.add("POWER");
        electricity.add("COAL");
        electricity.add("WIRE");
        electricity.add("BULB");
        electricity.add("FAN");
        electricity.add("MOTOR");
        electricity.add("FUEL");
        electricity.add("ROTATE");
        electricity.add("TORCH");
        electricity.add("HEAT");
        Collections.sort(electricity);
        return electricity;
    }
}
