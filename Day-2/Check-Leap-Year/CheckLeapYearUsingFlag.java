package prepinsta;

import java.util.Scanner;

public class CheckLeapYearUsingFlag {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Year..");
		int year=scn.nextInt();
		 
		int flag=(year % 400 ==0) ||(year%4==0 && year%100 !=0) ? 1 : 0;
		
		if(flag==1) {
			System.out.println(year + " Is a Leap Year");
		}else {
			System.out.println(year + " Is Not a Leap Year");
		}
		scn.close();

	}

}
