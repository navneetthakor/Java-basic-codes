package Functions;

import java.util.*;

public class PrimeOrNot {
	
	public static void primeOrNotprime(int n) {
		if(n%2 == 0) {
			System.out.println("This number is Prime");
			return;
		}else {
			System.out.println("This number is Not Prime");
		}
		    return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your dezired number:");
  int nk = sc.nextInt();
  
  primeOrNotprime(nk);
		
		
	}

}
