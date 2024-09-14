package ru.job4j.autoboxingandunboxing;

import java.util.ArrayList;
import java.util.List;

public class Unboxing {
    public static void main(String[] args) {
        Integer m = 3;
        int n = m;
        int q = m.intValue();
        System.out.println("int n = " + n);

        Integer k = 5;
        Integer l = 6;
        System.out.println(k * l);

        Integer g = 250;
        Integer h = 250;
        System.out.println(g == h);

        Integer v = 127;
        Integer w = 127;
        System.out.println(v == w);

        Integer sum = 0;
        for (int i = 128; i < 300; i++) {
            sum += i;
        }
        System.out.println(sum);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            System.out.println(list);
        }
    }
}
