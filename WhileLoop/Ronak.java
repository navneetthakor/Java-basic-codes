package WhileLoop;

import java.applet.*;
import java.util.Scanner;

public class Ronak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the starting number:");
  int i = sc.nextInt();
  
  System.out.println("Enter the ending number:");
  int n = sc.nextInt();
  
  
  // using while loop
  
  while(i <= n){
	  System.out.print(i + "  ");
	  i++;
  }
		
		
	}

}
