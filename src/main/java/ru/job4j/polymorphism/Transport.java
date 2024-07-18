package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passengers(int countOfPassengers);

    double refill(double amountOfFuel);
}
