package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "New String For Interface";
        System.out.println(supplier.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier2 = () -> new HashSet<>(list);
        Set<String> strings = supplier2.get();
        for (String string : strings) {
            System.out.println(string);
        }

        Supplier<String> supplier3 = () -> "New String For Interface";
        Consumer<String> consumer = (string) -> System.out.println(string);
        consumer.accept(supplier.get());

        Supplier<String> supplier4 = () -> "New String For Interface";
        BiConsumer<String, String> consumer2 = (first, second) -> System.out.println(first + second);
        consumer2.accept(supplier4.get(), " and Second String");

        List<String> list2 = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier5 = () -> new HashSet<>(list2);
        BiConsumer<Integer, String> consumer3 = (first, second) -> System.out.println(first + second);
        Set<String> strings2 = supplier5.get();
        int i = 1;
        for (String string : strings2) {
            consumer3.accept(i++, " is " + string);
        }

        Predicate<String> predicate = string -> string.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));

        BiPredicate<String, Integer> condition = (string, number) -> string.contains(number.toString());
        System.out.println("Строка содержит подстроку: " + condition.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + condition.test("Name", 123));

        Function<String, Character> function = string -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));

        BiFunction<String, Integer, String> biFunction = (string, number) -> string.concat(" ").concat(number.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 12345));

        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: " + builder.apply(new StringBuilder("tset rof gnirtS")));

        BinaryOperator<StringBuilder> builder2 = (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + builder2.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
