package introtojava;

import java.util.*;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int userInput = scanner.nextInt();
		
		if (userInput > 0) {
			int a = 0;
		    int b = 1;
			int c = 0;
			
			int[] arr = new int[userInput];
			
			for (int i = 0; i <= userInput - 1; i++) {
				arr[i] = a;
				c = a + b;
				a = b;
				b = c;
			}
			
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("Enter a postive number!");
		}
		
	}
	
}
