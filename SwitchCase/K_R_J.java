package SwitchCase;

import java.applet.*;
import java.util.Scanner;

public class K_R_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number:");
  int n = sc.nextInt();
  
  switch(n) {
  case 1:
	  System.out.println("Kartavya.");
	  break;
	  
  case 2:
	  System.out.println("Ronak");
	  break;
	  
  case 3:
	  System.out.println("Jay Kalbi.");
	  break;
	  
  default:
	  System.out.println("Navneetkumar.");
	  break;
  }
		
		
	}

}
