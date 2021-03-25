package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Space {

    public static ArrayList<String> getList() {
        ArrayList<String> space = new ArrayList<>();
        space.add("ASTEROID");
        space.add("DENSITY");
        space.add("GRAVITY");
        space.add("COMET");
        space.add("MOON");
        space.add("ECLIPSE");
        space.add("METEOR");
        space.add("NEBULA");
        space.add("ROCKET");
        space.add("INERTIA");
        space.add("LUNAR");
        space.add("ORBIT");
        space.add("STAR");
        space.add("SOLAR");
        space.add("RING");
        space.add("UNIVERSE");
        space.add("PHASE");
        space.add("ZODIAC");
        space.add("MASS");
        space.add("REVOLVE");
        space.add("SUN");
        Collections.sort(space);
        return space;
    }
}
