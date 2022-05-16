package controlstatement;

public class ArmStrong {

	public static void main(String[] args) {
		int num = 371;
		int temp = num;
		int len = 0;
		while (temp != 0) {
			temp /= 10;
			len++;
		}

		temp = num;
		int arm = 0;

		for (int i = 0; i < len; i++) 
		{
			int rem = temp % 10;
			int j = len;
			int mul = 1;
			while (j > 0) {
				mul = mul * rem;
				j--;
			}
			arm = arm + mul;
			temp = temp/10;
		}
		System.out.println(arm);
		if (arm == num)
			System.out.println(num + " is Armstrong Number");
		else
			System.out.println(num + " is not Armstrong Number");
	}

}
