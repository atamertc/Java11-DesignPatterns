package com.atamertc.sabah.b_02_singleton;

/*
Olusturulan sinifin sadece bir tane instance'i olmasi icin kullanilir.
Neden kullanicinin istedigi kadar nesne uretmesini istemeyebiliriz.
- Bellek problemleri
- Performans problemleri

Singleton sinifa ait instance a ulasmak icin global erisimi kapatmaktir.

Nasil uygulanir:
1- Constructor private olmalidir -> disaridan newlemeyi engeller
2- Sinif icinde kendi turunden instance private static olarak olusturulur
3- Bu tutulan instance'ı döndürmek için public static bir metod olmalıdır.
 */
public class SingletonOrnek {
    public static void main(String[] args) {

//        Araba a1 = new Araba();
//        Araba a2 = new Araba();
//        Araba a3 = new Araba();
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);

//        Araba a1 = new Araba();
//        System.out.println(a1);
//        a1 = new Araba();
//        System.out.println(a1);

        ArabaLazy a1 = ArabaLazy.getInstance("Toyota");
        ArabaLazy a2 = ArabaLazy.getInstance("Opel");
        ArabaLazy a3 = ArabaLazy.getInstance("Fiat");
        System.out.println(a1.getMarka());
        System.out.println(a2.getMarka());
        System.out.println(a3.getMarka());

        ArabaEager eager1 = ArabaEager.getInstance();
        ArabaEager eager2 = ArabaEager.getInstance();
        ArabaEager eager3 = ArabaEager.getInstance();
        System.out.println(eager1);
        System.out.println(eager2);
        System.out.println(eager3);
    }
}
