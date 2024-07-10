package creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl;

import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Color;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Shape;

public interface AbstractFactory {
    Shape createShape();
    Color createColor();
}
