package prepinsta;

import java.util.Scanner;

class FabonacciSeries_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=scn.nextInt();
		
		int a=0, b=1;
		
		System.out.print(a+ " , "+ b+ " , ");
		
		int nextValue;
		
		for(int i=2; i<num; i++) {
			nextValue=a+b;
			a=b;
			b=nextValue;
			System.out.print(nextValue+ " , ");
		}
		System.out.println();
		scn.close();

	}

}
