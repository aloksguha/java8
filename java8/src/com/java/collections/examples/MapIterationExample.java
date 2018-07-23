package com.java.collections.examples;

import java.util.HashMap;
import java.util.Map;

public class MapIterationExample {

	public static void main(String[] args) {
		Map<String, Phone> items = new HashMap<>();
		
		items.put("nokia", new Phone("X1", "P1"));
		items.put("iphone", new Phone("Y1", "Q1"));
		items.put("samsung", new Phone("Z1", "R1"));
		
		items.put("nokia", new Phone("X1", "P2"));
		
		
		items.forEach((k,v)->System.out.println("Key : " + k + " Phone : " + v));

	}

}

class Phone {
	private String model;
	private String make;
	
	public Phone(String model, String make) {
		this.model = model;
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+" of "+getMake();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
