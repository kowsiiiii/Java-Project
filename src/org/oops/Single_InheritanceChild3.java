package org.oops;
//example3

//single inheritance-child class

public class Single_InheritanceChild3 extends Single_Inheritance3 {

	private void method4() {
		System.out.println("hi dad");
	}

	private void method5() {
		System.out.println("was amazing experiance");

	}

	private void method6() {
		System.out.println("learning new things about ppl");

	}

	@Override
	public void method1() {

		super.method1();
	}

	@Override
	public void method2() {

		super.method2();
	}

	@Override
	public void method3() {

		super.method3();
	}

	public static void main(String[] args) {
		Single_InheritanceChild3 one = new Single_InheritanceChild3();
		one.method4();
		one.method1();
		one.method5();
		one.method2();
		one.method6();
		one.method3();
	}

}
