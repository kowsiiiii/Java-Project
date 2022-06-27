package org.oops;

//example1
//single inheritance-child class
public class Single_InheritanceChild2 extends Single_Inheritance2 {
	private void result3() {
		System.out.println("hunting");
	}

	private void result4() {
		System.out.println("sleeping");

	}

	@Override
	public void result1() {

		super.result2();
	}

	@Override
	public void result2() {

		super.result2();
	}

	public static void main(String[] args) {
		Single_InheritanceChild2 one = new Single_InheritanceChild2();
		one.result1();
		one.result2();
		one.result3();
		one.result4();
	}

}
