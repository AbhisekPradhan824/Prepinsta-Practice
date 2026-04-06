package prepinsta;

import java.util.Scanner;

public class String_Length_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine();
		
		int length = getLength(str);
		System.out.println("Length is : "+ length);
		scn.close();
	}
	static int getLength(String str) {
		if (str=="") {
			return 0;
		}
		return 1+ getLength(str.substring(1));
	}
}
