package prepinsta;

import java.util.Scanner;

public class Friendly_Pair_2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the First Number of the Pair \t: ");
		int num1=scn.nextInt();
		
		System.out.print("\nEnter the Second Number of the Pair \t: ");
		int num2=scn.nextInt();
		System.out.println();
		
		if(isFriendlyPair(num1, num2)) {
			System.out.println(" Yes!, The Numbers "+ num1 + " & "+ num2 + " are Friendly Pair..");
		}else {
			System.out.println(" No!, The Numbers "+ num1 + " & "+ num2 + " are not Friendly Pair.." );
		}
		scn.close();
		
	}
	
	
	//Method For calculating sum of Factors of a Number...
	static int getSumofFactor(int num) {
		int sum=0;
		
		for(int i=1; i<=Math.sqrt(num); i++) {
			
			if(num%i == 0 ) {
				
				if(i==1) {
					sum+=1;
				}else if(num/i == i) {
					sum+=i;
				}else {
					sum =sum+ i + (num/i);
				}
				
			}
		}
		return sum;
	}
	
	
	//Method for Checking Whether these two numbers are Friendly Pair or Not...
	static boolean isFriendlyPair(int num1, int num2) {
		
		int sumofFactor1 = getSumofFactor(num1);
		int sumofFactor2 = getSumofFactor(num2);
		
		double number1Ratio = num1/sumofFactor1;
		double number2Ratio =  num2/sumofFactor2;
		
		return number1Ratio==number2Ratio;
	}
	

}
