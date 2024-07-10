package creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl;

import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.manufacturer.AsusManufacturer;
import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.manufacturer.Company;
import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.manufacturer.MsiManufacturer;
import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.products.gpu.Gpu;
import creationalDesignPatterns.abstractFactory.abstractFactory_Geekific_Impl.products.monitor.Monitor;

public class AppForTestingAbastractFactory_Geekific_Sample {
	public static void main(String[] args){
		Company msi = new MsiManufacturer();
		Gpu msiGpu = msi.createGpu();
		Monitor msiMonitor = msi.createMonitor();
		
		Company asus = new AsusManufacturer();
		Gpu asusGpu = asus.createGpu();
		Monitor asusMonitor = asus.createMonitor();
	}
}
