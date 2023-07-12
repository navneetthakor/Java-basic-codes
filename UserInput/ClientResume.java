package UserInput;

import java.util.*;

public class ClientResume{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter your name:");
  String clientName = sc.next();
  
  System.out.println("How much you studied(in word):");
  String califi = sc.next();
  
  System.out.println("                          ..." + "My Resume" + ".....             ");
  System.out.println("My name is " + clientName +". I am very well calified for this position. My calification is " + califi+".");
  
  
		
		
	}

}
