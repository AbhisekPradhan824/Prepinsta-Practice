package prepinsta;

import java.util.Scanner;

public class DectoHex_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Value: ");
		int decimal= scn.nextInt();
		
		decToHex(decimal);
		scn.close();

	}
	static void decToHex(int dec) {
		char[] hex = new char[100];
		int i=0;
		while(dec!=0) {
			int temp= dec%16;
			if(temp<10) {
				char code = (char)(temp+48);
				hex[i++]=code;
			}else {
				char code = (char)(temp+56);
				hex[i++]=code;
			}
			dec/=16;
		}
		System.out.println("Hexadecimal Value: ");
		for(int j=i-1; j>=0; j--) {
			System.out.print(hex[j]+" ");
		}
	}

}
