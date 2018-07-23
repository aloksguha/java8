package com.java.collections.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationExample {
	public static void main(String[] args) {
		Set<String> items = new HashSet<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("D");
		
		System.out.println("1 ------");
		for (String item : items) {
			System.out.println(item);
		}

		System.out.println("\n\n2 ------lambda ");
		items.forEach(item -> System.out.println(item));
		
		System.out.println("\n\n3 ------");
		items.forEach(item -> {
			if ("A".equals(item)) {
				System.out.println(item);
			}
		});
		
		System.out.println("\n\n4 ------Method Reference ");
		items.forEach(System.out::println);
		
		System.out.println("\n\n5 ------Stream and filter");
		items.stream()
		.filter(s->s.contains("B"))
		.forEach(System.out::println);
		
		System.out.println("\n\n6 ------Iterator");
		Iterator<String> iterator =  items.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
