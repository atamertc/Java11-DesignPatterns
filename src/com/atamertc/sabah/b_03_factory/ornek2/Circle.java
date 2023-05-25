package com.atamertc.sabah.b_03_factory.ornek2;

public class Circle implements Shape{

    public Circle() {
        draw();
    }

    @Override
    public void draw() {
        System.out.println("Daire cizildi");
    }
}
