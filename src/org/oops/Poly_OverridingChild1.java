package org.oops;



public class Poly_OverridingChild1 extends Poly_Overriding1 {
	@Override
	public void walk(double f) {
		super.walk(f);
	}

	@Override
	public void walk(float b) {
		super.walk(b);
	}

	@Override
	public void walk(int a) {
		super.walk(a);
	}

	@Override
	public void walk(String name) {
		super.walk(name);
	}

	public static void main(String[] args) {
		Poly_OverridingChild1 ref = new Poly_OverridingChild1();
		ref.walk("kowsalya");
		ref.walk(123);
		ref.walk(4534f);
		ref.walk(765765d);
	}

}

	


