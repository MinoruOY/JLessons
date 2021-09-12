package com.explane6;

import com.explane5.Car;
import com.explane5.Color;

public class PassengerCar extends Car {

	public PassengerCar(String carModel, Color carColor, int carYear, int carPrice, int carWeight) {
		super(carModel, carColor, carYear, carPrice, carWeight);
	}

	@Override
	public boolean readyService() {
		if (carServise > 10000) {
			return true;
		} else {
			return false;
		}
	}
}
