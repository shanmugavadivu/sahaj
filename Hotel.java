package com.sahaj.assignment.hotelpowermanagement;

public class Hotel {
	private String hotelname;
	private String address;
	Hotel(String hotelname, String address) {
		this.hotelname = hotelname;
		this.address = address;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
