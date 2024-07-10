package creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl;

import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Color;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Shape;

public class AppForTestingAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.createShape();
		circle.draw();
		Color red = shapeFactory.createColor();
		red.fill();
		AbstractFactory colorFactory = new ColorFactory();
		Shape rectangle = colorFactory.createShape();
		rectangle.draw();
		Color blue = colorFactory.createColor();
		blue.fill();
	}

}
