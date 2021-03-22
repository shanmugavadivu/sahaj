package com.sahaj.assignment.hotelpowermanagement;
import java.time.LocalDateTime;

public class SensorControllerImpl implements SensorController {

	@Override
	public void triggerEvent(Floor floor, Corridor corridor) {
		if (corridor.getType() == CorridorType.SUBCORRIDOR) {
			for (ElectricalAppliance appliance : corridor.getAppliances()) {
				if (appliance.getType() == ApplianceType.LIGHT
						&& (LocalDateTime.now().getHour() >= 18 || LocalDateTime.now().getHour() <= 6)) {
					appliance.switchon();
					
				}
			}
			if(floor.getTotalUnitsConsumed() > floor.getMaxPowerConsumptionAllowed()) {
				for (ElectricalAppliance appliance : corridor.getAppliances()) {
					if (appliance.getType() == ApplianceType.AC
							&& appliance.getCurrentState() == ApplianceState.ON) {
						appliance.switchoff();
					}
				}
			}
		}

	}

}
