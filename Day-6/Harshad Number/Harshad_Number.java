/**
 * A number is said to be harshad number if the sum of digits of that number is also divisible by the number
 * Ex: 18 =>  here  2 digits 1, and 8 and sum is 1+8=9 which is divisible by the number 18 so it is a harshad number
 * EX: 22 => 2+4 =4 which is not divisible by 22 so it is not a harshad number...
 */


package prepinsta;

import java.util.Scanner;

public class Harshad_Number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number..");
		int num=scn.nextInt();
		
		int sum=0;
		int temp=num;
		
		while(temp!=0) {
			sum+= temp%10;
			temp/=10;
		}
		if(num%sum==0) {
			System.out.println("The number "+ num + " is a harshad number");
		}else {
			System.out.println("The number "+ num + " is not a harshad number");
		}
		scn.close();

	}

}
