package org.oops;
//example1-single inheritance

public class Single_Inheritance1 extends Encapsulation_Ex3 {

	private void mymethod6() {
		System.out.println("kowsalya");

	}

	@Override
	public void myMethod5(String name) {
		super.myMethod5(name);
	}

	public static void main(String[] args) {
		Single_Inheritance1 myobj4 = new Single_Inheritance1();
		myobj4.myMethod5("Ravi");
		myobj4.mymethod6();
	}
}
