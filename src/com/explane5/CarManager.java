package com.explane5;

public class CarManager {


	public static void main(String[] args) {
		Car FirstCar = new Car("TOYOTA Prius", "Green", 2008, 15000, 1200);
		Car SecondCar = new Car("Renault Logan", "Blue", 2000, 9700, 1600);

//		System.out.println("Model" + "	" + "Color" + "	" + "Year" + "	" + "Price $" + "	" + "Weight kg");
//		System.out.println(FirstCar.CarColor);
		System.out.println(FirstCar);
		System.out.println(SecondCar);
	}
}
