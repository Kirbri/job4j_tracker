package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String string1 = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(string1);

        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        String string2 = "C:\\projects\\job4j\\File.java";
        System.out.println(string2);
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print("Первая строка\nВторая строка");
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.println("Job4jjj\b\b");
    }
}
