package ru.job4j.function;

public class StrategyUsage {
    public static void main(String[] args) {
        Strategy usage = new Strategy();
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.contains("rn"), "Surname Name"
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        string -> string.toUpperCase(), "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                usage.transform(
                        string -> string.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        string -> string.trim(), "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}
