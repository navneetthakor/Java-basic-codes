package DoWhile;

import java.util.*;

public class GStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of stars:");
	int n = sc.nextInt();
	System.out.println("Enter the initial vallue");
	int i = sc.nextInt();
	int m = (n - i);
	System.out.println(" your " + m + " stars.");
	
	do {
		System.out.println("*" + " ");
		i++;
	}while(i < n);
	
	
	}

}
