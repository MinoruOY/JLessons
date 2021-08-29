package com.explane4;

public class Logic {

	public static void main(String[] args) {
		double o = 324234.34;
		double p = 31242.555;
		boolean answer1 = o > p;

		double b = p / o;

		boolean answer2;
		if (b > 1) {
			answer2 = true;
		} else {
			answer2 = false;
		}

		System.out.println(answer1 + "	" + b + "	" + answer2);
	}
}
