package com.atamertc.aksam.b_02_factory.ornek1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen loglama yapacaginiz database ismini giriniz");
        String dbName = scanner.nextLine();
        ILogger logger = DatabaseFactory.createDatabase(dbName);
//        switch (dbName) {
//            case "postgre":
//                logger = new PostgreSql();
//                break;
//            case "mongo":
//                logger = new MongoDb();
//                break;
//        }
        logger.logToDatabase("xxxx");

    }
}
