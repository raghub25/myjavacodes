package com.udemy.methodoverloading;

public class FeetToCentimeters {
	public static double calcFeetAndInchesToCentiemeters(double feet, double inches) {
		if (feet >= 0 && (inches >= 0 && inches <= 12)) {
			return (feet * 12 * 2.54 + (inches * 2.54));
		}
		return -1;
	}
//    public static double calcFeetAndInchesToCentiemeters(double inches){
//
//    }
}
