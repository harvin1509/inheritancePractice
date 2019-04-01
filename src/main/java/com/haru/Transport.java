package com.haru;

public abstract class Transport {
    private int speed;
    private String name;
    private int tyres;

    public Transport(int speed, String name, int tyres) {
        this.speed = speed;
        this.name = name;
        this.tyres = tyres;
    }

    public Transport() {
    }

    public void increaseSpeed(int factor) {
        this.speed += factor;
    }

    public void displaySpeed() {
        System.out.println(name + " " + speed);
    }

    public void transmissionControl() {
        System.out.println("On Road.");
    }

    abstract public void differentMethod();
}
