package creationalDesignPatterns.abstractFactory;

import creationalDesignPatterns.abstractFactory.color.Color;
import creationalDesignPatterns.abstractFactory.shape.Shape;

public interface AbstractFactory {
    Shape createShape();
    Color createColor();
}
