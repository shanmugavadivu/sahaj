package com.sahaj.assignment.hotelpowermanagement;

public class ElectricalApplianceFactory {
	
	public static ElectricalAppliance getinstance(String name, int numberofunitsconsumed) {
		switch(name) {
		case "AC":
			return new AC();
				
		}
	}

}
