package IfElse;

import java.util.*;

public class ClassmetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("The computer engineering student's roll number is bitween 1 to 120. so enter your roll number.");
   
   int a = sc.nextInt();
   System.out.println("Also enter your name");
   String name = sc.next();
   
   
   if(a<=120) {
	   System.out.println("dear "+ name +". You are my classmet.");
   }else {
	   System.out.println("dear " + name + ". You are not my classmet.");
   }
   
		
		
	}

}
