
package org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class Map1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "karthick");
		m.put(2, "kowsalya");
		m.put(3, "selva");
		m.put(4, "anu");
		m.put(null, "java");
		m.put(null, "selenium");
		System.out.println(m);

		// size

		int size = m.size();
		System.out.println(size);

		// get

		String string = m.get(0);
		System.out.println(string);

		// keySet

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		// value

		Collection<String> values = m.values();
		System.out.println(values);

		// containsKey

		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);

		// containsValue

		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);

		// entrySet

		m.entrySet();
		System.out.println(m);

		// iterator

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
					.next();
			System.out.println(entry);
		}

		// for-each

		for (String string2 : values) {
			System.out.println(string2);

		}

	}

}
