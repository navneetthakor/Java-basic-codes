package UserInput;

import java.util.*;

public class CollegeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String n = sc.nextLine();
		
		System.out.println("Enter your college name:");
		String c = sc.nextLine();
		
		System.out.println("Enter your college location:");
		String l = sc.nextLine();
		
		System.out.println("............. Info. of college student .........");
		System.out.println("Name of college student: " + n);
		System.out.println("Student studing in college: " + c);
		System.out.println("College is located: " + l);

	}

}
