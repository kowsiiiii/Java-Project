package org.oops;
//example1-overloading

public class Poly_Overloading1 {

	private void emp_Details(String name) {
		System.out.println(name);
	}

	private void emp_Details(byte age) {
		System.out.println(age);
	}

	private void emp_Details(short id) {
		System.out.println(id);
	}

	private void emp_Details(int pan) {
		System.out.println(pan);
	}

	private void emp_Details(long mob) {
		System.out.println(mob);
	}

	private void emp_Details(char gender) {
		System.out.println(gender);
	}

	private void emp_Details(double salary) {
		System.out.println(salary);
	}

	private void emp_Details(float num) {
		System.out.println(num);
	}

	private void emp_Details(boolean istrue) {
		System.out.println(istrue);
	}

	public static void main(String[] args) {
		Poly_Overloading1 one = new Poly_Overloading1();
		one.emp_Details("Ravi_Varma");
		one.emp_Details(24);
		one.emp_Details(68);
		one.emp_Details(18752);
		one.emp_Details(8756554543L);
		one.emp_Details('M');
		one.emp_Details(60000);
		one.emp_Details(123);
		one.emp_Details("true");

	}
}
