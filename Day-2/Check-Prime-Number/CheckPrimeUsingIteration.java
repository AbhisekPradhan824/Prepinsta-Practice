package prepinsta;

import java.util.Scanner;

public class CheckPrimeUsingIteration {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int number=scn.nextInt();
		
		IsPrime(number);
		
		scn.close();
	}

	public static void IsPrime(int number) {
		int count=0;
		
		if(number<2) {
			System.out.println(number+ " Is not a Prime Number..");
			System.exit(0);
		}else{
			for(int i=1; i<=number; i++) {
				if(number %i==0) {
					count+=1;
				}
			}
			if(count>2) {
				System.out.println(number+ " Is a Prime Number");
			}else {
				System.out.println(number + " Is not a Pime Number..");
			}
		}
	}
}
