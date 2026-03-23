package prepinsta;

import java.util.Scanner;

public class Octal_to_Decimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Octal Number");
		int octal=scn.nextInt();
		
		int decimal=0;
		
		int power=0;
		while(octal>0) {
			int temp=octal%10;
			decimal+=temp*Math.pow(8, power);
			power++;
			octal/=10;
		}
		System.out.println("Decimal Value: "+ decimal);
		scn.close();

	}

}
