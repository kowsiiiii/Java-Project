package com.constructor;

public class This_Keyword {
	private void one() {
		System.out.println("Ravi_Varma");

	}

	private void two() {
		System.out.println(24);
		this.one();

	}

	private void three(String qualification) {
		System.out.println(qualification);
		this.two();

	}

	private void four(String designation) {
		System.out.println(designation);
		this.three("MIB");

	}

	public static void main(String[] args) {
		This_Keyword r = new This_Keyword();
		r.four("Trainer");
	}

}
