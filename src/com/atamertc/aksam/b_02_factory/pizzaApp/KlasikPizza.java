package com.atamertc.aksam.b_02_factory.pizzaApp;

public class KlasikPizza extends Pizza {


    public KlasikPizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        super(fiyat, tur, boyut, hamurTipi);
    }

    public KlasikPizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        super(tur, boyut, hamurTipi);
    }
}
