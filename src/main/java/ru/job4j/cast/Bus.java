package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Отправление с остановки" + Bus.class);
    }

    @Override
    public void acceleration() {
        System.out.println("Максимальная разрешенная скорость автобусов для междугородных и маломестных "
                + "на всех дорогах - 90 км/ч");
    }
}
