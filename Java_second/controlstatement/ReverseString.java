package controlstatement;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Bhargav";
		ReverseString r = new ReverseString();
//		r.reverseString(s);
		
		int len = s.length() -1;
		String reverse = "" ;
		while (len >= 0) {
//			System.out.println(len + reverse);
			reverse += s.charAt(len);
			len--;
		}
		System.out.println(reverse);
	}
	
	void reverseString(String s) {
		int len = s.length() -1;
		String reverse = "" ;
		while (len >= 0) {
			System.out.println(len + reverse);
			reverse += s.charAt(len);
			len--;
		}
//		System.out.println(reverse);
	}

}
