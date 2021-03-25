package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Planets {

    public static ArrayList<String> getList() {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("EARTH");
        planets.add("ALIEN");
        planets.add("GLOBE");
        planets.add("MERCURY");
        planets.add("MOON");
        planets.add("VENUS");
        planets.add("SATURN");
        planets.add("URANUS");
        planets.add("NEPTUNE");
        planets.add("JUPITER");
        planets.add("PLUTO");
        planets.add("JOVIAL");
        planets.add("CRUST");
        planets.add("LANDER");
        planets.add("ASTEROID");
        planets.add("ROVER");
        planets.add("GRAVITY");
        planets.add("POLE");
        planets.add("ECLIPSE");
        planets.add("REVOLVE");
        planets.add("EQUATOR");
        Collections.sort(planets);
        return planets;
    }
}
