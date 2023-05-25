package com.atamertc.sabah.b_03_factory.ornek2;

public class Rectangle implements Shape {
    public Rectangle() {
        draw();
    }

    @Override
    public void draw() {
        System.out.println("Dikdortgen cizildi");
    }
}
