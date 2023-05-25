package com.atamertc.aksam.b_01_singleton.enums;

public class Test {
    public static void main(String[] args) {

        EvHalki anne = new EvHalki();
        EvHalki baba = new EvHalki();
        EvHalki cocuk = new EvHalki();

        anne.start();
        baba.start();
        cocuk.start();
    }
}
