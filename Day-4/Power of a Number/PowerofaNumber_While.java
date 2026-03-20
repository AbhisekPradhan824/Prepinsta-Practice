package prepinsta;

import java.util.Scanner;

public class PowerofaNumber_While {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Base: ");
		int base=scn.nextInt();
		
		System.out.println("Enter the Power: ");
		int power=scn.nextInt();
		
		int res=1;
		int tempPower=power;
		
		while(tempPower!=0) {
			res*=base;
			tempPower--;
		}
		
		System.out.println(power+" Power of a Number "+ base+ " is "+res );
		scn.close();

	}

}
