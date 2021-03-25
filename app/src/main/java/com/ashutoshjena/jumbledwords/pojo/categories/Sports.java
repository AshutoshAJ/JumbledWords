package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Sports {

    public static ArrayList<String> getList() {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("ARCHER");
        sports.add("ATHLETE");
        sports.add("BASEBALL");
        sports.add("BICYCLE");
        sports.add("BOWLING");
        sports.add("BOXING");
        sports.add("COACH");
        sports.add("CRICKET");
        sports.add("HOCKEY");
        sports.add("DART");
        sports.add("DIVER");
        sports.add("EXERCISE");
        sports.add("FOOTBALL");
        sports.add("GYMNAST");
        sports.add("HURDLE");
        sports.add("JOGGING");
        sports.add("KARATE");
        sports.add("KUNGFU");
        sports.add("LONGJUMP");
        sports.add("PLAYOFF");
        sports.add("RACE");
        Collections.sort(sports);
        return sports;
    }
}
