package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.VehiclePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleTableArrangements_StepDefinitions {
    HomePage homePage = new HomePage();
    VehiclePage vehiclePage = new VehiclePage();
    @When("User clicks Flight\\/Vehicle module")
    public void user_clicks_flight_vehicle_module() {
        homePage.fleetButton.click();
        homePage.vehiclesButton.click();
    }
    @Then("User can arrange rows\\/vehicle numbers to be displayed")
    public void user_can_arrange_rows_vehicle_numbers_to_be_displayed() {
       vehiclePage.dropdownViewPerPage.click();
       vehiclePage.dropdown10.click();
       Assert.assertTrue(vehiclePage.tenthRow.isDisplayed());

        vehiclePage.dropdownViewPerPage.click();
        vehiclePage.dropdown25.click();
        Assert.assertTrue(vehiclePage.twentyfifthRow.isDisplayed());

        vehiclePage.dropdownViewPerPage.click();
        vehiclePage.dropdown50.click();
        Assert.assertTrue(vehiclePage.fiftiethRow.isDisplayed());

        vehiclePage.dropdownViewPerPage.click();
        vehiclePage.dropdown100.click();
        Assert.assertTrue(vehiclePage.lastRow.isDisplayed());
    }


    @And("User clicks Flight\\/Vehicle module")
    public void userClicksFlightVehicleModule() {
        homePage.fleetButton.click();
        homePage.vehiclesButton.click();
    }
}
