package prepinsta;

import java.util.Scanner;

public class Automorphic_Number_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scn.nextInt();
		
		int sq=(int)Math.pow(num, 2);
		
		
		int tempnum=num;
		int revnum=0;
		
		int resq=0;
		
		while(tempnum!=0) {
			revnum=revnum*10 + tempnum%10;
			resq=resq*10+ sq%10;
			tempnum/=10;
			sq/=10;
		}
		
		if(revnum==resq) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		scn.close();

	}

}
