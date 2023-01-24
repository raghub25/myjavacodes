package com.udemy.controlflowstatements.whileloop;

//Write a method named hasSameLastDigit with three parameters of type int. 
//
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive). 
//If one of the numbers is not within the range, the method should return false.
//
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		return ((isValid(num1) && isValid(num2) && isValid(num3))
				&& ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num3 % 10 == num1 % 10)));
	}

//	Write another method named isValid with one parameter of type int.
//
//	The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

	public static boolean isValid(int num) {
		return (num >= 10 && num <= 1000);
	}

}
