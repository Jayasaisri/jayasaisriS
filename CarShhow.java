package com.mupack.colldemo;

import java.util.List;

public class CarShow {
	
	private String name;
	private int CarShowId;
	
	List<Car> cars;
	
	public CarShow(String name, int CarshowId, List<Car> cars) {
		super();
		this.name = name;
		CarShowId = carshowId;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarShowId() {
		return CarShowId;
	}

	public void setCarShowId(int CarshowId) {
		CarShowId = carshowId;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	

	@Override
	public String toString() {
		return "CarShow [name=" + name + ", CarShowId=" + CarShowId + ", cars=" + cars + "]";
	}



	public CarShow() {}
	
	


}
		
		

