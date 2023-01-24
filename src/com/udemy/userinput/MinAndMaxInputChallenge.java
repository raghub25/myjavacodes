package com.udemy.userinput;

import java.util.Scanner;

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message gEnter number:h
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint: 
//-Use an endless while loop.
//
//Bonus: 
//-Create a project with the name MinAndMaxInputChallenge.

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		while (true) {
			boolean isInt = sc.hasNextInt();
			if (isInt) {
				int num = sc.nextInt();
				if (flag) {
					flag = false;
					min = num;
					max = num;
				}
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			} else {
				break;
			}
			sc.nextLine();
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		sc.close();
	}

}
