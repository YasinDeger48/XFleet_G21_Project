package com.test.stepdefinitions;

import com.test.pages.Add_Event_2_Pages;
import com.test.pages.HomePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class Add_Event_2 {

    Add_Event_2_Pages add_Event_2_Pages = new Add_Event_2_Pages();
    HomePage homePage = new HomePage();
    Random random = new Random();

    @When("User hover over the Fleet")
    public void user_hover_over_the_fleet() {
        try {
            BrowserUtils.sleep(1);
            if (homePage.popUpForm.isDisplayed()) {
                homePage.popUpCloseButton.click();
            }
        } catch (Exception e) {
        }
        /*
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(add_Event_2_Pages.fleet).perform();
        */
        BrowserUtils.hover_Over(add_Event_2_Pages.fleet);
    }

    @When("User clicks the Vehicles button")
    public void user_clicks_the_vehicles_button() {
        /*
        BrowserUtils.sleep(1);
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actions.moveToElement(add_Event_2_Pages.vehicles).perform();
        BrowserUtils.sleep(3);
        add_Event_2_Pages.vehicles.click();
        */
        BrowserUtils.hover_Over_And_Click(add_Event_2_Pages.vehicles);
    }

    @When("User clicks any vehiclerow under Fleet-Vehicle module")
    public void user_clicks_any_vehicle_row_under_fleet_vehicle_module() {
        BrowserUtils.sleep(1);
        int randomNumber = random.nextInt(add_Event_2_Pages.carsTable.size());
        System.out.println("randomNumber = " + randomNumber);
        BrowserUtils.sleep(3);
        add_Event_2_Pages.carsTable.get(randomNumber).click();

    }

    @Then("User should be able to see the Add Event buton")
    public void user_should_be_able_to_see_the_add_event_buton() {
        Assert.assertTrue(add_Event_2_Pages.addEventButton.isDisplayed());
    }

}
