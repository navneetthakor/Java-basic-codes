package Functions;

import java.util.*;

public class Factorial {
	public static int calFactorial(int n) {
		if(n<0) {
			System.out.println("Invelid Number");
			return 0;
		}
		
		//loop
		int facto = 1;
		for(int i=n; i>=1; i--) {
			facto = facto*i;
		}
		
		
		return facto ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int n = sc.nextInt();
  
  int facto = calFactorial(n);
  
  System.out.println("your ans: " + facto);
		
		
	}

}
