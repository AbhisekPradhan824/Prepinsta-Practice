package prepinsta;

import java.util.Scanner;

public class SumofDigitsRecursion_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scn.nextInt();
		
		int sum=getSum(num);
		
		System.out.println("Sum of Digits of the Number "+ num+ " is "+ sum);
		scn.close();

	}
	static int getSum(int num) {
		if(num==0) {
			return num;
		}else {
			int digit = num%10;
			return digit+getSum(num/10);
		}
	}

}
