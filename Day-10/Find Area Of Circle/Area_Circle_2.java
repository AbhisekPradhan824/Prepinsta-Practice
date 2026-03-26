package prepinsta;

import java.util.Scanner;

public class Area_Circle_2 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the Diameter of the Circle");
		double d= scn.nextDouble();
		
		double area = Math.PI * d * d/4 ;
		
		double area1 = Math.round(area*100.0)/100.0;
		
		System.out.println("Area of the circle having diameter "+ d +  " is "+ area1);
		scn.close();
	}
}
