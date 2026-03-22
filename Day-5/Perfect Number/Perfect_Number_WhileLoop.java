package prepinsta;

import java.util.Scanner;

public class Perfect_Number_WhileLoop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int number = scn.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<number) {
			if(number%i==0) {
				sum+=i;
			}
			i++;
		}
		
		if(sum==number) {
			System.out.println("The Number "+ number + " is a Strong Number..");
		}else {
			System.out.println("The Number "+ number + " is not a Strong Number..");
		}
		
		scn.close();

	}

}
