package UserInput;

import java.util.*;

public class FamailyIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your name:");
    String son = sc.next();
    System.out.println("Enter your father's name:");
    String father = sc.next();
    
    System.out.println("HI Mr."+ son + ". Your father Mr. " + father + " is waiting for you.");
	}

}
