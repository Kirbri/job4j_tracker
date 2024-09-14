package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(3);
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");

        for (String names : arrayList) {
            System.out.println(names);
        }
    }
}
