package Adavance_5_Patters;

import java.util.*;

public class Diamond_Patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the number n:");
  int n = sc.nextInt();
  
  //uper side outer loop -->
  for(int i=1; i<=n; i++) {
	  
	  //loop for spaces -->
	  for(int j=1; j<=(n-i); j++) {
		  System.out.print(" ");
	  }
	  
	  //loop for first right half -->
	  for(int j=1; j<=i; j++) {
		  System.out.print("*");
	  }  
	 // loop for first left half -->
	  for(int j=2; j<=i; j++) {
		  System.out.print("*");
	  }
	  System.out.println(" ");
	  
  }
  
  // lower side outer loop -->
  
 for(int i=n; i>0; i--) {
	  
	  //loop for spaces -->
	  for(int j=1; j<=(n-i); j++) {
		  System.out.print(" ");
	  }
	  
	  //loop for first right half -->
	  for(int j=1; j<=i; j++) {
		  System.out.print("*");
	  }  
	 // loop for first left half -->
	  for(int j=2; j<=i; j++) {
		  System.out.print("*");
	  }
	  System.out.println(" ");
	  
  }
		
		
	}

}
