package com.ashutoshjena.jumbledwords.pojo.categories;

import java.util.ArrayList;
import java.util.Collections;

public class Movies {

    public static ArrayList<String> getList() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("BATMAN");
        movies.add("SUPERMAN");
        movies.add("PRESTIGE");
        movies.add("MEMENTO");
        movies.add("CARS");
        movies.add("IRONMAN");
        movies.add("AQUAMAN");
        movies.add("AVATAR");
        movies.add("SPEED");
        movies.add("47RONIN");
        movies.add("THOR");
        movies.add("TWILIGHT");
        movies.add("GODZILLA");
        movies.add("ANTMAN");
        movies.add("LOGAN");
        movies.add("VENOM");
        movies.add("ZODIAC");
        movies.add("LUCY");
        movies.add("FROZEN");
        movies.add("JOHNWICK");
        movies.add("JUMANJI");
        Collections.sort(movies);
        return movies;
    }
}
