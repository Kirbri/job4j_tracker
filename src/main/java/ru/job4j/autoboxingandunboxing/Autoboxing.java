package ru.job4j.autoboxingandunboxing;

public class Autoboxing {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void num(int x) {
        System.out.println("Значение типа int: " + x);
    }

    public static void main(String[] args) {
        int a = 1;
        Integer b;
        b = Integer.valueOf(a);
        b = a;
        System.out.println("Integer b = " + b);

        int x = 2;
        num(x);
    }

}
