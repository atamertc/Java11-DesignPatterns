package com.atamertc.sabah.b_03_factory;

import java.util.List;

/*
Bazi nesneleri turetirken bagimliliktan kacinmak ve genisletebilrligi saglamaka icin
uretimi bir factory'e birakma calismasi.

Detaylar nesnenin nasil olusturulacagi soyutlanir.

Nasil uygulanir:
1- Enum'i yazin.
2- Abstract classinizi yazin.
3- Extend edilecek alt classlarinizi yazin
4- Factory classinizi yazin. switch-caseleri kurun
 */
public class FactoryOrnek {
    public static void main(String[] args) {
//        Kamyon kamyon1 = new Kamyon();
//        kamyon1.tasi();
//
//        Gemi gemi1 = new Gemi();
//        gemi1.tasi();
//
//        Tasima tasima = new Tasima();
//        tasima.tasi();

        Tasima tasima;
        tasima = TasimaFactory.builder(TasimaTip.KARA);
        tasima = TasimaFactory.builder(TasimaTip.DENIZ);


    }
}
