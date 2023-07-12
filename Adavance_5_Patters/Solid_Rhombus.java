package Adavance_5_Patters;

import java.util.*;

public class Solid_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number n:");
   int n = sc.nextInt();
   
   // outer for loop -->
   for(int i=1; i<=n; i++) {
	   
	   // inner for loop for spaces -->
	   for(int j=1; j<=(n-i);j++) {
		   System.out.print(" ");
	   }
	   
	   // inner loop for stars
	   for(int j=1; j<=n; j++) {
		   System.out.print("*");
	   }
	   
	   System.out.println(" ");
   }
		
		
		
	}

}
