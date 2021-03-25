package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Cars {

    public static ArrayList<String> getList() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("ACURA");
        cars.add("APOLLO");
        cars.add("ASTON");
        cars.add("AUDI");
        cars.add("BENTELY");
        cars.add("BMW");
        cars.add("BUGATTI");
        cars.add("CADILLAC");
        cars.add("EAGLE");
        cars.add("FERRARI");
        cars.add("HONDA");
        cars.add("HYUNDAI");
        cars.add("JAGUAR");
        cars.add("KIA");
        cars.add("LEXUS");
        cars.add("MAHINDRA");
        cars.add("MASERATI");
        cars.add("NISSAN");
        cars.add("RENAULT");
        cars.add("SKODA");
        cars.add("TATA");
        Collections.sort(cars);
        return cars;
    }
}
