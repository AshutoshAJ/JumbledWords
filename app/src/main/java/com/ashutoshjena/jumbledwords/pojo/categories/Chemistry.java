package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Chemistry {

    public static ArrayList<String> getList() {
        ArrayList<String> chemistry = new ArrayList<>();
        chemistry.add("AEROSOL");
        chemistry.add("ATOMIC");
        chemistry.add("BEAKER");
        chemistry.add("BIND");
        chemistry.add("BOND");
        chemistry.add("CATALYST");
        chemistry.add("CHEMICAL");
        chemistry.add("CARBON");
        chemistry.add("CONDENSE");
        chemistry.add("IONIC");
        chemistry.add("REACT");
        chemistry.add("METHYL");
        chemistry.add("ORGANIC");
        chemistry.add("SOLVENT");
        chemistry.add("STABLE");
        chemistry.add("OXYGEN");
        chemistry.add("NITROGEN");
        chemistry.add("VALENCY");
        chemistry.add("HEAT");
        chemistry.add("VOLUME");
        chemistry.add("MASS");
        Collections.sort(chemistry);
        return chemistry;
    }
}
