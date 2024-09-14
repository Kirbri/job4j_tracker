package ru.job4j.oop;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель") {
            @Override
            public void startEngine() {
                System.out.println("Двигатель запущен с трудом");
            }
        };
        Car.Transmission transmission = car.new Transmission();
//        Car.Transmission.Clutch clutch;
//        clutch = transmission.new Clutch();
//        clutch.torqueTransmission();
        Car.Brakes brakes = car.new Brakes();
        car.startEngine();
        transmission.accelerate();
        brakes.brake();
        Car.TripComputer tripComputer = car.new TripComputer();
        tripComputer.getInfo();
    }
}
