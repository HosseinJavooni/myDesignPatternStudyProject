package creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl;

import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Blue;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.color.Color;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Rectangle;
import creationalDesignPatterns.abstractFactory.abstractFactory_Rizwanul_Haque_Impl.shape.Shape;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape createShape() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

	@Override
	public Color createColor() {
		// TODO Auto-generated method stub
		return new Blue();
	}

}
