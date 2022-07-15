package com.test.stepdefinitions;

import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @Test
    public void someTest(){

    }


    @Before
    public void setup(){
        Driver.getDriver().manage().deleteAllCookies();
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){


            byte[] snap = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(snap,"image/png",scenario.getName());

            try{
                File file = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(file,new File("\\/Users/values/IdeaProjects/XFleet_G21_Project/snaps"));
            }catch (IOException e){

            }
        }

        Driver.closeDriver();
    }
}
