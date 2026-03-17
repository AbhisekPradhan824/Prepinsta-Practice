package prepinsta;

import java.util.Scanner;

public class SumofFirstNNaturalNumbers01 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int number=scn.nextInt();
		int sum=0;
		
		for(int i=0; i<=number; i++) {
			sum+=i;
		}
		
		System.out.println("Sum of  First " + number + " number is: "+ sum);

	}

}
