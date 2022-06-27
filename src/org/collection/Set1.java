package org.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {

		Set<Object> s = new LinkedHashSet<Object>();
		s.add(7576);
		s.add("java");
		s.add("selenium");
		s.add("selenium");
		s.add(6.8768);
		s.add(54.8768876);
		System.out.println(s);

		// size

		int size = s.size();
		System.out.println(size);

		// remove

//		s.remove(7576);
//		System.out.println(s);

		// contains

		boolean contains = s.contains("selenium");
		System.out.println(contains);

		// clear

//		s.clear();
//		System.out.println(s);

		// addAll

		Set<Object> s1 = new LinkedHashSet<Object>();
		s1.add(7576);
		s1.add("java");
		s1.add("framework");
		s1.add("framework");
		s1.add(78687);
		s1.add(78);
		System.out.println(s1);

//		s.addAll(s1);
//		System.out.println(s);

		// retainAll

		s.retainAll(s1);
		System.out.println(s);

		// removeAll

		s.removeAll(s1);
		System.out.println(s);

	}

}
