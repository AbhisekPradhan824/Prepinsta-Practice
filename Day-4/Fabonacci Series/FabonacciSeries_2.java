package prepinsta;

import java.util.Scanner;

public class FabonacciSeries_2 {
	static int a=0, b=1, nextTerm;

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scn.nextInt();
		
		System.out.print(a+ " , "+ b+" , ");
		Fab(num-2);

	}
	
	static int Fab(int num) {
		if(num>0) {
			nextTerm=a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm+" , ");
			Fab(num-1);
		}
		return 0;
	}

}
