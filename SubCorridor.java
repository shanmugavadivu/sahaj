package com.sahaj.assignment.hotelpowermanagement;

import java.time.LocalDateTime;

public class SubCorridor extends Corridor {
	
	public SubCorridor(int corridorId, int floorId) {
		super(corridorId, floorId);
	}

	
	void switchonlights(Corridor c) {
		if(LocalDateTime.now().getHour() >= 18 && LocalDateTime.now().getHour() <= 6) {
		}
	}
	
}
