package com.haru;

public class AirCraft extends Transport {
    private int wings;

    public AirCraft() {
        super(1000, "Bhupi's Aircraft", 3);
        wings = 2;
    }

    @Override
    public void transmissionControl() {
        super.transmissionControl();
        System.out.println("Air");
    }

    @Override
    public void differentMethod() {

    }
}
