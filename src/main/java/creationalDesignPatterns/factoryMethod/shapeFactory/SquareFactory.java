package creationalDesignPatterns.factoryMethod.shapeFactory;

import creationalDesignPatterns.factoryMethod.shape.Shape;
import creationalDesignPatterns.factoryMethod.shape.Square;

public class SquareFactory implements ShapeFactory {

	@Override
	public Shape createShape() {
		return new Square();
	}

}
