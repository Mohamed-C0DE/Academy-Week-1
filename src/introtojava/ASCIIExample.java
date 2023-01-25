package introtojava;

public class ASCIIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a = 0;
		  int b = 1;
		  int c = 0;
		  while (c <= 34) {
			  if (c == 0) {
				  System.out.println(a);
				  System.out.println(b);
			  } else {
				  System.out.println(c);
			      c = a + b;
			      a = b;
			      b = c;
			  }
		  }

	}

}
