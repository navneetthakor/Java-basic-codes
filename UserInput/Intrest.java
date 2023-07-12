package UserInput;

import java.util.*;

public class Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter Principal Value:");
       double principal = sc.nextDouble();
       System.out.println("Enter rate of interest:");
       double rate = sc.nextDouble();
       System.out.println("Enter years of duretion:");
       double years = sc.nextDouble();
       double maturity;
       double intrest;
       
       intrest = (principal*rate*years)/100;
       maturity = intrest + principal;
    		   System.out.println("Your interest amout for duretion of " + years + " years is " + intrest + " rupees only");
       System.out.println("your maturity amount is "+ maturity + " rupees only");
	}

}
