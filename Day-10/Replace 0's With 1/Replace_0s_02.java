package prepinsta;

import java.util.Scanner;

public class Replace_0s_02 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		 System.out.print("Enter the Number: ");
		 int num = scn.nextInt();
		 
		 String str =Integer.toString(num);
		 String str1="";
		 for(int i=0; i<str.length(); i++) {
			 if(str.charAt(i) =='0') {
				 str1+='1';
			 }else {
				 str1+=str.charAt(i);
			 }
		 }
		 
		 System.out.println("The new Number is: "+ str1);
		 scn.close();
	}
}
