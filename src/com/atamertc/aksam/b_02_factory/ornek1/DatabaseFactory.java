package com.atamertc.aksam.b_02_factory.ornek1;

public class DatabaseFactory {
    public static ILogger createDatabase(String dbName) {
        switch (dbName) {
            case "postgre" -> {
                return new PostgreSql();
            }
            case "mongo" -> {
                return new MongoDb();
            }
            default -> {
                throw new RuntimeException("Girdiginiz database desteklenmemektedir.");
            }
        }
    }
}
