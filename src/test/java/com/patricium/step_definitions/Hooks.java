package com.patricium.step_definitions;

import com.patricium.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){
        if(scenario.isFailed()){byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","IMAGE of "+scenario.getName() );}
        Driver.closeDriver();
    }
}
