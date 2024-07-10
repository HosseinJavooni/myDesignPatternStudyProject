package creationalDesignPatterns.factoryMethod;

import creationalDesignPatterns.factoryMethod.shape.Shape;
import creationalDesignPatterns.factoryMethod.shapeFactory.CircleFactory;
import creationalDesignPatterns.factoryMethod.shapeFactory.RectangleFactory;
import creationalDesignPatterns.factoryMethod.shapeFactory.ShapeFactory;
import creationalDesignPatterns.factoryMethod.shapeFactory.SquareFactory;

public class AppForTestingFactoryMethod {

	public static void main(String[] args) {
		ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
        
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
        
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
	}
}
