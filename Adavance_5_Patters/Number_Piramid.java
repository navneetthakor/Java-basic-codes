package Adavance_5_Patters;

import java.util.*;

public class Number_Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number of rows:");
   int n = sc.nextInt();
   
   //outer loop -->
   for(int i=1; i<=n; i++) {
	   //loop for spaces -->
	   for(int j=1; j<=(n-i); j++) {
		   System.out.print(" ");
	   }
	   
	   //loop for print number -->
	   for(int j=1; j<=i; j++) {
		   System.out.print(i + " ");
	   }
	   System.out.println(" ");
   }
		
		
	}

}
