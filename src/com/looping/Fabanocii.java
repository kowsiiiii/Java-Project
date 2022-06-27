package com.looping;

import java.util.Scanner;

public class Fabanocii {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.close();
		int number = s.nextInt();
		int a=1,b=2,c;
		for (int i = 0; i < number; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

}
