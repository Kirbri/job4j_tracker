package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) +  minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result1 = Calculator.sum(10);
        System.out.println(result1);

        int result2 = sum(47);
        System.out.println(result2);

        Calculator calculator = new Calculator();
        int result3 = calculator.multiply(5);
        System.out.println(result3);

        int result4 = Calculator.minus(15);
        System.out.println(result4);

        Calculator calculator1 = new Calculator();
        int result5 = calculator1.divide(55);
        System.out.println(result5);

        Calculator calculator2 = new Calculator();
        int result6 = calculator2.sumAllOperation(49);
        System.out.println(result6);
    }
}
