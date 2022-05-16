package controlstatement;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2000;
		/*
		 * if(year %4==0) { if(year%100==0) { if(year %400!=0) {
		 * System.out.println(year+ " is not leap Year"); } else {
		 * System.out.println(year+" is leap Year"); } } else {
		 * System.out.println(year+" is leap Year"); } } else {
		 * System.out.println(year+" is not leap Year"); }
		 */
		if(year%400==0 || (year%100!=0 && year%4==0))
			System.out.println(year + " is leap Year");
		else
			System.out.println(year+" is not leap Year");
	}
	

}
