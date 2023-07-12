package IfElse;

import java.util.*;

public class Comperision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter value of a :");
        		 int a = sc.nextInt();
         System.out.println("Enter value of b :");
        		 int b = sc.nextInt();
                 System.out.println("Enter value of c :");
        		 int c = sc.nextInt();
        		 
        		 if(a > b) {
        			 if(a > c) {
        				 System.out.println("The numbur a " + a +" is greter in this three numbers.");
        			 }else {
        				 System.out.println("The numbur c "+ c +" is greter in this three numbers.");
        			 }
        			 
        			 
        		 }else {
        			 if(b > c) {
        				 System.out.println("The numbur b " + b +" is greter in this three numbers.");
        			 }else {
        				 System.out.println("The numbur c " + c + " is greter in this three numbers.");
        			 }
        		 }
	}
}
