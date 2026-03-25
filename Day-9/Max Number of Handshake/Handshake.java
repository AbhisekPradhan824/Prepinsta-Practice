package prepinsta;

import java.util.Scanner;

public class Handshake {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter total Number of people: ");
		int n = scn.nextInt();
		
		int possibleHandshake= (int) n*(n-1)/2;
		System.out.println(" For "+ n + " number of people there will be "+ possibleHandshake + " ways to handshake");
		scn.close();
	}

}
