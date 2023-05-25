package com.atamertc.aksam.b_02_factory.ornek1;

public class PostgreSql implements ILogger {


    @Override
    public void logToDatabase(String message) {
        System.out.println(message+" -> PostgreSql e baglandi");
    }
}
