package prepinsta;

import java.util.Scanner;

public class FactorsofaNumber_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n=scn.nextInt();
		System.out.print(1+ " , ");
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.print( i+" , ");
			}
		}
		System.out.println();
		scn.close();

	}

}
