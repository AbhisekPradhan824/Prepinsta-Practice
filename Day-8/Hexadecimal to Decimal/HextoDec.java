package prepinsta;

import java.util.Scanner;

public class HextoDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Hex Code");
		String hex = scn.nextLine();
		int dec=getDec(hex);
		
		System.out.println("Decimal value of "+ hex + " is " + dec);
		scn.close();

	}
	static int getDec(String hex) {
		String digits= "0123456789ABCDEF";
		hex=hex.toUpperCase();
		int val =0;
		
		for(int i=0; i<hex.length(); i++ ) {
			char c=hex.charAt(i);
			int d = digits.indexOf(c);
			val+=d*Math.pow(16, i);
		}
		return val;
		
		
	}

}
