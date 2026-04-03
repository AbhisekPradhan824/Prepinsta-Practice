package prepinsta;

import java.util.Scanner;

public class Largest_Element_Array_01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter "+i+" th Element of the array: ");
			arr[i] = scn.nextInt();
		}
		
		int max = findMax(arr);
		System.out.print("[ ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("]");
		
		System.out.println("Larget element is : "+ max);
		scn.close();
		
		
	}
	static int findMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
