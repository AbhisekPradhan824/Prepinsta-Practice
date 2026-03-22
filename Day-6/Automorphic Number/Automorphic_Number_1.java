package prepinsta;

import java.util.Scanner;

public class Automorphic_Number_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scn.nextInt();
		
		int sq=(int)Math.pow(num, 2);
		
		int rem=sq%10;
		
		if(num==rem) {
			System.out.println("AutoMorphic Number");
		}else {
			System.out.println("Non Automorphic Number");
		}
		
		scn.close();

	}

}
