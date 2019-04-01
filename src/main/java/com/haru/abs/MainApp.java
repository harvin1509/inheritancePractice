package com.haru.abs;

public class MainApp {


    public static void main(String[] args) {
        AbstractClass testClass = new ConcreteImpl();
        testClass.someMethod();
    }
}
