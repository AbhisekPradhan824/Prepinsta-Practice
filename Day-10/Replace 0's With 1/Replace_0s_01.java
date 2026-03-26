package prepinsta;

import java.util.Scanner;

public class Replace_0s_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num =scn.nextInt();
		
		String tempnum = Integer.toString(num);
		num = Integer.parseInt(tempnum.replace('0', '1'));
		
		System.out.println(num);
		scn.close();
		
	}
}
