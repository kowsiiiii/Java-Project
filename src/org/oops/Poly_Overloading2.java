package org.oops;

//example2-Overloading

public class Poly_Overloading2 {

	private int sum(int x, int y) {
		return x + y;
	}

	private int sum(int x, int y, int z) {
		return x + y + z;
	}

	private double sum(double x) {
		return x;
	}

	public static void main(String[] args) {
		Poly_Overloading2 s = new Poly_Overloading2();
		System.out.println(s.sum(43, 765));
		System.out.println(s.sum(43, 765, 65));
		System.out.println(s.sum(43));

	}

}
