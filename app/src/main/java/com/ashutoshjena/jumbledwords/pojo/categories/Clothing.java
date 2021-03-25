package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Clothing {

    public static ArrayList<String> getList() {
        ArrayList<String> clothing = new ArrayList<>();
        clothing.add("APPAREL");
        clothing.add("COSTUME");
        clothing.add("DRESS");
        clothing.add("FROCK");
        clothing.add("GARMENT");
        clothing.add("OUTFIT");
        clothing.add("COATSUIT");
        clothing.add("REGALIA");
        clothing.add("THREAD");
        clothing.add("VEST");
        clothing.add("ATTIRE");
        clothing.add("FORMAL");
        clothing.add("FASHION");
        clothing.add("UNIFORM");
        clothing.add("ROBE");
        clothing.add("CANVAS");
        clothing.add("CAP");
        clothing.add("CLOAK");
        clothing.add("JACKET");
        clothing.add("SHIRT");
        clothing.add("DENIM");
        Collections.sort(clothing);
        return clothing;
    }
}
