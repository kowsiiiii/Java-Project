package org.abstraction;

//example2-abstract
abstract class Abstract2 {
	public void name(String name1) {
		System.out.println("welcome " + name1);
	}

	public void product() {
		System.out.println("mobile phone");

	}

	public void price() {
		System.out.println("30000");
	}

	public void brand() {
		System.out.println("one plus");
	}

	public void payment() {
		System.out.println("online mode");
	}

	abstract void scan();

	abstract void otp();

}
