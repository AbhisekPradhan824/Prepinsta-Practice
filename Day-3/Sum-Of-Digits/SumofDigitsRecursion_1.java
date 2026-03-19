package prepinsta;

import java.util.Scanner;

public class SumofDigitsRecursion_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scn.nextInt();
		
		int sum=getSum(num,0);
		
		System.out.println("Sum of Digits of the Number "+ num+ " is "+ sum);
		scn.close();

	}
	static int getSum(int num, int sum) {
		if(num==0) {
			return sum;
		}else {
			int digit = num%10;
			sum+=digit;
			return getSum(num/10, sum);
		}
	}

}
