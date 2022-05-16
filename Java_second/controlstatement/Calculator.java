package controlstatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char ans;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number - ");
			int first = s.nextInt();
			System.out.println("Enter Second number - ");
			int second = s.nextInt();
			System.out.println("Enter Symbol like +,-,* or / for your operation - ");
			char sign = s.next().charAt(0);
			int res;
			switch (sign) {
			case '+':
				res = first + second;
				System.out.println(first + " + " + second + " = " + res);
				break;

			case '-':
				res = first - second;
				System.out.println(first + " - " + second + " = " + res);
				break;

			case '*':
				res = first * second;
				System.out.println(first + " * " + second + " = " + res);
				break;

			case '/':
				res = first / second;
				System.out.println(first + " / " + second + " = " + res);
				break;

			default:
				System.out.println("Enter Proper Operation symbol!");
				break;
			
			}
			System.out.println("To perform operation again press Y -");
			ans = s.next().charAt(0);
		} while (ans=='Y'|| ans=='y');

	}

}
