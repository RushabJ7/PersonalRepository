package TPStesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class checkSpeedTVJunit {

	@Test
	public void test1() {
		TruckPlatooning test = new TruckPlatooning();
		
		String output = test.checkSpeedTV(40);
		assertEquals("Speed is satisfied", output);
	}
	
	@Test
	public void test2() {
		TruckPlatooning test = new TruckPlatooning();
		
		String output = test.checkSpeedTV(50);
		assertEquals("Modify the speed by : ", output);
	}
}
 
