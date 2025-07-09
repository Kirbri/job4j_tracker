package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "top");
        map.put(3, "user");
        map.put(4, "precision");
        map.put(5, "post");

        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        System.out.println();

        BiFunction<Integer, String, String> function = (key, value) -> value + "_" + key;
        map.replaceAll(function);

        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        System.out.println("\nMethod 'computeIfPresent'");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "name");

        BiFunction<Integer, String, String> function2 = (key, value) -> value + "_" + key;
        String result = map2.computeIfPresent(1, function2);

        System.out.println("Current value: " + result);
        map2.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        System.out.println("\nMethod 'computeIfAbsent'");
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Petr", 5);

        Function<String, Integer> function3 = String::length;
        map3.computeIfAbsent("Petr", function3);
        map3.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));

        System.out.println("\nMethod 'merge'");

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("Shoes", 200);

        BiFunction<Integer, Integer, Integer> function4 = (oldValue, newValue) -> oldValue - newValue;
        int newPrice = map4.merge("Shoes", 50, function4);
        System.out.println("New price: " + newPrice);
        System.out.println("Price of shirt: " + map4.merge("Shirt", 100, function4));

        map4.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}