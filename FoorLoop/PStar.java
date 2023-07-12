package FoorLoop;

import java.util.*;

public class PStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter , how many stars do you want to print.");
    int n = sc.nextInt();
    
    System.out.println("Your "+ n + " stars are following.");
    for(int i = 0; i < n; i++) {
      System.out.print("*" + " ");	
    }
		
		
		
	}

}
