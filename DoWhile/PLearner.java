package DoWhile;

import java.util.*;

public class PLearner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the starting number n:");
	int n = sc.nextInt();
	
	 System.out.println("Enter the ending number m:");
	 int m = sc.nextInt();
	 
	 int sum = m - n;
	 
	 System.out.println("Your " + sum + " times statement.");
	 
	 do {
		 System.out.println("The International Learner.");
		 n++;
	 }while(n<m);
		
		
	}

}
