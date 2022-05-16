package controlstatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner s  = new Scanner(System.in);
//		f.factorialUsingLoop(5);

		int result = f.factorialUsingRecursion(5);
		System.out.println(result);
		s.close();

	}
	void factorialUsingLoop(int n){
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result *i;
		}
		System.out.println("Factorial of "+n+" - "+result);
	}

	int factorialUsingRecursion(int n){
		int result=1;
		if(n>1) {
			result = n * factorialUsingRecursion(n-1);
		}
		return result;
	}
}
