package UserInput;

import java.util.*;


public class CallCost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the duretion of call.");
        double duretion = sc.nextDouble();
        System.out.println("Enter the rate of call.");
        double rate = sc.nextDouble();
        System.out.println("Enter the current balance");
        double balance = sc.nextDouble();
        
        double cost = rate * duretion ;
        balance = (balance - cost);
        
        System.out.println("your call duretion is "+ duretion + "seconds.");
        System.out.println("Your call cost is " + cost + "rupees.");
        System.out.println("your blance is " + balance);
        
        
        
        

	}

}
