package prepinsta;

import java.util.Scanner;

public class Area_Circle_1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the radius of the Circle");
		double radius= scn.nextDouble();
		
		double area = Math.round(Math.PI * radius * radius * 100.0) / 100.0;
		
		System.out.println("Area of the circle having radius "+ radius +  " is "+ area);
		scn.close();
	}
}
