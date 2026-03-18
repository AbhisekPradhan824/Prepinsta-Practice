package prepinsta;

import java.util.Scanner;

public class CheckLeapYearUsingIfElse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Year..");
		int year=scn.nextInt();
		
		if((year % 400 ==0) ||(year%4==0 && year%100 !=0)) {
			System.out.println(year+ " Is a Leap Year");
		}else {
			System.out.println(year+ " Is not a Leap Year");
		}
		
		scn.close();

	}

}
