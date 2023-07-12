package Functions;

import java.util.*;

public class PName {
	public static void printMyName(String name) {
		System.out.println("Your name is " + name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your name:");
  String n = sc.nextLine();
  
  printMyName(n);
		  
		
	}

}
