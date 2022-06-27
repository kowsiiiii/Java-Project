package org.armstrong_palindrome_scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		int d=1212;
		int a = d, b, c = 0;
		while (a > 0) {
			b = a % 10;
			c = (c * 10) + b;
			a = a / 10;

		}
		if(d==c) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.println(c);

	}
}
