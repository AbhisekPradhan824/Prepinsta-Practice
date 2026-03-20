package prepinsta;

import java.util.Scanner;

public class ArmstrongnumbersinRange_Recursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Lower Value:");
		int low=scn.nextInt();
		
		System.out.println("Enter Higher Value: ");
		int high= scn.nextInt();
		
		int size=0;
		
		for(int i =low; i<=high; i++) {
			size=getSize(i);
			if(getArmstrong(i, size)==i) {
				System.out.print(i+ "\t");
			}
		}
		System.out.println();
		scn.close();

	}
	

//Method for get the size(number of digits) of the number...
	static int getSize(int num) {
		int size=0;
		
		while(num!=0) {
			size++;
			num/=10;
		}
		return size;
	}
	

//Method for calculating sum of length power of each digit of the number like (123 => 1^3 + 2^3 + 3^3 )... 
	static int getArmstrong(int num, int size) {
		if(num==0) {
			return 0;
		}
		
			return (int)Math.pow(num%10, size) + getArmstrong(num/10, size);
		
	}

}
