package UserInput;

import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a;");
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      System.out.println("Enter the value of b");
      int b = sc.nextInt();
    		  
    		int  sum = a+b;
      
    		  System.out.println("The addition of the two number a and b  is = " + sum);
	}

}
