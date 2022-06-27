package org.armstrong_palindrome_scanner;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first = sc.nextInt();
		sc.close();
		int a=first,b,c=0;
		while(a>0){
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			
		}if(first==c) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
