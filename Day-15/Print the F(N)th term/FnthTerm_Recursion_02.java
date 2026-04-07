package prepinsta;

import java.util.Scanner;

public class FnthTerm_Recursion_02
{
  public static void main (String args[])
  {
	  Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the term: ");
		int num =scn.nextInt();
		int term = term(1, 1, num);
		System.out.println(term);
		scn.close();
  }
//Function to calculate N-th term
  static int term (int calculated, int current, int N)
  {
    int i, result = 0;
    while (current != N + 1)
      {
    int cur = 1;
    // product of terms till current
    for (i = calculated; i < calculated + current; i++)
      cur *= i;
    calculated = i;
    result += cur;
    current++;
      }
    return result;
  }
}

