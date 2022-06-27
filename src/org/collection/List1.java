package org.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {

		List<Object> l = new ArrayList<Object>();
		l.add(667);
		l.add("kowsalya");
		l.add(9.876);
		l.add('F');
		System.out.println(l);

		int size = l.size();
		System.out.println(size);
		Object object = l.get(2);
		System.out.println(object);
		Object set = l.set(0, 23);
		System.out.println(set);
		System.out.println(l);
		Object remove = l.remove(2);
		System.out.println(remove);
		System.out.println(l);
		int indexOf = l.indexOf(23);
		System.out.println(indexOf);
		boolean contains = l.contains("kowsalya");
		System.out.println(contains);
//		l.clear();
//		System.out.println(l);
		List<Object> l1 = new ArrayList<Object>();
		l1.add(23);
		l1.add("selva");
		l1.add(9.876);
		l1.add('M');
//		System.out.println(l1);
//		l.addAll(l1);
		System.out.println(l);
		l.retainAll(l1);
		System.out.println(l);
		l.removeAll(l1);
		System.out.println(l);

	}

}
