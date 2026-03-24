package prepinsta;

import java.util.Scanner;

public class DectoBin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the decimal value: ");
		int dec = scn.nextInt();
		
		int tempdec=dec;
		int[] bin = new int[20];
		int i=0;
		
		while(tempdec>0) {
			int rem = tempdec%2;
			bin[i++] = rem;
			tempdec/=2;
		}
		
		for(int j=bin.length-1; j>=0; j--) {
			System.out.print(bin[j]+" ");
		}
		scn.close();

	}

}
