package com.atamertc.aksam.b_02_factory.pizzaApp;

public class VeganPizza extends Pizza {


    public VeganPizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        super(fiyat, tur, boyut, hamurTipi);
    }

    public VeganPizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        super(tur, boyut, hamurTipi);
    }

}
