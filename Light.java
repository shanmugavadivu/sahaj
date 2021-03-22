package com.sahaj.assignment.hotelpowermanagement;

public class Light implements ElectricalAppliance {
	private static final int light_units_consumed = 5;
	private int floorId;
	private String install;
	private int acId;
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

	public ApplianceState getState() {
		return state;
	}

	public void setState(ApplianceState state) {
		this.state = state;
	}

	public static int getLightUnitsConsumed() {
		return light_units_consumed;
	}

	private ApplianceState state;

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
		return light_units_consumed;
	}

	@Override
	public ApplianceType getType() {
		return ApplianceType.LIGHT;
	}

	@Override
	public ApplianceState getCurrentState() {
		return state;
	}
	
}
