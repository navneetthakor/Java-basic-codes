package SwitchCase;

import java.util.*;

public class Butten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
				System.out.println("Enter the value of butten:");
		int a = sc.nextInt();
		switch(a) {
		
		case 1:
			System.out.println("You are Brillient.");
			break;
		case 2:
			System.out.println("You are Excellent.");
			break;
		case 3:
			System.out.println("You are Good.");
			break;
		case 4:
			System.out.println("You are Nice.");
			break;
		default:
			System.out.println("You are Unique.");
			break;
		}

	}

}
