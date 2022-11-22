package TPStesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckExternalVehicle {

	@Test
	public void test1() {
		TruckPlatooning test = new TruckPlatooning();
		String output = test.CheckExternalVehicle("No external vehicle", 125, true);
		assertEquals("Continue platooning with same speed", output);
	}

	@Test
	public void test2() {
		TruckPlatooning test = new TruckPlatooning();
		String output = test.CheckExternalVehicle("External vehicle detected", 25,true);
		assertEquals("Platooning with modified speed", output);
	}
	
	@Test
	public void test3() {
		TruckPlatooning test = new TruckPlatooning();
		String output = test.CheckExternalVehicle("External vehicle detected", 125,true);
		assertEquals("Continue platooning with same speed", output);
	}
	@Test
	public void test4() {
		TruckPlatooning test = new TruckPlatooning();
		String output = test.CheckExternalVehicle("No external vehicle", 125, false);
		assertEquals("Check sensor, data not recieving", output);
	}
	
}
 
