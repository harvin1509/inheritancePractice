package com.haru;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.displaySpeed();
        car.increaseSpeed(10);
        car.displaySpeed();


        Truck truck = new Truck();
        truck.displaySpeed();
        truck.increaseSpeed(20);
        truck.displaySpeed();
    }
}
