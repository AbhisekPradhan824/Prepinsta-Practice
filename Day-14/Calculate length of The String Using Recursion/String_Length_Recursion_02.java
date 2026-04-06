package prepinsta;

import java.util.Scanner;

public class String_Length_Recursion_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = scn.nextLine();
		
		int length = getLength(str);
		System.out.println("Length is : "+ length);
		scn.close();
		
	}
	static int getLength(String str) {
		int length =0;
		char[] strArr= str.toCharArray();
		
		for(char ch: strArr) {
			length++;
		}
		return length;
	}
}
