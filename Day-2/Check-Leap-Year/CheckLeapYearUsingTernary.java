package prepinsta;

import java.util.Scanner;

public class CheckLeapYearUsingTernary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Year..");
		int year=scn.nextInt();
		 
		String msg=(year % 400 ==0) ||(year%4==0 && year%100 !=0) ? " Is a Leap Year" : " Is Not a Leap Year";
		
		System.out.println(year+ msg);
		scn.close();

	}

}
