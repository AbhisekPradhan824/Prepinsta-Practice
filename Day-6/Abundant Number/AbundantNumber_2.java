package prepinsta;

import java.util.Scanner;

public class AbundantNumber_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				if(i==1) {
					sum+=1;
				}else if(i==num/i) {
					sum+=num/i;
				}else {
					sum+=i+num/i;
				}
			}
		}
		if(sum>num) {
			System.out.println("Yes ! The Number "+ num + " is an Abundant Number..");
		}else {
			System.out.println("No ! The Number "+ num + " is not an Abundant Number..");
		}
		scn.close();
	}

}
