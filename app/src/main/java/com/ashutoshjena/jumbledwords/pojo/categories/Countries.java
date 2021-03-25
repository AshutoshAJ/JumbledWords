package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Countries {

    public static ArrayList<String> getList() {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("ALBANIA");
        countries.add("ALGERIA");
        countries.add("AUSTRIA");
        countries.add("BAHRAIN");
        countries.add("BELARUS");
        countries.add("BELGIUM");
        countries.add("BHUTAN");
        countries.add("BRAZIL");
        countries.add("CANADA");
        countries.add("CHILE");
        countries.add("CROATIA");
        countries.add("EGYPT");
        countries.add("GERMANY");
        countries.add("GHANA");
        countries.add("INDIA");
        countries.add("ITALY");
        countries.add("JAPAN");
        countries.add("KUWAIT");
        countries.add("NEPAL");
        countries.add("NIGERIA");
        countries.add("SPAIN");
        Collections.sort(countries);
        return countries;
    }
}
