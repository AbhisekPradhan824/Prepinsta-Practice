package prepinsta;

import java.util.Scanner;

public class Perfect_Number_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number=scn.nextInt();
		
		if(isPerfect(number)) {
			System.out.println("The number "+ number + " is a Perfect Number");
		}else {
			System.out.println("The number "+ number + " is not a Perfect Number");
		}
		
		scn.close();
	}
	static boolean isPerfect(int number) {
		int sum=0;
		
		for(int i=1; i<=number/2; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}

		return number==sum;
	}

}
