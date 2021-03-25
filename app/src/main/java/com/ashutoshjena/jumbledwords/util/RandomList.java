package com.ashutoshjena.jumbledwords.util;

import java.util.ArrayList;
import java.util.Random;

public class RandomList {
    public static ArrayList<Integer> getRandomList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() != size) {
            int number = random.nextInt(size);
            if (!list.contains(number)) {
                list.add(number);
            }
        }
        return list;
    }
}
