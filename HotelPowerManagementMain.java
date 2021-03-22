package com.sahaj.assignment.hotelpowermanagement;

public class HotelPowerManagementMain {
	
	public static void main(String args[]) {
		String hotelname = "Sowmya";
		String address = "dsdsdsd";
		Hotel hotel = new Hotel(hotelname, address);
		Floor floor1 = new Floor(1);
		Floor floor2 = new Floor(2);
		Corridor corridor = new MainCorridor(1, 1);
		
	}

}
