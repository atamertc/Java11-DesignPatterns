package com.atamertc.sabah.b_03_factory;

public abstract class Tasima {
    private TasimaTip tip;

    public Tasima(TasimaTip tip) {
        this.tip = tip;
    }

    abstract void tasi();


}
