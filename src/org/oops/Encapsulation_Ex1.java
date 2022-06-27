package org.oops;

//example1-encapsulation
public class Encapsulation_Ex1 {
	private void myMethod1(String fname) {
		System.out.println(fname + "\n" + "hello java");
	}

	public static void main(String[] args) {
		Encapsulation_Ex1 myobj1 = new Encapsulation_Ex1();
		myobj1.myMethod1("hello python");

	}

}
