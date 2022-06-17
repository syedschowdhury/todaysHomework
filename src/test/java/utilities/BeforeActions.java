package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

    @Before
    public void beforeActions(Scenario scen){
        System.out.println(">>>Initializing Driver");
        SetupDrivers.setupDriver();

        System.out.println("Scenario Name: "+scen.getName());

        System.out.println(scen.getName());
    }
}
