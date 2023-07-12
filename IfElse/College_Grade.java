package IfElse;

import java.util.*;

public class College_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the percentile you obtain: ");
  double pr = sc.nextDouble();
  
  // we must pass a condition in if not a variable.
  
  if(pr>95) {
	  System.out.println("You will probabaly get AA grade. ");
  }else {
	  System.out.println("You will probabaly get below AA grade.");
  }
  
		
		
	}

}
