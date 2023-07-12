package UserInput;

import java.util.*;

public class Photons_Energy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter the frequency of photon in Hz.(please not add power of 10.)");
  double v = sc.nextDouble();
  System.out.println("plese enter the power of 10");
  int e = sc.nextInt();
  double E = (6.626* v);
  int e2 = (-31) + e;
  
  System.out.println("Your photos energy is " + E +" × 10^"+ e2 + " joule.");
		
		
	}

}
