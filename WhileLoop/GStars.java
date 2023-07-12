package WhileLoop;

import java.util.*;

public class GStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the number of stars.");
		int n = sc.nextInt();
		System.out.println("Your "+ n + " stars are following.");
		
		while(i<n) {
			System.out.print("*" + " ");
			i++;
		}
	}

}
