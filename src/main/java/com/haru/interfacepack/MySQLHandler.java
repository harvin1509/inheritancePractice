package com.haru.interfacepack;

public class MySQLHandler implements DBHandler {
    @Override
    public void create() {
        System.out.println("MySQL Create");
    }

    @Override
    public void retrieve() {
        System.out.println("MySQL retrieve");

    }

    @Override
    public void update() {
        System.out.println("MySQL update");

    }

    @Override
    public void delete() {
        System.out.println("MySQL delete");

    }
}
