package prepinsta;

import java.util.Scanner;

public class Bin_to_Oct_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Binary Code: ");
		int bin = scn.nextInt();
		int[] oct =new int[20];
		int i=0;
		
		while(bin!=0) {
			int dec=0;
			for(int j =0; j<=2; j++) {
				if (bin == 0) break;
				int temp = bin%10;
				dec+=temp*(Math.pow(2, j));
				bin/=10;
			}
			oct[i++]=dec;
		}
		System.out.println("Ocatal Value: ");
		for(int j=i-1; j>=0; j--) {
			System.out.print(oct[j]);
		}
		scn.close();
	}

}
