package Exersice_1;

import java.util.*;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the Number:");
  int n = sc.nextInt();
  int m = 0;
  
  //loop for sum --->
  for(int i=1; i<=n; i=i+2) {
	  m = m +i;
  }
	System.out.println("Your sum: " + m);	
		
	}

}
