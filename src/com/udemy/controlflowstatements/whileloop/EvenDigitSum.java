package com.udemy.controlflowstatements.whileloop;

//Write a method named getEvenDigitSum with one parameter of type int called number.

//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if (number < 0) {
			return -1;
		}
		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				sum += rem;
			}
			number /= 10;
		}
		return sum;
	}

}
