package Best_9_Petters;

import java.util.*;

public class Floids_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of row:");
  int n = sc.nextInt();
  System.out.println("From which number you want to print:");
  int num = sc.nextInt();
  
  // outer for loop -->
  for(int i =1; i<=n; i++) {
	  //inner for loop -->
	  for(int j=1; j<=i; j++) {
		  System.out.print(num + " ");
		  num++;
	  }
	  System.out.println(" ");
  }
		
		
	}

}
