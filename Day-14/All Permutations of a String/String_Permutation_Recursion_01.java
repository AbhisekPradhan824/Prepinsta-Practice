package prepinsta;

import java.util.Scanner;

public class String_Permutation_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = scn.nextLine();
		scn.close();
		
		printPermutate(str, "");
		
	}
	static void printPermutate(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String newStr = str.substring(0, i)+ str.substring(i+1);
			printPermutate(newStr, ans+ch);
		}
	}
}
