package com.udemy.controlflowstatements.whileloop;

public class EvenNumber {

	public static void main(String[] args) {
		int start = 3;
		int end = 22;
		int count = 0;
		while (start <= end) {
			start++;
			if (!isEvenNumber(start)) {
				continue;
			}
			count++;
			if (count == 5) {
				break;
			}
		}

		System.out.println("Total even numbers found: " + count);
	}

	public static boolean isEvenNumber(int n) {
		return n % 2 == 0;
	}

}
