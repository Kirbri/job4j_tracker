package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Integer numLeft = Integer.parseInt(left.split("\\.")[0]);
        Integer numRight = Integer.parseInt(right.split("\\.")[0]);
        return numLeft.compareTo(numRight);
    }
}
