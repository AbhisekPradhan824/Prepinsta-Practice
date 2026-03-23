package prepinsta;

import java.util.Scanner;

public class HCF_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enrter First Number");
		int n1=scn.nextInt();
		
		System.out.println("Enter Second Number");
		int n2=scn.nextInt();
		
		while(n1!=n2) {
			if(n1>n2) {
				n1-=n2;
			}else {
				n2-=n1;
			}
		}
		
		System.out.println("HCF: "+ n1);
		scn.close();

	}

}
