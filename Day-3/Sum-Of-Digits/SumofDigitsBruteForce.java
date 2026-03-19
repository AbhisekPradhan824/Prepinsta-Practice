package prepinsta;

import java.util.Scanner;

public class SumofDigitsBruteForce {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scn.nextInt();
		
		int newnum=num;
		
		int sum=0;
		while(newnum!=0) {
			sum+=newnum%10;
			newnum=newnum/10;
		}
		
		System.out.println("Sum of Digits of the Number "+ num+ " is "+ sum);
		scn.close();

	}

}
