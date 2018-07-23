package com.java.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListIterationExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("C");
		items.add("B");
		items.add("D");
		
		
//		System.out.println("1".compareTo("2"));
		
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
		
		
		
		Collections.sort(items, (s1, s2) -> s1.compareTo(s2));
		System.out.println("\n\n2 ------sorted lambda ");
		items.forEach(item -> System.out.println(item));
		
		
		
		
	}

}
