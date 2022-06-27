package org.armstrong_palindrome_scanner;

public class Armstrong {
	public static void main(String[] args) {
		int s = 153;
		int a = s, b, c = 0;
		while (a > 0) {
			b = a % 10;
			c = c + (b * b * b);
			a = a / 10;

		}
		if (s == c) {
			System.out.println("armstrong");
		} else {
			System.out.println("not an armstrong");
		}
	}
}
