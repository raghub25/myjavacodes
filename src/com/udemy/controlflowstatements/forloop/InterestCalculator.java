package com.udemy.controlflowstatements.forloop;

public class InterestCalculator {

	public static void main(String[] args) {
		// Increment loop
		for (int i = 2; i < 9; i++) {
			System.out
					.println("10,000 at " + i + " % interest is " + String.format("%.2f", calculateInterest(10000, i)));
		}

		System.out.println();

		// Decrement loop
		for (int i = 8; i >= 2; i--) {
			System.out
					.println("10,000 at " + i + " % interest is " + String.format("%.2f", calculateInterest(10000, i)));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
