package org.oops;

public class Multilevel_InheritanceChild2 extends Multilevel_InheritanceChild1 {
	private void walk() {
System.out.println("walking");
	}
	@Override
	public void sleep() {
		super.sleep();
	}
	@Override
	public void eat() {
		super.eat();
	}
	@Override
	public void bark() {
		super.bark();
	}
	@Override
	public void play() {
		super.play();
	}
	public static void main(String[] args) {
		Multilevel_InheritanceChild2 a=new Multilevel_InheritanceChild2();
		a.sleep();
		a.eat();
		a.bark();
		a.play();
		a.walk();
		
	}
	

}
