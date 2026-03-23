package prepinsta;

import java.util.Scanner;

public class Binary_to_Decimal {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Binary Digit: ");
		int binary=scn.nextInt();
		int decimal = 0;
		int power=0;
		int tempbinary=binary;
		
		while(tempbinary>0) {
		int temp=tempbinary%10;
		decimal+=temp*Math.pow(2, power);
		tempbinary/=10;
		power++;
		}
		
		System.out.println("Decimal of the Binary digit "+ binary + " is "+decimal);
		scn.close();
	}

}
