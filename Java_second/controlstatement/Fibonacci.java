package controlstatement;

public class Fibonacci {
	static Long [] fibonacciCache ;
	public static void main(String[] args) {
		int n = 10000;

		Fibonacci fb = new Fibonacci();
//		fb.fibonacciUsingLoop(10);
		fibonacciCache = new Long[n+1];
		for (Long long1 : fibonacciCache) {
			System.out.print(long1+" ");
		}
		
//		System.out.println(fibonacciCache[10]);
//		 long f = fb.fibonacciUsingRecursion(n);
//		 System.out.println(f);

	}

//	private long fibonacciUsingRecursion(int n) {
//	
//	}

	void fibonacciUsingLoop(int n) {
		int a = 0;
		int b = 1;
		int c;
		if (n == 0) {
			System.out.println("Enter proper number !!");
			return;
		}
		if (n == 1) {
			System.out.print(0);
			return;
		}
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
