package com.haru;

public class Car extends Transport {

    public Car() {
        super(50, "Haru's Car", 4);
    }

    @Override
    public void differentMethod() {
        System.out.println("car's different method");
    }
}
