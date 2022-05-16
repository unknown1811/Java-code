package controlstatement;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name - ");
		String name = s.next();
		System.out.println("Enter Phone Number - ");
		long phone = s.nextLong();
		System.out.println("Name - "+name+" phone - "+ phone);
		s.close();
	}

}
