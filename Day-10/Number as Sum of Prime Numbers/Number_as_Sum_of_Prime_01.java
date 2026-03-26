package prepinsta;

import java.util.Scanner;

public class Number_as_Sum_of_Prime_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		 System.out.print("Enter the Number: ");
		 int num = scn.nextInt();
		 
		 int num1=0;
		 int num2=0;
		 
		 for(int i=2; i<num; i++) {
			 if(isPrime(i)&&isPrime(num-i)) {
				 num1=i;
				 num2 = num-i;
			 }
		 }
		 
		 if(num1==0 && num2==0) {
			 System.out.println(num + " Number can't expressed as sum of two Prime Numbers..");
		 }else if((num1!=0 && num2!=0) && (num1!=num2)) {
			 System.out.println(num + " Number can be expressed as sum of two Prime Numbers  where first Number is "+num1+ " and 2nd Number is "+num2);
		 }else {
			 System.out.println(num + " Number can't expressed as sum of two Prime Numbers..");
		 }
		  scn.close();
	}
	
	static boolean isPrime(int num) {
		
		if(num<2) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
}
