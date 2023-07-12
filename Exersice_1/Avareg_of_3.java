package Exersice_1;

import java.util.*;

public class Avareg_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter your first number:");
  int a = sc.nextInt();
  System.out.println("Enter your second number:");
  int b = sc.nextInt();
  System.out.println("Enter your third number:");
  int c = sc.nextInt();
  
  int avareg = (a+b+c)/3;
  
  System.out.println("The avareg of your given number is: " + avareg);
  
  
	}

}
