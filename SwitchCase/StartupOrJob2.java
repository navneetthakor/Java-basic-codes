package SwitchCase;

import java.util.*;

public class StartupOrJob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter what you want:");
  System.out.println("1.Startup");
  System.out.println("2.Job");
  int n = sc.nextInt();
  
  switch(n) {
  case 1:
	  System.out.println("You should read for taking risk.");
	  break;
	  
  case 2:
	  System.out.println("You should work hard on your resume and you also achive for certificates.");
	  break;
	  
   default:
	  System.out.println("You entered someting wrong.");
	  break;
  }
		
		
	}

}
