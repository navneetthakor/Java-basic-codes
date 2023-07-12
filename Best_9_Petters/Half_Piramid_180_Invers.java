package Best_9_Petters;

import java.util.*;

public class Half_Piramid_180_Invers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter the number of rows:");
  int n = sc.nextInt();
  
  for(int i=1; i<=n; i++) {
	  // first inner loop --> for space.
	  for(int j=1; j<=n-i; j++) {
		  System.out.print(" ");
	  }
	  
	  // second inner loop --> for print the star.
	  for(int j=1; j<=i; j++) {
		  System.out.print("*");
	  }
	  System.out.println(" ");
  }
		
		
	}

}
