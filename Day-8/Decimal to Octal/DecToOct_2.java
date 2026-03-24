package prepinsta;

import java.util.Scanner;

public class DecToOct_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the decimal value");
		int decimal =  scn.nextInt();
		
		int octalNum=0;
		int countVal=1;
		
		while(decimal!=0) {
			int temp = decimal%8;
			octalNum+=temp*countVal;
			countVal*=10;
			decimal/=8;
		}
		
		System.out.println("Octal Value: "+octalNum);
		scn.close();

	}
}
