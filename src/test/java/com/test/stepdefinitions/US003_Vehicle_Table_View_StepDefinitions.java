package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.VehiclePage;
import com.test.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US003_Vehicle_Table_View_StepDefinitions {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    VehiclePage vehiclePage = new VehiclePage();
    int currentPageNumber;

    @When("user hover over to Fleet button and clicks to Vehicles")
    public void user_hover_over_to_fleet_button_and_clicks_to_vehicles() {
        homePage.waitUntilLoaderScreenDisappear();
        actions.moveToElement(homePage.fleetButton).perform();
        homePage.vehiclesButton.click();
    }

    @Then("user should see all vehicle information")
    public void user_should_see_all_vehicle_information() {
        homePage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(vehiclePage.vehicleTableColumnHeaders.isDisplayed());
    }

    @Then("user should see total page number")
    public void user_should_see_total_page_number() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().navigate().refresh(); //avoid StaleElementReferenceException inside assertion
        Assert.assertTrue(vehiclePage.totalPageNumber.isDisplayed());
    }

    @When("user clicks page forward button")
    public void user_clicks_page_forward_button() {
        currentPageNumber = Integer.parseInt(vehiclePage.currentPageNumber.getAttribute("value"));
        Driver.getDriver().navigate().refresh(); //avoid StaleElementReferenceException
        vehiclePage.pageForwardButton.click();
    }

    @Then("user should land on next page")
    public void user_should_land_on_next_page() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(currentPageNumber + 1, Integer.parseInt(vehiclePage.currentPageNumber.getAttribute("value")));
    }

    @When("user clicks page backward button")
    public void user_clicks_page_backward_button() {
        currentPageNumber = Integer.parseInt(vehiclePage.currentPageNumber.getAttribute("value"));
        Driver.getDriver().navigate().refresh(); //avoid StaleElementReferenceException
        vehiclePage.pageBackwardButton.click();
    }

    @When("user should land on previous page")
    public void user_should_land_on_previous_page() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(currentPageNumber - 1, Integer.parseInt(vehiclePage.currentPageNumber.getAttribute("value")));
    }

    @Then("user should see total recordings of vehicles")
    public void user_should_see_total_recordings_of_vehicles() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().navigate().refresh(); //avoid StaleElementReferenceException inside assertion
        Assert.assertTrue(vehiclePage.totalRecordingsOfVehicle.isDisplayed());
    }

    @When("user clicks to Export Grid button and select {string} format")
    public void user_clicks_to_export_grid_button_and_select_format(String string) {
        vehiclePage.exportGridButton.click();
        vehiclePage.downloadableTableDataFormatSelection(string).click();

    }
    @Then("user should see a confirmation message")
    public void user_should_see_a_confirmation_message() {
        Assert.assertTrue(vehiclePage.downloadConfirmationMessage.isDisplayed());
    }


}
