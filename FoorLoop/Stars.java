package FoorLoop;

import java.util.*;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of row:");
      int m = sc.nextInt();
      
      System.out.println("Enter the number of colun:");
      int n = sc.nextInt();
      
      for(int i = 1; i<=m; i++) {
    	  for(int j = 1; j<=n; j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
		
		
		
	}

}
