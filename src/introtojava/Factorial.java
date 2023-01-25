package introtojava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the number you want to find the factorial for?");
		
		int userInput = scanner.nextInt();
		
		int sum = 1;
		
		for (int i = 1; i <= userInput; i++) {
			sum *= i;
		}
		
		System.out.println("Factorial of " + userInput + " is: " + sum);
		
	}

}
