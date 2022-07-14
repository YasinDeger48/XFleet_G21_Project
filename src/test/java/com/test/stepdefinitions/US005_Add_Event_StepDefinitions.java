package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class US005_Add_Event_StepDefinitions {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
    Random random = new Random();

    @Then("User hover over the fleet button")
    public void user_hover_over_the_fleet_button() {

        if(homePage.popUpForm.isDisplayed()){
            homePage.popUpCloseButton.click();
        }
        BrowserUtils.sleep(1);
        actions.moveToElement(homePage.fleetButton).perform();

    }

    @Then("User sees Vehicles button and click it")
    public void user_sees_vehicles_button_and_click_it() {
        wait.until(ExpectedConditions.visibilityOf(homePage.vehiclesButton));
        //Assert.assertTrue(homePage.vehiclesButton.isDisplayed());
        homePage.vehiclesButton.click();

    }
    @Then("User sees Vehicle Table pages")
    public void user_sees_vehicle_table_pages() {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        Assert.assertTrue(homePage.homePageTitle.isDisplayed());

    }
    @Then("User clicks the random vehicles")
    public void user_clicks_the_random_vehicles() {
        int randomNumber = random.nextInt(homePage.tableRows.size());
        homePage.tableRows.get(randomNumber).click();

    }
    @Then("User sees the {string} page")
    public void user_sees_the_page(String string) {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        Assert.assertTrue(BrowserUtils.getElement(Driver.getDriver(),string).isDisplayed());

    }
    @Then("User clicks the {string} button")
    public void user_clicks_the_button(String string) {
        BrowserUtils.sleep(1);
        homePage.addEventButton.click();
    }
    @Then("User sees the Add Event page")
    public void user_sees_the_add_event_page() {
       // wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        BrowserUtils.sleep(1);
        Assert.assertTrue(homePage.popUpForm.isDisplayed());

    }

}
