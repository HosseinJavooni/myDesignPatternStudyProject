package creationalDesignPatterns.factoryMethod.shapeFactory;

import creationalDesignPatterns.factoryMethod.shape.Rectangle;
import creationalDesignPatterns.factoryMethod.shape.Shape;

public class RectangleFactory implements ShapeFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
