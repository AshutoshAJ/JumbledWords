package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Flowers {

    public static ArrayList<String> getList() {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("ROSE");
        flowers.add("LILY");
        flowers.add("TULIP");
        flowers.add("ORCHID");
        flowers.add("FREESIA");
        flowers.add("DAISY");
        flowers.add("MARIGOLD");
        flowers.add("HAWTHORN");
        flowers.add("ASTER");
        flowers.add("LAVENDER");
        flowers.add("PRIMROSE");
        flowers.add("CLOVER");
        flowers.add("JASMINE");
        flowers.add("HIBISCUS");
        flowers.add("DAFFODIL");
        flowers.add("DAYLILY");
        flowers.add("DAPHNES");
        flowers.add("DAHLIA");
        flowers.add("PETUNIA");
        flowers.add("LOBELIA");
        flowers.add("CROCUS");
        Collections.sort(flowers);
        return flowers;
    }
}
