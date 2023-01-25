package introtojava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
	    int b = 1;
		int c = 0;
		while (a <= 34) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

}
