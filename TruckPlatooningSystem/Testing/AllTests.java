package TPStesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ checkConnectivityJunit.class, checkVicinityJunit.class, checkSpeedTVJunit.class, CheckExternalVehicle.class })
public class AllTests {

}
 
