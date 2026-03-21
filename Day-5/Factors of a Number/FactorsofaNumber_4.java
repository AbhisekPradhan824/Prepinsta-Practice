package prepinsta;

import java.util.Scanner;

public class FactorsofaNumber_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num= scn.nextInt();
		
		for(int i=num; i<= Math.abs(num); ++i) {
			if(i==0) {
				continue;
			}else {
				if(num%i==0) {
					System.out.print(i+ " , ");
				}
			}
		}
		System.out.println();
		scn.close();

	}

}
