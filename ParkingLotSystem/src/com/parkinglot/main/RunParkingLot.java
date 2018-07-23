package com.parkinglot.main;


import java.util.Stack;
import com.parkinglot.parking.ParkingLot;
import com.parkinglot.parking.ParkingRecipt;
import com.parkinglot.parking.ParkingSpot;
import com.parkinglot.vehicle.LargeVehicle;
import com.parkinglot.vehicle.SmallVehicle;
import com.parkinglot.vehicle.Vehicle;

public class RunParkingLot {

	public static void main(String[] args) {
		
		ParkingLot lot = new ParkingLot(2, "411006");
		
		Vehicle smallVehicle1 = new SmallVehicle("MH14-AY-0955");
		Vehicle smallVehicle2 = new SmallVehicle("MH14-BY-0955");
		Vehicle largeVehicle = new LargeVehicle("MH14-CY-0955");
		
		try {
			System.out.println("Total spaces.."+lot.getAvailbleSpace());
			ParkingRecipt recipt1 = lot.placeVehicle(smallVehicle1);
			System.out.println(lot.getAvailbleSpace());
			ParkingRecipt recipt2 = lot.placeVehicle(smallVehicle2);
			System.out.println(lot.getAvailbleSpace());
			ParkingRecipt recipt3 = lot.placeVehicle(largeVehicle);
			System.out.println(lot.getAvailbleSpace());
			
			
			System.out.println(recipt1);
			System.out.println(recipt2);
			System.out.println(recipt3);
			System.out.println("----------");
			
			Vehicle v1 = lot.retriveVehicle(recipt1);
			System.out.println(lot.getAvailbleSpace());
			Vehicle v2 = lot.retriveVehicle(recipt2);
			System.out.println(lot.getAvailbleSpace());
			Vehicle v3 = lot.retriveVehicle(recipt3);
			System.out.println(lot.getAvailbleSpace());
			
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
