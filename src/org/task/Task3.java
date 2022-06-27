package org.task;

import java.util.Scanner;

import com.looping.Else_If;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("loan eligibity criteria for an employee");
		System.out.println("An unmarried permanent job holder? yes/no/temporary");
	
	Scanner sc=new Scanner(System.in);
	String nextLine = sc.nextLine();
	System.out.println("service greater than 30 years more? yes/no");
	String nextLine2 = sc.nextLine();
	if(nextLine.equalsIgnoreCase("yes")&& nextLine2.equalsIgnoreCase("yes")) {
		System.out.println("eligible, and your loan amount will be Rs: 25,000");
	}
	else if (nextLine.equalsIgnoreCase("no")&& nextLine2.equalsIgnoreCase("yes")) {
		System.out.println("eligible, and your loan amount will be Rs: 35,000");
		
	}
	else {
		System.out.println("eligible, and your loan amount will be Rs: 10,000");
	}
	
		
		
	}
	
	}


