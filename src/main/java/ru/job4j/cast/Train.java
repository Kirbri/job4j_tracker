package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Отправление с перрона" + Train.class);
    }

    @Override
    public void acceleration() {
        System.out.println("Согласно ПТЭ скорость пассажирских - 140 км/ч, рефрижераторных - 120 км/ч, грузовых - 90 км/ч");
    }

}
