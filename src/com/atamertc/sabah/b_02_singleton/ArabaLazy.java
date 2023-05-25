package com.atamertc.sabah.b_02_singleton;

public class ArabaLazy {

    //LazyLoad yöntemi:
    private static ArabaLazy instance = null;
    String marka;

    private ArabaLazy(String marka) {
        this.marka = marka;
        System.out.println("Bos const calisti");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public static ArabaLazy getInstance(String marka) {
        if (instance == null) {
            return instance = new ArabaLazy(marka);
        }
        return instance;

    }
    //static: keywordu ile isaretlenen bilesenlerin tumu uygulama ayaga kalkarken
    //adreslenirler. Bu sayede hepsi sinifa baglidir. Nesneye degil.
}
