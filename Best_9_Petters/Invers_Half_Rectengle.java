package Best_9_Petters;

import java.util.*;

public class Invers_Half_Rectengle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of row:");
  int n = sc.nextInt();
  
  for(int i=n; i>0; i--) {
	  for(int j=1; j<=i; j++) {
		 System.out.print("*");
	  }
	  System.out.println(" ");
  }
		
		
	}

}
