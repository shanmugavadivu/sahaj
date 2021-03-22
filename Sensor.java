package com.sahaj.assignment.hotelpowermanagement;


class InstallPlace {
	int floorId;
	
}
public class Sensor {
	
	private int sensorId;
	private InstallPlace place;
	
	Sensor(int sensorId, InstallPlace place) {
		this.sensorId = sensorId;
		this.place = place;
	}
	
    void notifyMovement() {
    	
    }
}
