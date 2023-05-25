package com.atamertc.sabah.b_03_factory.ornek2;

import com.atamertc.sabah.b_03_factory.Gemi;
import com.atamertc.sabah.b_03_factory.Kamyon;
import com.atamertc.sabah.b_03_factory.Tasima;
import com.atamertc.sabah.b_03_factory.TasimaTip;

public class ShapeFactory {
    public static Shape builder(ShapeType tip) {
        switch (tip) {
            case DAIRE -> {
                return new Circle();
            }
            case KARE -> {
                return new Square();
            }
            case DIKDORTGEN -> {
                return new Rectangle();
            }
            default -> {
                return null;
            }
        }
    }
}
