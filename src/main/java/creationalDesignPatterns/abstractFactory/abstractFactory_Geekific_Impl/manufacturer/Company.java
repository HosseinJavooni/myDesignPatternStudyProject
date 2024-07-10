package creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.manufacturer;

import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.products.gpu.Gpu;
import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.products.monitor.Monitor;

public abstract class Company {
	// business logic can be added here
	public abstract  Gpu createGpu() ;
	public abstract Monitor createMonitor();
}
