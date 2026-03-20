package prepinsta;

import java.util.Scanner;

public class ArmStrongNumber_0 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n=scn.nextInt();
		
		int l=Integer.toString(n).length();
		
		int sum=0;
		int num=n;
		
		while(num!=0) {
			sum+=Math.pow(num%10, l);
			num/=10;
		}
		
		if(sum==n) {
			System.out.println(" The Number "+ n+ " is an Armstrong Number");
		}else {
			System.out.println(" The Number "+ n+ " is not an Armstrong Number");
		}
		scn.close();

	}

}
