package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус отправляется!");
    }

    @Override
    public void passengers(int countOfPassengers) {
        System.out.println(countOfPassengers + " - количество пассажиров на борту.");
    }

    @Override
    public double refill(double amountOfFuel) {
        return amountOfFuel * 65.23;
    }
}
