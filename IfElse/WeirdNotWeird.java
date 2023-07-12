package IfElse;

import java.util.*;

public class WeirdNotWeird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number n in renge of 1<= n<=100:");
	        int N = sc.nextInt();
	        String s = sc.nextLine();

            if(N%2 == 0){
                if(N<6)
                {
                    System.out.println("Not weird");
                }else if(N<21)
                {
                    System.out.println("Weird");
                }else
                {
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }
		
		
	}

}
