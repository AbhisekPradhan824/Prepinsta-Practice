package prepinsta;

import java.util.Scanner;

public class Smallest_Element_in_Array_02 {
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
		
		int min =arr[0];
		
		for(int i=1; i<size; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("Minimum is: "+ min);
		scn.close();
	}
}
