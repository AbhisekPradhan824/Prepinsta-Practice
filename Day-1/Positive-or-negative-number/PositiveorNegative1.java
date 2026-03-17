package prepinsta;

import java.util.Scanner;

public class PositiveorNegative01 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int number=scn.nextInt();
		
		if(number > 0) {
			System.out.println("Positive Number..");
		}else if (number==0) {
			System.out.println("Number is Zero..");
		}else {
			System.out.println("Negative Number..");
		}

	}

}
