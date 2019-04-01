package com.haru.interfacepack;

public class OracleHandler implements DBHandler {
    @Override
    public void create() {
        System.out.println("Oracle Create");
    }

    @Override
    public void retrieve() {
        System.out.println("Oracle retrieve");

    }

    @Override
    public void update() {
        System.out.println("Oracle update");

    }

    @Override
    public void delete() {
        System.out.println("Oracle delete");

    }
}
