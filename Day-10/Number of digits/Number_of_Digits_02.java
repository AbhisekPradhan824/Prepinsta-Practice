package prepinsta;

import java.util.Scanner;

public class Number_of_Digits_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =scn.nextInt();
		
		int digits = (int)(Math.log10(num))+1;
		System.out.println(digits);
    scn.close();
	}
}
