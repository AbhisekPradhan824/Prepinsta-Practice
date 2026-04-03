package prepinsta;

import java.util.Scanner;

public class Smallest_Element_in_Array_01 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i] =scn.nextInt();
			System.out.println();
		}
		
		int min =findMin(arr, size);
		
		System.out.println("Minimum is: "+ min);
		scn.close();
	}
	
	static int findMin(int[] arr, int n) {
		if(n==1) {
			return arr[0];
		}
		
		return Math.min(arr[n-1], findMin(arr, (n-1)));
	}
}
