package creationalDesignPatterns.factoryMethod.shapeFactory;

import creationalDesignPatterns.factoryMethod.shape.Circle;
import creationalDesignPatterns.factoryMethod.shape.Shape;

public class CircleFactory implements ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
