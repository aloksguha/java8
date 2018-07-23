package com.parkinglot.vehicle;

public class SmallVehicle implements Vehicle {
	private String number;
	public SmallVehicle(String number) {
		this.number = number;
	}
	@Override
	public String getVehicleNumber() {
		// TODO Auto-generated method stub
		return this.number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.number;
	}
	
	
	
}
