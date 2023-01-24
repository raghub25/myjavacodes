package com.udemy.methodoverloading;

public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / (365 * 24 * 60);
			long days = (minutes / (24 * 60)) % 365;
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
}
