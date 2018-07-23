package com.parkinglot.parking;

import com.parkinglot.vehicle.Vehicle;

enum ParkingSize {
	SMALL, LARGE;
}

public class ParkingSpot {
	String id;
	ParkingSize size;
	Boolean isOccupied;

	public ParkingSpot(String id, ParkingSize size) {
		this.id = id;
		this.size = size;
	}

	public ParkingRecipt parkVehicle(Vehicle vehicle) {
		this.isOccupied = true;
		return new ParkingRecipt(vehicle);
	}

	public Vehicle unparkVehicle(ParkingRecipt recipt) {
		Vehicle parkedVehicle = recipt.getVehicle();
		if (parkedVehicle != null && this.isOccupied) {
			this.isOccupied = false;
		}
		return parkedVehicle;
	}
}
