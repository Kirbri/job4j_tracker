package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Взлёт с полосы" + Airplane.class);
    }

    @Override
    public void acceleration() {
        System.out.println("Коммерческий самолеты при взлете развивает скорость взлета от 99 до 111 км/ч");
    }
}
