package com.mupack.colldemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CarShow {
	Map<String, List<Car>> carsection1;
	public void displayCarsByCarShowName1(String name)
	{
		List<Car> cars=carsection1.get(name);
		for(Car car:cars)
		{
			System.out.println(car);
		}
		System.out.println();
}

-------------------------------------------------------------------------------------
Map<String, List<Car>> carsection2;

	public void displayByCarShowName2(String name) {
		List<Car> cars = carsection2.get(name);
		
		System.out.println("ToString meth - sort based on mfg year");
		Collections.sort(cars, new MfgSort());		
		for(Car car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
		
		
		System.out.println("ToString meth - sort based on name");
		Collections.sort(cars, new CarNameSort());		
		for(Car car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
	}
	-----------------------------------------------------------------------------------------
  
  Map<String, List<Car>> carsection3;

	public void displayByCarShowName3(String name) {
		List<Car> cars = carsection3.get(name);
		
		System.out.println("Display meth to sort based on mfg year");
		Collections.sort(cars, new MfgSort());		
		for(Car car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
		
		
		System.out.println("Display meth to sort based on name");
		Collections.sort(cars, new CarNameSort());		
		for(Car car:cars)
		{
			car.DisplayCarDetails();
			
		}
		System.out.println();
	}
  
  	
		Car car1 = new Car(1,"Verna",1998);
		Car car2 = new Car(2,"Baleno",1945);
		Car car3 = new Car(3,"Breeza",2000);
		Car car4 = new Car(4,"Benz",1993);
		Car car5 = new Car(5,"Jaguar",2006);
		
		List<Car> cars11 = new Vector<Car>();
		
		cars11.add(car1);
		cars11.add(car2);
		cars11.add(car3);
		cars11.add(car4);
		cars11.add(car5);
		
		CarShow carshow1 = new CarShow("Maruti Suzuki",11,cars11);
		
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
