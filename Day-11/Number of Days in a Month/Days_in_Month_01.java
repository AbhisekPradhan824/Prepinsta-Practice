package prepinsta;

import java.util.Scanner;

public class Days_in_Month_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Month Number ");
		int month = scn.nextInt();
		System.out.println("Enter the Year ");
		int year = scn.nextInt();
		
		if(month <1 || month >12) {
			System.out.println("Please enter a valid Number 1 to 12 ");
		}
		else if((month == 2 )&& ((year%4==0)||(year%100 !=0 && year%400==0) )){
			System.out.println("Number of Days is 29..");
		}else if(month ==2) {
			System.out.println("Number of Days is 28..");
		}else if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month==10 || month ==12) {
			System.out.println("Number of Days is 31..");
		}else {
			System.out.println("Number of Days is 30..");
		}
		scn.close();
	}
}
