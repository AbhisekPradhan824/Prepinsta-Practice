package prepinsta;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the X Co-ordinate Value: ");
		double x=scn.nextDouble();
		
		System.out.println("Enter the Y Co-ordinate Value: ");
		double y= scn.nextDouble();
		
		if(x==0 && y==0) {
			System.out.println("The Co-ordinate is at the Origin");
		}
		if(x>0 && y>0) {
			System.out.println("The Co-ordinate is at 1st Quadrant");
		}else if(x<0 && y>0) {
			System.out.println("The Co-ordinate is at 2nd Quadrant");
		}else if(x<0 && y<0) {
			System.out.println("The Co-ordinate is at 3rd Quadrant");
		}else if(x>0 && y<0){
			System.out.println("The Co-ordinate is at 4th Quadrant");
		}else if(x!=0 && y==0){
			System.out.println("The Co-ordinate is at X-axis");
		}else if(x==0 && y!=0){
			System.out.println("The Co-ordinate is at Y-axis");
		}
		
		scn.close();
	}
}
