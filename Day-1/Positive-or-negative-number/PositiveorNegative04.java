package prepinsta;

import java.util.Scanner;

public class PositiveorNegative04 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int number=scn.nextInt();
		
		if(number >= 0) {
			String res= (number == 0)? "Number is Zero...":"Number is Positive...";
		}
		else {
			System.out.println("Negative Number..");}
		

	}

}
