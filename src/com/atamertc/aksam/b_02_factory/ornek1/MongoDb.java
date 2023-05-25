package com.atamertc.aksam.b_02_factory.ornek1;

public class MongoDb implements ILogger {

    @Override
    public void logToDatabase(String message) {
        System.out.println(message+" -> MongoDb ye baglandi");
    }
}
