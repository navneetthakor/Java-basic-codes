package FoorLoop;

import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int n = sc.nextInt();
  int a;
  
  System.out.println("Your table of number " + n +" is following.");
  for(int i = 1; i<11; i++) {
	  a = n*i;
	  System.out.println(a);
	  
  }
	  
  
  
  
	}

}
