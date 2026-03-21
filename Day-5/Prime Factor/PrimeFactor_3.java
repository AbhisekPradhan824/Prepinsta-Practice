package prepinsta;

import java.util.Scanner;

public class PrimeFactor_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number=scn.nextInt();
		
		getPrimeFactor(number);
		
		scn.close();
		

	}
	static void getPrimeFactor(int num) {
		while(num%2==0) {
			System.out.print(2+" ");
			num/=2;
		}
		for (int i =3; i<=Math.sqrt(num); i++) {
			while(num%i==0) {
				System.out.print(i+" ");
				num/=i;
			}
		}
		if(num>2) {
			System.out.print(num);
		}
	}

}
