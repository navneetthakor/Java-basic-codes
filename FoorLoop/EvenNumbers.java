package FoorLoop;

import java.util.*;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number n:");
  int n = sc.nextInt();
  
  System.out.println("Your all dezire even number till " + n + ".");
  
  for(int i=2; i<=n; i= i+2) {
	  System.out.println(i);
  }
  
		
		
	}

}
