package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;

public class DeferredExecution {
    public static void main(String[] args) {
        String[] names1 = {
                "Ivan",
        };
        Comparator<String> lengthComparator1 = (left, right) -> {
            System.out.println("execute comparator with arrays length = " + names1.length);
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names1, lengthComparator1);

        String[] names2 = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthComparator2 = (left, right) -> {
            System.out.println("execute comparator with arrays length = " + names2.length);
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names2, lengthComparator2);
    }
}
