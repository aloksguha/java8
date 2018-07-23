package com.parkinglot.vehicle;

public class LargeVehicle implements Vehicle {

	private String number;
	public LargeVehicle(String number) {
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
