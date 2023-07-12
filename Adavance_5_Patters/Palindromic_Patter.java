package Adavance_5_Patters;

import java.util.*;

public class Palindromic_Patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number n:");
   int n = sc.nextInt();
   
   System.out.println(" Your Palindromic Patter:");
   // outer loop -->
   for(int i=1; i<=n; i++) {
	   //loop for spaces -->
	   for(int j=1; j<=(n-i); j++) {
		   System.out.print(" ");
	   }
	   
	   //loop first half -->
	   for(int j=i; j>0; j--) {
		   System.out.print(j);
	   }
	   
	   //loop for second half -->
	   for(int j=2; j<=i; j++) {
		   System.out.print(j);
	   }
	   System.out.println("");
   }
		
		
	}

}
