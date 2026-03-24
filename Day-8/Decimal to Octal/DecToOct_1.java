package prepinsta;

import java.util.Scanner;

public class DecToOct_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the decimal value");
		int decimal =  scn.nextInt();
		
		int[] octal = new int[20];
		int i=0;
		
		while(decimal!=0) {
			int temp = decimal%8;
			octal[i++] = temp;
			decimal/=8;
		}
		
		System.out.println("Octal Value");
		for(int j = i-1; j>=0; j--)
		{
			System.out.print(octal[j]+" ");
		}
		scn.close();

	}

}
