package com.sahaj.assignment.hotelpowermanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum CorridorType {
	MAINCORRIDOR, SUBCORRIDOR;
}


public class Corridor {
	private List<ElectricalAppliance> appliances;
	Map<ApplianceType, Integer> appliancecountmap = new HashMap<>();
	private int corridorid;
	private int floorid;
	private CorridorType type;
	public Corridor(int cooridorid, int floorid) {
		this.corridorid = cooridorid;
		this.floorid = floorid;
	}

	public int getFloorid() {
		return floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}

	public List<ElectricalAppliance> getAppliances() {
		return appliances;
	}

	public void setAppliances(List<ElectricalAppliance> appliances) {
		this.appliances = appliances;
	}
	
	public void addAppliance(ElectricalAppliance appliance) {
		this.appliances.add(appliance);
		if(appliancecountmap == null) {
			appliancecountmap = new HashMap<>();
		}
		if (appliancecountmap.containsKey(appliance.getType())) {
			appliancecountmap.put(appliance.getType(), appliancecountmap.get(appliance.getType()) + 1);
		} else {
			appliancecountmap.put(appliance.getType(), 1);
		}
	}
	
	public void removeAppliance(ElectricalAppliance appliance) {
		if(appliancecountmap.containsKey(appliance.getType())) {
			appliancecountmap.put(appliance.getType(), appliancecountmap.get(appliance.getType()) - 1);
		} else {
			System.out.println("Appliance not installed");
		}
		this.appliances.remove(appliance);
	}
	
	int getUnitsConsumed(Corridor c) {
		int totalUnitsConsumed = 0;
		for (ElectricalAppliance appliance : c.getAppliances()) {
			if (appliance.getCurrentState() == ApplianceState.ON) {
				totalUnitsConsumed += appliance.getNoOfUnitsConsumed();
			}
		}
		return totalUnitsConsumed;
	}
	
	public int getNumberofAppliances(ApplianceType a) {
		return appliancecountmap.get(a);
		
	}
	
	public CorridorType getType() {
		return this.type;
	}
}
