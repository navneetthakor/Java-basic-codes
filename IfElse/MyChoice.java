package IfElse;

import java.util.*;

public class MyChoice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the amount, which you have:");
    int n = sc.nextInt();
    
    if(n > 150){
    System.out.println("You can visit restorunt and eat pannir bruji.");
    }else {
    	System.out.println("You have to eat maggi at home.");
    }
		
	}

}
