package com.atamertc.sabah.b_03_factory;

public class Kamyon extends Tasima{


    public Kamyon() {
        super(TasimaTip.KARA);
        tasi();
    }

    @Override
    void tasi() {
        System.out.println("Kamyon tasidi");
    }
}
