package com.looping;

public class Fabonacci2 {
	public static void main(String[] args) {
		int a=5,b=3,c;
		for (int i = 0; i < 30; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
			
		}
		
	}

}
