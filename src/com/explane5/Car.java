package com.explane5;

public class Car {

	String CarModel;
	String CarColor;
	int CarYear;
	int CarPrice;
	int CarWeight;

	public Car(String carModel, String carColor, int carYear, int carPrice, int carWeight) {
		CarModel = carModel;
		CarColor = carColor;
		CarYear = carYear;
		CarPrice = carPrice;
		CarWeight = carWeight;
	}

	@Override
	public String toString() {
		return "Car{" +
				"CarModel='" + CarModel + '\'' +
				", CarColor='" + CarColor + '\'' +
				", CarYear=" + CarYear +
				", CarPrice=" + CarPrice +
				", CarWeight=" + CarWeight +
				'}';
	}
}
