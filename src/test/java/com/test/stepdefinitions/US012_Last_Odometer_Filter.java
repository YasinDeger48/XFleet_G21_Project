package com.test.stepdefinitions;


import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.OdometerPage;
import com.test.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.crypto.KeyAgreementSpi;


public class US012_Last_Odometer_Filter {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    OdometerPage odometerPage = new OdometerPage();

    // AC-1
    @When("user hover over on Fleet button and clicks to Vehicles")
    public void user_hover_over_on_fleet_button_and_clicks_to_vehicles() {

    homePage.waitUntilLoaderScreenDisappear();

    homePage.fleetButton.click();
    homePage.vehiclesButton.click();

    }

    @When("user click Manage filters button and able to select")
    public void user_click_manage_filters_button_and_able_to_select() {

        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.filterIcon.click();
        odometerPage.manageFilters.click();

    }

    @Then("user should see Last Odometer filter")
    public void userShouldSeeLastOdometerFilter() {

        Assert.assertTrue(odometerPage.lastOdometer.isDisplayed());

    }


    // AC-2

    @And("User select the Last Odometer checkbox")
    public void userSelectTheLastOdometerCheckbox() {

        odometerPage.lastOdometer.click();

    }

    @And("User click on the Last Odometer dropdown")
    public void userClickOnTheLastOdometerDropdown() {

        odometerPage.lastOdometerDrop.click();
    }

    @Then("User click on the dropdown options and see the methods")
    public void user_click_on_the_dropdown_options_and_see_the_methods() {

        odometerPage.dropdownOptions.click();
        Assert.assertTrue(odometerPage.between.isDisplayed());
        Assert.assertTrue(odometerPage.notBetween.isDisplayed());
        Assert.assertTrue(odometerPage.equals.isDisplayed());
        Assert.assertTrue(odometerPage.notEquals.isDisplayed());
        Assert.assertTrue(odometerPage.moreThan.isDisplayed());
        Assert.assertTrue(odometerPage.lessThan.isDisplayed());
        Assert.assertTrue(odometerPage.equalsMoreThan.isDisplayed());
        Assert.assertTrue(odometerPage.equalsLessThan.isDisplayed());
        Assert.assertTrue(odometerPage.isEmpty.isDisplayed());
        Assert.assertTrue(odometerPage.isNotEmpty.isDisplayed());

    }

    // AC-3


    @When("User click on the dropdown and select Between method with numeric values")
    public void userClickOnTheDropdownAndSelectBetweenMethodWithNumericValues() {
        odometerPage.between.click();
        odometerPage.betweenFirstBox.sendKeys("2000");
        odometerPage.betweenSecondBox.sendKeys("2500");

    }

    @And("User click on the Update button")
    public void userClickOnTheUpdateButton() {
        odometerPage.update.click();


    }

    @Then("User see the results should be between the specified values")
    public void user_see_the_results_should_be_between_the_specified_values() {

    odometerPage.betweenValue.isDisplayed();



    }

    // AC-4

    @When("User click on the dropdown and select Equals method with numeric values")
    public void userClickOnTheDropdownAndSelectEqualsMethodWithNumericValues() {

        odometerPage.equals.click();
        odometerPage.equalBox.sendKeys("216175");
        Assert.assertEquals("216175", odometerPage.equalValue );

    }


    @Then("User see  the results should match the specified value exactly")
    public void user_see_the_results_should_match_the_specified_value_exactly() {

        Assert.assertEquals("216175", odometerPage.equalValue );
    }

    // AC-5

    @When("User click on the dropdown and select More than method with numeric values")
    public void userClickOnTheDropdownAndSelectMoreThanMethodWithNumericValues() {

        odometerPage.moreThan.click();
        odometerPage.moreThanBox.sendKeys("460000");
    }

    @Then("User see  the results should be more than the specified value")
    public void user_see_the_results_should_be_more_than_the_specified_value() {

        odometerPage.moreThanFirst.isDisplayed();
        odometerPage.moreThanSecond.isDisplayed();



    }

    // AC-6

    @When("User click on the dropdown and select Less than method with numeric values")
    public void userClickOnTheDropdownAndSelectLessThanMethodWithNumericValues() {

        odometerPage.lessThan.click();
        odometerPage.lessThanBox.sendKeys("5000");


    }

    @Then("User see  the results should be less than the specified value")
    public void userSeeTheResultsShouldBeLessThanTheSpecifiedValue() {

        odometerPage.lessThanValue.isDisplayed();
    }


    // AC-7

    @When("User click on the dropdown and select Is Empty method")
    public void userClickOnTheDropdownAndSelectIsEmptyMethod() {

        odometerPage.isEmpty.click();
    }

    @Then("User see  only empty values should be displayed")
    public void user_see_only_empty_values_should_be_displayed() {




    }


    // AC-8
    @And("user selects as a {string} and enter {string}")
    public void userSelectsAsAAndEnter(String method, String value) {

    }

    @Then("user should see {string} should not accept {string}")
    public void userShouldSeeShouldNotAccept(String method, String value) {
    }


}









