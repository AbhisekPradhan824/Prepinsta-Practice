package prepinsta;

import java.util.Scanner;

public class ArmstrongNumber_Iterator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n= scn.nextInt();
		
		int size=getLength(n);
		
		if(IsArmstrong(n, size)) {
			System.out.println("The number "+ n + " Is an Armstrong number");
		}else {
			System.out.println("The number "+ n + " Is not an Armstrong number");
		}
		
		scn.close();

	}
	
	
	//Method for get Length of the Number
	 static int getLength(int num) {
		 int length=0;
		  
		 while(num!=0) {
			 length++;
			 num/=10;
		 }
		 return length;
	 }
	 
	 
	 
	 //Method for checking whether this number is an Armstrong number or not by taking 2 argument as input
	 //i.e., The number (num) and Length of that Number (length). and return true or false based on result.
	 static boolean IsArmstrong(int num, int length) {
		 int temp=num;
		 int sum=0;
		 
		 while(temp!=0) {
			 sum+=Math.pow(temp%10, length);
			 temp/=10;
		 }
		 
		 return num==sum;
	 }

}
