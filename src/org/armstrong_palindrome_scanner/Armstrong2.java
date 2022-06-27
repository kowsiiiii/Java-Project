package org.armstrong_palindrome_scanner;

public class Armstrong2 {
	public static void main(String[] args) {

		int s = 1, a, b = 0, c;
		System.out.println("armstrong from 1 to 1000");

		while (s < 1000) {
			c = s;
			b = 0;

			while (c > 0) {
				a = c % 10;
				b = b + (a * a * a);
				c = c / 10;

			}
			if (b == s)
				System.out.println(s);
			s++;

		}
	}
}
