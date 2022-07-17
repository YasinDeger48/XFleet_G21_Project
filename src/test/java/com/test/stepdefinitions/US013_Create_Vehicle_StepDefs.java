package com.test.stepdefinitions;

import com.test.pages.BasePage;
import com.test.pages.HomePage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class US013_Create_Vehicle_StepDefs {

    HomePage homePage = new HomePage();


    //AC1

    @Then("Truck Driver clicks Fleet")
    public void truck_driver_clicks_fleet() {
        homePage.fleetButton.click();
    }

    @Then("Truck Driver clicks Vehicles")
    public void truck_driver_clicks_vehicles() {
        homePage.vehiclesButton.click();
    }

    @Then("Create Car button shouldn't be displayed")
    public void create_car_button_shouldn_t_be_displayed() {

        boolean elementPresent = homePage.isElementPresent(homePage.createCarButton);
        Assert.assertFalse(elementPresent);

    }


}
