package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return left.charAt(1) != right.charAt(1) ? right.compareTo(left) : left.compareTo(right);
    }
}