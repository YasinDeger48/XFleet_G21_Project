package com.test.stepdefinitions;

import com.test.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setup(){
        Driver.getDriver().manage().deleteAllCookies();
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){


            byte[] snap = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(snap,"image/png",scenario.getName());
        }

        Driver.closeDriver();
    }
}
