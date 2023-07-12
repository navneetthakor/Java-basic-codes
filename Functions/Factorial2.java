package Functions;

import java.util.*;

public class Factorial2{
	public static void calFactorial(int n) {
		if(n<0) {
			System.out.println("Invelid Number");
			return;
		}
		
		//loop
		int facto = 1;
		for(int i=n; i>=1; i--) {
			facto = facto*i;
		}
		System.out.println(facto);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int n = sc.nextInt();
  
  calFactorial(n);
  
  
		
		
	}

}
