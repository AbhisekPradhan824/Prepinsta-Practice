package prepinsta;

import java.util.Scanner;

public class AbundantNumber_1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scn.nextInt();
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		
		if(sum>num) {
			System.out.println("Yes! The number "+ num + " is an Abundant Number.");
		}else {
			System.out.println("Yes! The number "+ num + " is not an Abundant Number.");
		}
		scn.close();
	}

}
