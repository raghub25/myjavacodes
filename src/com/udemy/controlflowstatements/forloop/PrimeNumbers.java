package com.udemy.controlflowstatements.forloop;

public class PrimeNumbers {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 10; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
				if (count == 10) {
					break;
				}
			}
		}

	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
