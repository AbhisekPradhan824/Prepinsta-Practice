package prepinsta;

import java.util.HashMap;
import java.util.Scanner;

public class Oct_to_Bin_03 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		HashMap<Integer, String> b=new HashMap<Integer, String>();
		b.put(0, "000");
		b.put(1, "001");
		b.put(2, "010");
		b.put(3, "011");
		b.put(4, "100");
		b.put(5, "101");
		b.put(6, "110");
		b.put(7, "111");
		
		System.out.println("Enter the Octal Code");
		long octal=scn.nextLong();
		String res="";
		
		long n=octal;
		
		while(n!=0) {
			int temp =(int) n%10;
			if(n!=0) {
				res=b.get(temp)+res;
			}
			n/=10;
		}
		
		System.out.println("The Decimal value: "+ res);
		scn.close();
		
	}

}
