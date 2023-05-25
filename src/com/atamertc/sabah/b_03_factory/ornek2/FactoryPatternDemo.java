package com.atamertc.sabah.b_03_factory.ornek2;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Shape shape;
        shape = ShapeFactory.builder(ShapeType.DAIRE);
        shape = ShapeFactory.builder(ShapeType.DIKDORTGEN);
        shape = ShapeFactory.builder(ShapeType.KARE);
    }
}
