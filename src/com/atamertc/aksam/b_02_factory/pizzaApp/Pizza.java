package com.atamertc.aksam.b_02_factory.pizzaApp;

public class Pizza {

    private double fiyat;
    private ETur tur;
    private EBoyut boyut;
    private EHamurTipi hamurTipi;

    public Pizza(double fiyat, ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        this.fiyat = fiyat;
        this.tur = tur;
        this.boyut = boyut;
        this.hamurTipi = hamurTipi;
    }

    public Pizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
        this.tur = tur;
        this.boyut = boyut;
        this.hamurTipi = hamurTipi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public ETur getTur() {
        return tur;
    }

    public void setTur(ETur tur) {
        this.tur = tur;
    }

    public EBoyut getBoyut() {
        return boyut;
    }

    public void setBoyut(EBoyut boyut) {
        this.boyut = boyut;
    }

    public EHamurTipi getHamurTipi() {
        return hamurTipi;
    }

    public void setHamurTipi(EHamurTipi hamurTipi) {
        this.hamurTipi = hamurTipi;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "fiyat=" + fiyat +
                ", tur=" + tur +
                ", boyut=" + boyut +
                ", hamurTipi=" + hamurTipi +
                '}';
    }
}
