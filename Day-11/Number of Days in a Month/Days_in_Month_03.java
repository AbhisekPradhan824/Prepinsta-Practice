package prepinsta;

import java.util.Scanner;

public class Days_in_Month_03 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Month Number ");
		int month = scn.nextInt();
		System.out.println("Enter the Year ");
		int year = scn.nextInt();
		
		int[] arr = {31, 28, 31,30, 31, 30,31,31,30,31,30,31};
		
		if((month == 2 )&& ((year%4==0)||(year%100 !=0 && year%400==0) )) {
			System.out.println("Number of Days is 29..");
		}else {
			System.out.println("Number of Days is "+arr[month-1]);				
		}
		
		scn.close();
	}
}
