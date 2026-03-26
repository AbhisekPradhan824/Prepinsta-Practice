package prepinsta;

import java.util.Scanner;

public class Number_as_Sum_of_Prime_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		 System.out.print("Enter the Number: ");
		 int num = scn.nextInt();
		 int x=0;
		 
		 for(int i=2; i<num; i++) {
			 if(isPrime(i)&&isPrime(num-i)) {
				 System.out.println(num + " = "+ i+"+"+ (num-i));
				 x=1;
			 }
		 }
		 
		 if(x==0) {
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
