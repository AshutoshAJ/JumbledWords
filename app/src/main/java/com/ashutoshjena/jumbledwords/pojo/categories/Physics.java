package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Physics {

    public static ArrayList<String> getList() {
        ArrayList<String> physics = new ArrayList<>();
        physics.add("BIGBANG");
        physics.add("CAPACITOR");
        physics.add("CURRENT");
        physics.add("MASS");
        physics.add("GRAVITY");
        physics.add("CHARGE");
        physics.add("CIRCUIT");
        physics.add("CONCAVE");
        physics.add("DENSITY");
        physics.add("DIODE");
        physics.add("ECHO");
        physics.add("LIGHT");
        physics.add("JOULE");
        physics.add("ISOTOPE");
        physics.add("FISSION");
        physics.add("XRAY");
        physics.add("PASCAL");
        physics.add("VACUUM");
        physics.add("SIUNIT");
        physics.add("SOUND");
        physics.add("ENERGY");
        Collections.sort(physics);
        return physics;
    }
}
