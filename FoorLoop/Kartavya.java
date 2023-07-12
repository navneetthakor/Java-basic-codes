package FoorLoop;

import java.applet.*;
import java.util.Scanner;

public class Kartavya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the number of row:");
  int n = sc.nextInt();
  System.out.println("Enter the number of coloun:");
  int m = sc.nextInt();
  
  
  for(int i=1; i<=n; i++) {
	  for(int j=1; j<=m; j++) {
		  System.out.print("Kartavya  ");
	  }
	  System.out.println(" ");
  }
  
  
	}

}
