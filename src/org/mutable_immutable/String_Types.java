package org.mutable_immutable;

//immutable - String

public class String_Types {
	public static void main(String[] args) {
		String a = "Welcome to java";
		String b = "Welcome to java";
		System.out.println("immutable type");
		int identityHashCode = System.identityHashCode(a);
		System.out.println("memory of a : " + identityHashCode);
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println("memory of b : " + identityHashCode2);
		String concat = a.concat(b);
		System.out.println(concat);
		int identityHashCode3 = System.identityHashCode(concat);
		System.out.println("memory after concat in immutable type : " + identityHashCode3);

//mutable - StringBuffer	

		System.out.println("mutable type - StringBuffer");
		StringBuffer c = new StringBuffer("hello java");
		StringBuffer d = new StringBuffer("hello java");
		int identityHashCode4 = System.identityHashCode(c);
		System.out.println("memory of c : " + identityHashCode4);
		int identityHashCode5 = System.identityHashCode(d);
		System.out.println("memory of d : " + identityHashCode5);
		StringBuffer append = c.append(d);
		System.out.println(append);
		int identityHashCode6 = System.identityHashCode(append);
		System.out.println("memory after append in mutable type : " + identityHashCode6);

//mutable - StringBuilder

		System.out.println("mutable type - StringBuffer");
		StringBuilder e = new StringBuilder("java for fun");
		StringBuilder f = new StringBuilder("java for fun");
		int identityHashCode7 = System.identityHashCode(c);
		System.out.println("memory of c : " + identityHashCode7);
		int identityHashCode8 = System.identityHashCode(d);
		System.out.println("memory of d : " + identityHashCode8);
		StringBuilder append1 = e.append(f);
		System.out.println(append1);
		int identityHashCode9 = System.identityHashCode(append);
		System.out.println("memory after append1 in mutable type : " + identityHashCode9);

	}
}
