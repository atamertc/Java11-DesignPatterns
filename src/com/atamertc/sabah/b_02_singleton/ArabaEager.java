package com.atamertc.sabah.b_02_singleton;
/*
Burdaki sikinti da su:

 */
public class ArabaEager {
    //Eager yöntemi:
    private static ArabaEager instance = new ArabaEager();
    String marka;

    private ArabaEager() {

    }

    public static ArabaEager getInstance() {
        return instance;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
