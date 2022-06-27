package org.oops;

public class Hierarchical_InheritanceChild1 extends Hierarchical_Inheritance1 {
	public void hardwork() {
		System.out.println("working hard");
	}

	public void high() {
		System.out.println("high scores : 90");
	}

	@Override
	public void staff() {
		super.staff();
	}

	@Override
	public void exam() {
		super.exam();
	}

}
