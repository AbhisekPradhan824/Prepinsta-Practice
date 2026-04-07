package prepinsta;

import java.util.Scanner;

public class FnthTerm_Recursion_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the term: ");
		int num =scn.nextInt();
		int term = term(1, 1, num);
		System.out.println(term);
		scn.close();
	}
	static int term(int calculated, int current, int N) {
		int i, cur = 1;
		
		
		if(current == N+1) {
			return 0;
		}
		
		for(i=calculated; i<calculated+current; i++) {
			cur*=i;
		}
		return cur + term(i, current+1, N );
	}
}
