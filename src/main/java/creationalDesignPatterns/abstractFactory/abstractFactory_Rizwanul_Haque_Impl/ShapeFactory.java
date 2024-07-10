package creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl;

import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Color;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Red;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Circle;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Shape;

public class ShapeFactory implements AbstractFactory {
	@Override
	public Shape createShape() {
		return new Circle();
	}

	@Override
	public Color createColor() {
		return new Red();
	}
}
