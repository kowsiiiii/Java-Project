package org.task;

import java.util.Scanner;

public class Tax {
	

	public static void main(String[] args) {

		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		num = sc.nextDouble();
		sc.close();
		if (num > 1000000) {
			System.out.println("the tax is 30%");
		} else if (num > 500000) {
			System.out.println("the tax is 20%");

		} else {
			System.out.println("the tax is 5%");
		}
		System.out.println("Housing loan EMI and Education loan should be considered");
	}

}
