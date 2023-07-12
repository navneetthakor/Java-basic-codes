package Best_9_Petters;

import java.util.*;

public class RectengleFame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the row:");
    int m = sc.nextInt();
    System.out.println("Enter the number of colon:");
    int n = sc.nextInt();
    
    for(int i = 1; i<=m; i++) {
    	for(int j = 1; j<=n; j++) {
    		if(i == 1 || i == m || j == 1 || j == n) {
    			
    			System.out.print("*");
    		}else {
    			System.out.print(" ");
    		}
    	}
    	System.out.println();
    }
		
		
		
		
	}

}
