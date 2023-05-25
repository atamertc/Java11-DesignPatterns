package com.atamertc.sabah.b_03_factory.ornek2;

public class Square implements Shape {
    public Square() {
        draw();
    }

    @Override
    public void draw() {
        System.out.println("Kare cizildi");
    }
}
