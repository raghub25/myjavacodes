package com.udemy.oops.intro;

public class Main {

	public static void main(String[] args) {
//		SimpleCalculator calculator = new SimpleCalculator();
//		calculator.setFirstNumber(5.0);
//		calculator.setSecondNumber(4);
//		System.out.println("add= " + calculator.getAdditionResult());
//		System.out.println("subtract= " + calculator.getSubtractionResult());
//		calculator.setFirstNumber(5.25);
//		calculator.setSecondNumber(0);
//		System.out.println("multiply= " + calculator.getMultiplicationResult());
//		System.out.println("divide= " + calculator.getDivisionResult());

//		Person person = new Person();
//		person.setFirstName(""); // firstName is set to empty string
//		person.setLastName(""); // lastName is set to empty string
//		person.setAge(10);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setFirstName("John"); // firstName is set to John
//		person.setAge(18);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setLastName("Smith"); // lastName is set to Smith
//		System.out.println("fullName= " + person.getFullName());

		BankAccount account = new BankAccount();
		account.setAccountNumber("243242342");
		account.setBalance(12000);
		account.setEmail("raghu25.raman@gmail.com");
		account.setName("Raghuraman");
		account.setPhoneNumber("8754917047");
		account.depositFunds(3000);
		account.withdrawFunds(16000);
		account.depositFunds(2000);
		account.withdrawFunds(16000);

	}

}
