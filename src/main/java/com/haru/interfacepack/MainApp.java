package com.haru.interfacepack;

public class MainApp {


    public static void main(String[] args) {

        String dataType = "Teacher";
        DBHandler handler = null;
        switch (dataType) {
            case "Student":
                handler = new MySQLHandler();
                break;
            case "Course":
                handler = new PostgresHandler();
                break;
            case "Teacher":
                handler = new OracleHandler();
                break;
        }

        persistData(handler);
    }


    public static void persistData(DBHandler handle) {
        handle.create();
    }


}
