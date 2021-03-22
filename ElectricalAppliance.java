package com.sahaj.assignment.hotelpowermanagement;


enum ApplianceState {
	ON, OFF;
}
enum ApplianceType {
	AC, LIGHT;
}
public interface ElectricalAppliance {
	ApplianceType getType();
	ApplianceState getCurrentState();
	void switchon();
	void switchoff();
	int getNoOfUnitsConsumed();
}
