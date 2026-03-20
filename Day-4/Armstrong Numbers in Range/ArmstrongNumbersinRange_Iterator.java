package prepinsta;

import java.util.Scanner;

public class ArmstrongNumbersinRange_Iterator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Initial Value:");
		int lower=scn.nextInt();
		
		System.out.println("Enter Final Value: ");
		int upper=scn.nextInt();
		
		int size=0;
		
		for(int i=lower; i<=upper; i++) {
			size=getSize(i);
			if(armstrong(i, size)) {
				System.out.print(i+ "\t");
			}
			
		}
		System.out.println();
		scn.close();

	}
	
	
	static int getSize(int n) {
		int size=0;
		
		while(n!=0) {
			size++;
			n/=10;
		}
		return size;
	}
	
	
	static boolean armstrong(int num, int size) {
		
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			sum+=Math.pow(temp%10, size);
			temp/=10;
		}
		return sum==num;
	}

}
