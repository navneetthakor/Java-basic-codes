package DoWhile;

import java.util.*;

public class CanSeeMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter, how many times you want to print jhone cena's stetament.");
		int n = sc.nextInt();
		int i = 0;
		System.out.println("Your dizer stetament for " + n + " times.");
		do {
			System.out.println("Can't see me.");
			i++;
		}while(i<n);
		
		
	}

}
