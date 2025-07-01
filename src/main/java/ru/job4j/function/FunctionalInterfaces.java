package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + value);

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPredicate = (number, string) -> number % 2 == 0 || map.get(number).length() == 4;

        for (Integer key : map.keySet()) {
            biPredicate.test(key, map.get(key));
                System.out.println("key: " + key + " value: " + map.get(key));
        }
        /*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());

        Consumer<String> consumer = string -> System.out.println(string);
        Function<String, String> function = string -> string.toUpperCase();
        for (String string : supplier.get()) {
            consumer.accept(string);
            function.apply(string);
        }
    }
}
