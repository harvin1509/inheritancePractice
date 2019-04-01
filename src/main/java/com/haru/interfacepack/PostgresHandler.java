package com.haru.interfacepack;

public class PostgresHandler implements DBHandler {
    @Override
    public void create() {
        System.out.println("PostGres Create");
    }

    @Override
    public void retrieve() {
        System.out.println("PostGres retrieve");

    }

    @Override
    public void update() {
        System.out.println("PostGres update");

    }

    @Override
    public void delete() {
        System.out.println("PostGres delete");

    }
}
