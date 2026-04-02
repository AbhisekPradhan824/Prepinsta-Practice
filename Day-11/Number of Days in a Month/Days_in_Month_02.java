package prepinsta;

import java.util.Scanner;

public class Days_in_Month_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Month Number ");
		int month = scn.nextInt();
		System.out.println("Enter the Year ");
		int year = scn.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of Days is 31..");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of Days is 30..");
			break;
		case 2: 
			if((month == 2 )&& ((year%4==0)||(year%100 !=0 && year%400==0) )) {
				System.out.println("Number of Days is 29..");
			}else {
				System.out.println("Number of Days is 28..");				
			}
			break;
		default:
			System.out.println("Please enter a valid Number 1 to 12 ");
		}
		
		scn.close();
	}
}
