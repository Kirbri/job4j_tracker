package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    private static String first = "Гав";
    private static String second = "Муу";

    public static void main(String[] args) {
        String ayyyy = "ayyyyy";
        String name = echo(
                () -> {
                    second = "Мяу";
                    return first + second;
                }
        );
        System.out.println(name);

        String name2 = echo(
                () -> {
                    return ayyyy;
                }
        );
        System.out.println(ayyyy);
        System.out.println(name2);
    }

    private static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
