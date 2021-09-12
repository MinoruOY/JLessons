package com.explane5;

import com.explane6.Bus;
import com.explane6.PassengerCar;

public class CarManager {


	public static void main(String[] args) {
		Car FirstCar = new PassengerCar("TOYOTA Prius", Color.WHITE, 2008, 15000, 1200);
		Car SecondCar = new Bus("Renault Logan", Color.BLUE, 2000, 9700, 1600);
		Car ThirdCar = new PassengerCar("Renault Laguna", Color.BLUE, 2000, 9700, 1600);

		FirstCar.addDistance(15000);
		SecondCar.addDistance(55000);

//		System.out.println("Model" + "	" + "Color" + "	" + "Year" + "	" + "Price $" + "	" + "Weight kg");

		System.out.println(FirstCar);
		System.out.println(SecondCar);
		System.out.println(ThirdCar);

		System.out.println(FirstCar.readyService());
		System.out.println(SecondCar.readyService());
		System.out.println(ThirdCar.readyService());

//		System.out.println(FirstCar.equals(ThirdCar));
//		System.out.println(SecondCar.equals(ThirdCar));
	}
}
