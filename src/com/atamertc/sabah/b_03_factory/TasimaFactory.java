package com.atamertc.sabah.b_03_factory;

public class TasimaFactory {

    public static Tasima builder(TasimaTip tip) {
        switch (tip) {
            case KARA -> {
                return new Kamyon();
            }
            case DENIZ -> {
                return new Gemi();
            }
            default -> {
                return null;
            }
        }
    }

}
