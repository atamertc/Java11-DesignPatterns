package com.atamertc.sabah.b_03_factory;

public class Gemi extends Tasima{

    public Gemi() {
        super(TasimaTip.DENIZ);
        tasi();
    }

    @Override
    void tasi() {
        System.out.println("Gemi tasidi");
    }

}
