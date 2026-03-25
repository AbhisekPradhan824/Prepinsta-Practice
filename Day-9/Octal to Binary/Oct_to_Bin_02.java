package prepinsta;

import java.util.Scanner;

public class Oct_to_Bin_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Octal Code:");
		int octal = scn.nextInt();
		String binary="";
		int temp=octal;
		
		while(temp!=0) {
			int rem=temp%10;
			binary= getBinary(rem)+binary;
			temp/=10;
		}
		
		System.out.println("Binary Code of the code:"+ binary);
		scn.close();
		
		
	}
	
		static String getBinary(int num) {
		    // We force every octal digit to represent exactly 3 binary bits
		    String res = "";
		    for (int i = 0; i < 3; i++) {
		        res = (num % 2) + res;
		        num /= 2;
		    }
		    return res;
		}

}
