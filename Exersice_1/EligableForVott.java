package Exersice_1;

import java.util.*;

public class EligableForVott {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your age:");
  int age = sc.nextInt();
  
  // if statement --->
  
  if(age<18) {
	  System.out.println("You are not eligable for vott.");
  }else {
	  System.out.println("You are eligable for vott.");
  }
		
		
	}

}
