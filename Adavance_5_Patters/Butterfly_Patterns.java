package Adavance_5_Patters;


import java.util.*;

public class Butterfly_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of row:");
   int n = sc.nextInt();
   
   //First outer for loop -->
   for(int i=1; i<=n; i++) {
	   // First star inner for loop -->
	   for(int j=1; j<=i; j++) {
		   System.out.print("*");
	   }
	   //space inner loop -->
	   for(int j=1; j<=2*(n-i); j++) {
		   System.out.print(" ");
	   }
	   //second star inner loop -->
	   for(int j=1; j<=i; j++) {
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   // second outer loop -->
   for(int i=n; i>0; i--) {
	   //First inner loop -->
	   for(int j=1; j<=i;j++) {
		   System.out.print("*");
	   }
	   // inner loop for space -->
	   for(int j=1;j<=2*(n-i); j++) {
		  System.out.print(" "); 
	   }
	   // second inner loop for print the stars -->
	   for(int j=1; j<=i;j++) {
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   
		
		
	}

}
