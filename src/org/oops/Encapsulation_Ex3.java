package org.oops;
//example3-encapsulation

public class Encapsulation_Ex3 {

	public void myMethod5(String name) {
		System.out.println(name + " varma");
	}

	public static void main(String[] args) {
		Encapsulation_Ex3 myobj3 = new Encapsulation_Ex3();
		myobj3.myMethod5("Ravi");
		myobj3.myMethod5("Rahul");
		myobj3.myMethod5("Adithya");
	}
}
