package IfElse;

import java.util.*;

public class Gfwali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("How much money do you have? Later I will explain you what sholud you do?");
  int a = sc.nextInt();
  
  if(a > 5000) {
	  System.out.println("You should go with Vidhi.");
  }else if (a > 2000) {
	  System.out.println("You should go with Riya.");
  }else {
	  System.out.println("You should go with Your frainds");
  }
  
  
  
	}

}
