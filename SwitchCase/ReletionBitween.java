package SwitchCase;

import java.util.*;

public class ReletionBitween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter about which you want to learn.\n"
   		+ "for priya press 1\n"
   		+ "for geeta press 2\n");
   int name = sc.nextInt();
   
   switch(name) {
   case 1:
	   System.out.println(" Priya is my younger sister");
	   break;
	   
   case 2:
	   System.out.println(" Geeta is my older sister");
	   break;
   
   
   
   }
		
		
	}

}
