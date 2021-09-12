package com.explane5;

public class CarManager {


	public static void main(String[] args) {
		Car FirstCar = new Car("TOYOTA Prius", Color.WHITE, 2008, 15000, 1200);
		Car SecondCar = new Car("Renault Logan", Color.BLUE, 2000, 9700, 1600);
		Car ThirdCar = new Car("Renault Logan", Color.BLUE, 2000, 9700, 1600);

		FirstCar.addDistance(1000);
		FirstCar.addDistance(3500);

		System.out.println("Model" + "	" + "Color" + "	" + "Year" + "	" + "Price $" + "	" + "Weight kg");
//		System.out.println(FirstCar.carColor);
		System.out.println(FirstCar);
		System.out.println(SecondCar);

		System.out.println(FirstCar.equals(ThirdCar));
		System.out.println(SecondCar.equals(ThirdCar));
	}
}
