package Functions;

import java.util.*;

public class Addition {
	public static int calculateadd(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number a:");
  int a = sc.nextInt();
  System.out.println("Enter number b:");
  int b = sc.nextInt();
  
  System.out.println("The addition of given two numbers is: " + calculateadd(a,b) );
  
	}

}
