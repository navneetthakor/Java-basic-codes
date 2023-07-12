package navneet1;

public class CallCost{

	public static void main(String[] args) {
		//Dcleretion
		double prin = 500;
		double rate = 6.87;
		double year = 9;
		double maturity;
		double interest;
		
		interest = (prin*rate*year)/100;
		System.out.println("Your interest is "+interest + " rupees only");
		
		maturity = prin + interest;
		System.out.println("Your Maturity amount is " + maturity + " rupees only");

	}

}
