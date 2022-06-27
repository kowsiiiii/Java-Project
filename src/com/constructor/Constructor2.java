package com.constructor;

public class Constructor2 {
	public Constructor2() {
		System.out.println("kerry indev logistics pvt.ltd.,");

	}

	public Constructor2(int number) {
		this(123456789l);
		System.out.println(number);

	}

	public Constructor2(String address) {
		this(2345d);
		System.out.println(address);

	}

	public Constructor2(double salary) {
		System.out.println(salary);

	}

	public Constructor2(float pf) {
		this(45);
		System.out.println(pf);
	}

	public Constructor2(long salaryId) {
		this("chennai");
		System.out.println(salaryId);
	}

	public static void main(String[] args) throws Throwable {
		Constructor2 s = new Constructor2(234f);

	}

}
