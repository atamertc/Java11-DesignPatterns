package com.atamertc.aksam.b_02_factory.pizzaApp;

import java.util.Scanner;

public class PizzaSiparis {
    Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("Pizza Siparis Menu");
        Pizza pizza = pizzaSec();
        siparisHazirla(pizza);
    }

    private void siparisHazirla(Pizza pizza) {
        System.out.println("Siparisiniz=>" + pizza);
        System.out.println("Hazirlaniyor....");
    }

    private Pizza pizzaSec() {
        ETur tur = turSec();
    }

    private ETur turSec() {
        for (ETur tur : ETur.values()) {
            System.out.println((tur.ordinal() + 1) + "- " + tur.name());
        }
        System.out.println("Lutfen bir pizza turu seciniz");
        int secim = Integer.parseInt(scanner.nextLine());
        return ETur.values()[secim - 1];
    }
}
