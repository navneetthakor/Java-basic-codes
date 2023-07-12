package SwitchCase;

import java.util.*;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Give commond according your need, \n "
				+ "- 1. Addition\n"
				+ "- 2. minues\n"
				+ "- 3. multiplication\n"
				+ "- 4. dividetion\n");
		int commond = sc.nextInt();
		
		int sum = a + b;
		int min = a - b;
		int mul = a*b;
		double div = a/b;
		
		switch(commond) {
		case 1:
			System.out.println("The addition of given two number is " + sum);
			break;
		case 2:
			System.out.println("The minues of given two number is " + min);
			break;
		case 3:
			System.out.println("The multiplication of given two number is " + mul);
			break;
		case 4:
			System.out.println("The dividetion of given two number is " + div);
			break;
			
			
			
			
		}
		

	}

}
