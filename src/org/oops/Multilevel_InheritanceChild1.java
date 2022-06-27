package org.oops;

public class Multilevel_InheritanceChild1 extends Multilevel_Inheritance1 {
	public void bark() {
		System.out.println("barking");
	}

	public void play() {
		System.out.println("playing");
	}
	@Override
	public void sleep() {
		super.sleep();
	}
	@Override
	public void eat() {
		super.eat();
	}
	
	

	

}
