package Adavance_5_Patters;

import java.util.*;

public class Hollow_Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number n:");
  int n = sc.nextInt();
  
  // upper half
  for(int i=1; i<=n; i++) {
	  
	  
	  //first half stars -->
	  for(int j=1; j<=i; j++) {
		if(j ==1 || j == i) {
			System.out.print("*");
		}  else {
			System.out.print(" ");
		}
		 }
	  
	  // spaces.
	  for(int j=1; j<=2*(n-i); j++) {
		  System.out.print(" ");
	  }
	  
	  
	//second half stars -->
	  for(int j=1; j<=i; j++) {
		if(j ==1 || j == i) {
			System.out.print("*");
		}  else {
			System.out.print(" ");
		}
		 }
	  System.out.println(" ");
  }
	
  
  // lower half
  for(int i=n; i>0; i--) {
	  
	  
	  //first half stars -->
	  for(int j=1; j<=i; j++) {
		if(j ==1 || j == i) {
			System.out.print("*");
		}  else {
			System.out.print(" ");
		}
		 }
	  
	  // spaces.
	  for(int j=1; j<=2*(n-i); j++) {
		  System.out.print(" ");
	  }
	  
	  
	//second half stars -->
	  for(int j=1; j<=i; j++) {
		if(j ==1 || j == i) {
			System.out.print("*");
		}  else {
			System.out.print(" ");
		}
		 }
	  System.out.println(" ");
  }
		
	}

}
