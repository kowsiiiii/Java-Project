package org.interfaces;

public class Inter_Child2 implements Interface2, Inter_Parent2 {
	@Override
	public void sub1() {
		System.out.println("statistics");
	}

	@Override
	public void sub2() {
		System.out.println("geology");
	}

	@Override
	public void marks1() {
		System.out.println("85");
	}

	@Override
	public void marks2() {
		System.out.println("96");
	}

	public static void main(String[] args) {
		Inter_Child2 s = new Inter_Child2();
		s.sub1();
		s.marks1();
		s.sub2();
		s.marks2();
	}

}
