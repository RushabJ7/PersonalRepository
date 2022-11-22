package TPStesting;

public class TruckPlatooning {
	
	
	public String CheckExternalVehicle(String externalVehicleInfo, double vehicleLength,boolean sensorData){
		
		
		truckPlatooningData obj = new truckPlatooningData();
		if(sensorData == obj.getSensorStatus() ) {
		if(obj.getSensorData1() == externalVehicleInfo) {
			return obj.getPlatoonStatus1();
		}
		if(obj.getSensorData2()== externalVehicleInfo) {
			if(obj.getLength()<= vehicleLength) {
				return obj.getPlatoonStatus1();
			}
			else  {
				double newSpeed = obj.getCalibratedSpeed();
				obj.setSpeeds(newSpeed);
				
			}
			
		}
		return obj.getPlatoonStatus2();
			}
		else return obj.getSensorData3();
	}
	
	
	
	
	public boolean checkConnectivity(String check,boolean wifiModule) {
		truckPlatooningData obj = new truckPlatooningData();
		if(obj.getWifiModuleStatus()== wifiModule) {
		for(int i=0;i<3;i++) {
			if(check == obj.getConnectivityStatus()) {
				return true;
			}
		}
		return false;
		}
		else return false;
	}
	
	public String checkSpeedTV(double sp) {
		
		truckPlatooningData obj = new truckPlatooningData();
		
		if(sp == obj.getSpeed()) {
			return obj.getSpeedStatus1();
		}
		
		else return obj.getSpeedStatus2();
		
	}
	
	public String checkVicinity(int dist) {
		truckPlatooningData obj = new truckPlatooningData();
		if(dist < obj.getDistance()) {
			return obj.getEligiblity1();
		}
		else return obj.getEligiblity2();
		
	}
}
