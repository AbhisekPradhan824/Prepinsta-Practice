package prepinsta;

import java.util.Scanner;

public class Bin_to_Oct_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int binary = scn.nextInt();
		scn.close();
		int decimal = getDecimal(binary);
		printOct(decimal);
		
	}
	static int getDecimal(int bin){
		int power =0;
		int decimal=0;
		while(bin!=0) {
			int temp = bin%10;
			decimal+=temp*(Math.pow(2, power));
			power++;
			bin/=10;
		}
		return decimal;
	}
	static void printOct(int dec) {
		int[] oct =new int[20];
		int i=0;
		while(dec!=0){
			int temp = dec%8;
			oct[i++]=temp;
			dec/=8;
		}
		System.out.println("Octal Code: ");
		{
			for(int j=i-1; j>=0; j--) {
				System.out.print(oct[j]+ " ");
			}
		}
	}

}
