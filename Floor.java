package com.sahaj.assignment.hotelpowermanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
	private static int totalunitsconsumed = 0;
	private int floorid;
	private List<Corridor> corridors;
	private Map<CorridorType, Integer> corridorcountmap;
	
	Floor(int floorid) {
		this.floorid = floorid;
		
	}
	public int getFloorid() {
		return floorid;
	}

	public void setFloorid(int floorid) {
		this.floorid = floorid;
	}

	public List<Corridor> getCorridors() {
		return corridors;
	}

	public void setCorridors(List<Corridor> corridors) {
		this.corridors = corridors;
	}
	
	public void addCorridor(Corridor corridor) {
		this.corridors.add(corridor);
		if (corridorcountmap == null) {
			corridorcountmap = new HashMap<CorridorType, Integer>();
		}
		if (corridorcountmap.containsKey(corridor.getType())) {
			corridorcountmap.put(corridor.getType(), corridorcountmap.get(corridor.getType()) + 1);
		} else {
			corridorcountmap.put(corridor.getType(), 1);
		}
	}
	
	public void removeCorridor(Corridor corridor) {
		if(corridorcountmap.containsKey(corridor.getType())) {
			corridorcountmap.put(corridor.getType(), corridorcountmap.get(corridor.getType()) - 1);
		} else {
			System.out.println("Appliance not installed");
		}
		this.corridors.remove(corridor);
	}
	
	public int getNumberOfMainCorridors() {
		return corridorcountmap.get(CorridorType.MAINCORRIDOR);
	}
	
	public int getNumberOfSubCorridors() {
		return corridorcountmap.get(CorridorType.SUBCORRIDOR);
	}
	
	public int getMaxPowerConsumptionAllowed() {
		return (getNumberOfMainCorridors() * 15) + (getNumberOfSubCorridors() * 10);
	}
	
	public int getTotalUnitsConsumed() {
		for (Corridor corridor : corridors) {
			totalunitsconsumed += corridor.getUnitsConsumed(corridor);
		}
		return totalunitsconsumed;
	}
	
	public List<SubCorridor> getSubCorridors() {
		List<SubCorridor> subCorridors = null;
		for(Corridor corridor : this.getCorridors()) {
			if(corridor.getType() == CorridorType.SUBCORRIDOR) {
				if(subCorridors == null) {
					subCorridors = new ArrayList<SubCorridor>();
				}
				subCorridors.add((SubCorridor) corridor);
			}
		}
		return subCorridors;
	}
	
	public List<MainCorridor> getMainCorridors() {
		List<MainCorridor> mainCorridors = null;
		for(Corridor corridor : this.getCorridors()) {
			if(corridor.getType() == CorridorType.SUBCORRIDOR) {
				if(mainCorridors == null) {
					mainCorridors = new ArrayList<MainCorridor>();
				}
				mainCorridors.add((MainCorridor) corridor);
			}
		}
		return mainCorridors;
	}

}
