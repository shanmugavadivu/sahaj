package com.sahaj.assignment.hotelpowermanagement;

public class AC implements ElectricalAppliance {
	private static final int ac_units_consumed = 10;
	private int floorId;
	private String install;
	private int acId;
	private ApplianceState state;
	
	AC(int acId, String install, int floorId) {
		this.floorId = floorId;
		this.acId = acId;
		this.install = install;
		switchon();
	}

	public int getFloorId() {
		return floorId;
	}


	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}


	public String getInstall() {
		return install;
	}


	public void setInstall(String install) {
		this.install = install;
	}


	public int getAcId() {
		return acId;
	}


	public void setAcId(int acId) {
		this.acId = acId;
	}


	

	@Override
	public void switchon() {
		state = ApplianceState.ON;
	}

	@Override
	public void switchoff() {
		state = ApplianceState.OFF;
	}

	@Override
	public int getNoOfUnitsConsumed() {
		return ac_units_consumed;
	}
	@Override
	public ApplianceType getType() {
		return ApplianceType.AC;
		
	}
	@Override
	public ApplianceState getCurrentState() {
		return state;
	}
	
}
