package introtojava;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your a Number: ");
		
		int userInput = scanner.nextInt();
		
		if (userInput < 0) {
			System.out.println("The number you entered is a negative number!");
		} else {
			System.out.println("The number you entered is a positive number!");
		}
		

	}

}
