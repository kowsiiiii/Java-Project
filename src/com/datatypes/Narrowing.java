package com.datatypes;

public class Narrowing {
	public static void main(String[] args) {
		double a = 54D;
		byte b = (byte) a;
		System.out.println("after narrowing : " + b);
	}

}
