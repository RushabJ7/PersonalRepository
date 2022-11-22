package TPStesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class checkVicinityJunit {
	@Test
	public void test1() {
			TruckPlatooning test = new TruckPlatooning();
			String output = test.checkVicinity(120);
			assertEquals("Not eligible for platooning", output);
	}
	
	@Test
	public void test2() {
		TruckPlatooning test = new TruckPlatooning();
		String output = test.checkVicinity(80);
		assertEquals("Eligible for platooning", output);
}

}
 
