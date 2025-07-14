package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> resultSkip = strings
                .stream()
                .skip(2)
                .toList();
        System.out.println(resultSkip);

        List<String> resultSkipAndLimit = strings
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        System.out.println(resultSkipAndLimit);

        String resultSkipLimitFindFirst = strings
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultSkipLimitFindFirst);

        String resultSkipOrElse = strings
                .stream()
                .skip(5)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultSkipOrElse);

        String resultLastElement = strings
                .stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(resultLastElement);
    }
}
