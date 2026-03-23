package prepinsta;

import java.util.Scanner;

public class HCF_5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enrter First Number");
		int n1=scn.nextInt();
		int num1= n1>0 ? n1: -n1;
		
		System.out.println("Enter Second Number");
		int n2=scn.nextInt();
		int num2= n2>0 ? n2: -n2;
		
		int hcf=getHCF(num1, num2);
		
		System.out.println("HCF : "+ hcf);
		scn.close();

	}
	static int getHCF(int n1, int n2) {
		return n2==0 ? n1: getHCF(n2, n1%n2);
	}

}
