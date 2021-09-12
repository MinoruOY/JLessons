package com.explane5;

import com.explane6.Serviceable;

public abstract class Car implements Serviceable {

	String carModel;
	Color carColor;
	int carYear;
	int carPrice;
	int carWeight;
	private int carDistance = 0;
	protected int carServise = 0;

	public Car(String carModel, Color carColor, int carYear, int carPrice, int carWeight) {
		this.carModel = carModel;
		this.carColor = carColor;
		this.carYear = carYear;
		this.carPrice = carPrice;
		this.carWeight = carWeight;
	}

	public void addDistance(int additionalDistance) {
		carDistance += additionalDistance;
		carServise += additionalDistance;
	}

	public int getCarServise() {
		return carServise;
	}

	public int getCarDistance() {
		return carDistance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Car car = (Car) o;

		if (carYear != car.carYear) return false;
		if (carPrice != car.carPrice) return false;
		if (carWeight != car.carWeight) return false;
		if (carModel != null ? !carModel.equals(car.carModel) : car.carModel != null) return false;
		return carColor == car.carColor;
	}

	@Override
	public int hashCode() {
		int result = carModel != null ? carModel.hashCode() : 0;
		result = 31 * result + (carColor != null ? carColor.hashCode() : 0);
		result = 31 * result + carYear;
		result = 31 * result + carPrice;
		result = 31 * result + carWeight;
		return result;
	}

	@Override
	public String toString() {
		return "Car{" +
				"carModel='" + carModel + '\'' +
				", carColor=" + carColor +
				", carYear=" + carYear +
				", carPrice=" + carPrice +
				", carWeight=" + carWeight +
				", carDistance=" + carDistance +
				", carServise=" + carServise +
				'}';
	}
}
