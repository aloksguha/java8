package com.parkinglot.parking;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;

import com.parkinglot.vehicle.Vehicle;

public class ParkingLot {
	int spaces;
	Stack<ParkingSpot> parkingSpaces; 
	String zipcode;
	Map<ParkingRecipt, ParkingSpot> parkingMap = new HashMap<ParkingRecipt, ParkingSpot>();
	
	
	public ParkingLot(int spaces, String zipcode) {
		this.spaces = spaces;
		this.zipcode = zipcode;
		intiParkingSpaces();
	}
	
	public void intiParkingSpaces(){
		
		this.parkingSpaces = new Stack<ParkingSpot>();
		for(int i=0; i<this.spaces; i++) {
			ParkingSpot parkingSpot = new ParkingSpot(UUID.randomUUID().toString(),ParkingSize.LARGE);
			this.parkingSpaces.push(parkingSpot);
		}
	}
	
	
	public ParkingRecipt placeVehicle(Vehicle vehicle) throws Exception {
		ParkingSpot spot =  this.parkingSpaces.pop();
		ParkingRecipt recipt = spot.parkVehicle(vehicle);
		parkingMap.put(recipt, spot);
		return recipt;
	}

	
	public Vehicle retriveVehicle(ParkingRecipt parkingRecipt) throws Exception {
		ParkingSpot spot = parkingMap.get(parkingRecipt);
		parkingMap.remove(parkingRecipt);
		Vehicle vehicle = spot.unparkVehicle(parkingRecipt);
		parkingSpaces.push(spot);
		return vehicle;
	}
	
	public int getAvailbleSpace() {
		return this.parkingSpaces.size();
	}
	
}
