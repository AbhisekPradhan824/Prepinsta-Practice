package prepinsta;

import java.util.Scanner;

public class Oct_to_Bin_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your Octal Value: ");
		int octal=scn.nextInt();
		
		int decimal = getDecimal(octal);
		System.out.println("Decimal value: "+ decimal);
		System.out.print("Binary Value: ");
		getoctal(decimal);
		
		scn.close();
		
		
	}
	static int getDecimal(int octal) {
		int decimal=0;
		int power=0;
		while(octal!=0) {
			int temp=octal%10;
			decimal+=temp*Math.pow(8, power);
			power++;
			octal/=10;
		}
		return decimal;
	}
	
	static void getoctal(int decimal) {
		int octal[] = new int[20];
		int i=0;
		while(decimal!=0) {
			int rem =decimal%2;
			octal[i++] = rem;
			decimal/=2;
		}
		
		for(int j=i-1; j>=0; j--) {
			System.out.print(octal[j]);
		}
		
		
	}

}
