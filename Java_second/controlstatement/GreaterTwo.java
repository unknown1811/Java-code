package controlstatement;

public  class GreaterTwo {

	static public  void main(String[] args) {
		int c= 120, b = 130, a = 400;
		if (a > b) {
			if (a > c)
				System.out.println("A is greater");
			else
				System.out.println("C is greater");
		}  
		else if(b>c) {
			
				System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
