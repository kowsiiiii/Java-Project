package com.constructor;

public class Constructor {
	// non parameterized constructor
	public Constructor() {
		System.out.println("this is an example for no argument constructor");
		System.out.println("supports overloading also not supports overriding");
	}

	// parameterized constructor-one parameter
	public Constructor(String name) {
		System.out.println(name);
		System.out.println("welcome " + name);
	}

	// parameterized constructor-two parameter
	public Constructor(char gender, int id) {
		System.out.println(gender + "\n" + id);

	}

	public static void main(String[] args) throws Throwable {
		Constructor a = new Constructor();
		Constructor b = new Constructor("kowsalya");
		Constructor c = new Constructor('F', 123);
		a.finalize();
		b.finalize();
		c.finalize();
	}

}
