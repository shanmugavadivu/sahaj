package com.sahaj.assignment.hotelpowermanagement;

public class MainCorridor extends Corridor {
			
	
	public MainCorridor(int corridorId, int floorId) {
		super(corridorId, floorId);
	}

	void defaultstate(MainCorridor c) {
		for (ElectricalAppliance appliance : c.getAppliances()) {
			if(appliance.getType() == ApplianceType.LIGHT) {
				appliance.switchon();
			}
		}
	}
}
