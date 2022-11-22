package TPStesting;

import java.util.Random;

public class truckPlatooningData {
	private double distance =100; //1st
	private int length = 30;
	private String str1 ="Eligible for platooning"; //1st
	private String str2 = "Not eligible for platooning"; //1st
	private String[] arr = {"Connected","Not connected"}; //2nd
	Random r = new Random(); //2nd
	int randomNumber=r.nextInt(arr.length); //2nd
	String str3 = "Connected"; //2nd
	private double spTV = 40; //3rd
	private String str4 = "Speed is satisfied";//3rd
	private String str5 = "Modify the speed by : "; //3rd
	private String sensorCheck1 = "No external vehicle";
	private String sensorCheck2 = "External vehicle detected";
	private String platoonStatus1 = "Continue platooning with same speed";
	private String platoonStatus2 = "Platooning with modified speed";
	private double calibratedSpeedTV = 30;
	private boolean sensorData = true;
	private String str6 = "Check sensor, data not recieving";
	private boolean wifi = true;
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance =distance;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getEligiblity1() {
		return str1;
	}
	public void setEligiblity1(String str1) {
		this.str1 =str1;
	}
	
	public String getEligiblity2() {
		return str2;
	}
	public void setEligiblity2(String str2) {
		this.str2 =str2;
	}
	
	public String getConnectivityStatus() {
		return str3;
	}
	public void setConnectivityStatus(String str3) {
		this.str3 =str3;
	}
	
	public double getSpeed() {
		return spTV;
	}
	public void setSpeeds(double spTV) {
		this.spTV =spTV;
	}
	
	public String getSpeedStatus1() {
		return str4;
	}
	public void setSpeedStatus1(String str4) {
		this.str4 =str4;
	}
	
	public String getSpeedStatus2() {
		return str5;
	}
	public void setSpeedStatus2(String str5) {
		this.str5 =str5;
	}
	
	public String getSensorData1() {
		return sensorCheck1;
	}
	public void setSensorData1(String sensorCheck1) {
		this.sensorCheck1 =sensorCheck1;
	}
	
	public String getSensorData2() {
		return sensorCheck2;
	}
	public void setSensorData2(String sensorCheck2) {
		this.sensorCheck2 =sensorCheck2;
	}
	
	public String getPlatoonStatus1() {
		return platoonStatus1;
	}
	public void setPlatoonStatus1(String platoonStatus1) {
		this.platoonStatus1 =platoonStatus1;
	}
	
	public String getPlatoonStatus2() {
		return platoonStatus2;
	}
	public void setPlatoonStatus2(String platoonStatus2) {
		this.platoonStatus2 =platoonStatus2;
	}
	
	public double getCalibratedSpeed() {
		return calibratedSpeedTV;
	}
	public void setCalibratedSpeed(int calibratedSpeedTV) {
		this.calibratedSpeedTV =calibratedSpeedTV;
	}
	
	public boolean getSensorStatus() {
		return sensorData;
	}
	public void setSensorStatus(boolean sensorData) {
		this.sensorData =sensorData;
	}
	
	public boolean getWifiModuleStatus() {
		return wifi;
	}
	public void setWifiModuleStatusStatus(boolean wifi) {
		this.wifi =wifi;
	}
	
	public String getSensorData3() {
		return str6;
	}
	public void setSensorData3(String str6) {
		this.str6 =str6;
	}
}
 
