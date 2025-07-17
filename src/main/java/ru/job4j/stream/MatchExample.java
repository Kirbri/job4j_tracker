package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        boolean resultNoneMatch = strings1
                .stream()
                .noneMatch("Шесть"::contains);
        System.out.println(resultNoneMatch);

        boolean resultAnyMatch = strings1
                .stream()
                .anyMatch(element -> element.endsWith("ь"));
        System.out.println(resultAnyMatch);

        List<String> strings2 = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean resultAllMatch = strings2
                .stream()
                .allMatch(element -> element.startsWith("Три"));
        System.out.println(resultAllMatch);
    }
}