package org.oops;

public class Hierarchical_InheritanceChild3 extends Hierarchical_Inheritance1 {
	public void lazy() {
		System.out.println("work was done only the day before exam");
	}

	public void low() {
		System.out.println("gatting low marks : 35");
	}

	@Override
	public void staff() {
		super.staff();
	}

	@Override
	public void exam() {
		super.exam();
	}

	public static void main(String[] args) {
		Hierarchical_Inheritance1 a = new Hierarchical_Inheritance1();
		Hierarchical_InheritanceChild1 b = new Hierarchical_InheritanceChild1();
		Hierarchical_InheritanceChild2 c = new Hierarchical_InheritanceChild2();
		Hierarchical_InheritanceChild3 d = new Hierarchical_InheritanceChild3();
		a.staff();
		a.exam();
		b.staff();
		b.exam();
		b.hardwork();
		b.high();
		c.staff();
		c.exam();
		c.medium();
		c.avarage();
		d.staff();
		d.exam();
		d.lazy();
		d.low();

	}

}
