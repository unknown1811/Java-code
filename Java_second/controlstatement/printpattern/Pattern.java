package controlstatement.printpattern;

public class Pattern {

	public static void main(String[] args) {
		Pattern p = new  Pattern();
//		p.pattern1(5);
		p.pattern2(5);
		

	}
	void pattern1(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=2*i-1 ; j++) {
				if(j%2==0) {
					System.out.print(" ");
				}
				else 
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
