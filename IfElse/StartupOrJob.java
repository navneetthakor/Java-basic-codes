package IfElse;
import java.util.*;

public class StartupOrJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
  
  System.out.println("Enter your name:");
  String nk = sc.next();
  
  System.out.println("Enter your interest:");
  System.out.println("1.risk teking.");
  System.out.println("2.not risk only sef.");
  int n = sc.nextInt();
  
  if(n == 1) {
	  System.out.println("You should go for Startup.");
  }else {
	  System.out.println("You should go for job.");
  }
	System.out.println("");
  System.out.println("BUT, For all");
  System.out.println(" all should try for startup once.");
		
	}

}
