package FoorLoop;

import java.util.*;

public class Never_Give_Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter how many time you wants to print the statement.");
  int n = sc.nextInt();
  
  //inroducing for loop.
  System.out.println("Your statement for " + n +" times. ");
  for(int i=0; i<n; i++) {
	  System.out.println("NEVER GIVE UP.");
  }
		
	}

}
