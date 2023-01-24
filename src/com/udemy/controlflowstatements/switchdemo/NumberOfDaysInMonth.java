package com.udemy.controlflowstatements.switchdemo;

public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		return ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)));
	}

	public static int getDaysInMonth(int month, int year) {
		if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
			switch (month) {
			case 2:
				return isLeapYear(year) ? 29 : 28;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return 31;
			}
		}
		return -1;
	}
}
