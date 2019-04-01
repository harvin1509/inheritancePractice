package com.haru.interfacepack;

public class MainApp {


    public static void main(String[] args) {

        String dataType = "Course";
        switch (dataType) {
            case "Student":
                MySQLHandler mySQLHandler = new MySQLHandler();
                persistData(mySQLHandler);
                break;
            case "Course":
                PostgresHandler postgresHandler = new PostgresHandler();
                persistData(postgresHandler);
                break;
            case "Teacher":
                OracleHandler oracleHandler = new OracleHandler();
                persistData(oracleHandler);
                break;
        }
    }



    public static void persistData(MySQLHandler mySQLHandler) {
        mySQLHandler.create();
    }

    public static void persistData(PostgresHandler postgresHandler) {
        postgresHandler.create();
    }

    public static void persistData(OracleHandler oracleHandler) {
        oracleHandler.create();
    }


}
