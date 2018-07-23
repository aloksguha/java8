package com.parkinglot.parking;

import java.util.UUID;

import com.parkinglot.vehicle.Vehicle;

public class ParkingRecipt {
	String id;
	Vehicle vehicle;
	
	public ParkingRecipt(Vehicle vehicle) {
		this.id = UUID.randomUUID().toString();
		this.vehicle = vehicle;
	}
	
	Vehicle getVehicle(){
		return this.vehicle;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" -> "+this.getVehicle();
	}
	
}
