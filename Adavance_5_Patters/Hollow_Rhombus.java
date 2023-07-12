package Adavance_5_Patters;

import java.util.*;

public class Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows:");
  int n = sc.nextInt();
  
  //outer loop -->
  for(int i=1; i<=n; i++) {
	  
	  
	  //spaces -->
	  for(int j=1; j<=(n-i); j++) {
		System.out.print(" ");  
	  }
	  
	  //stars -->
	  for(int j=1; j<=n; j++) {
		  if(j==1 || j == n) {
			System.out.print("*");  
		  }else {
			  System.out.print(" ");
		  }
	  }
	  System.out.println(" ");
  }
		
		
	}

}
