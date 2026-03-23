package prepinsta;

import java.util.Scanner;

public class HCF_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enrter First Number");
		int n1=scn.nextInt();
		
		System.out.println("Enter Second Number");
		int n2=scn.nextInt();
		
		int hcf=getHCF(n1, n2);
		
		System.out.println("HCF : "+ hcf);
		scn.close();

	}
	static int getHCF(int n1, int n2) {
		return n2==0 ? n1: getHCF(n2, n1%n2);
	}

}
