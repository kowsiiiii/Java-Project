package org.task;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your electricity bill : ");
		d = sc.nextInt();
		sc.close();
		if (d > 1000) {
			System.out.println("Charge Rs.10/- per unit");
			if (d > 500) {
				System.out.println("Charge Rs.5/- per unit");
			}
		} else if (d > 200) {
			System.out.println("Charge Rs.2/- per unit");
		} else {
			System.out.println("Charge Rs.1/- per unit");

		}

	}

}