package Exersice_1;

import java.util.*;

public class GreterFrom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter your first number: ");
  int a = sc.nextInt();
  System.out.println("Enter your second number: ");
  int b = sc.nextInt();
  
  // if statement --->
  if(a<b) {
	  System.out.println("The greater number from given two is: " + b);
  }else {
	  System.out.println("The greater number from given two is: " + a);
  }
  
  
	}

}
