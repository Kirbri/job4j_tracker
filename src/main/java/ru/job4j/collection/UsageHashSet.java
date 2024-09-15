package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Vasily");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
