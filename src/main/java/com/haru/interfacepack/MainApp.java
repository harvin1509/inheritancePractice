package com.haru.interfacepack;

public class MainApp {


    public static void main(String[] args) {

        String dataType = "Student";

        MySQLHandler mySQLHandler = new MySQLHandler();
        persistData(mySQLHandler);

        PostgresHandler postgresHandler = new PostgresHandler();
        persistData(postgresHandler);

        OracleHandler oracleHandler = new OracleHandler();
        persistData(oracleHandler);
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

//    public void persistData(DBHandler someHandler) {
//        someHandler.create();
//    }

}
