package com.test.stepdefinitions;


import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.OdometerPage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class US012_Last_Odometer_Filter {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    OdometerPage odometerPage = new OdometerPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 25);

    String firstValue = "2000";
    String secondValue = "2500";
    String equalValue = "216175";
    String moreThanValue = "465000";
    String lessThanValue = "5000";

    // AC-1
    @When("user hover over on Fleet button and clicks to Vehicles")
    public void user_hover_over_on_fleet_button_and_clicks_to_vehicles() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));


        homePage.fleetButton.click();
        homePage.vehiclesButton.click();

    }

    @When("user click Manage filters button and able to select")
    public void user_click_manage_filters_button_and_able_to_select() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        wait.until(ExpectedConditions.elementToBeClickable(odometerPage.filterIcon2));
        odometerPage.filterIcon2.click();
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
        odometerPage.dropdownOptions.click();
        odometerPage.between.click();
        odometerPage.betweenFirstBox.sendKeys(firstValue);
        odometerPage.betweenSecondBox.sendKeys(secondValue);

    }

    @And("User click on the Update button")
    public void userClickOnTheUpdateButton() {
        odometerPage.update.click();


    }

    @Then("User see the results should be between the specified values")
    public void user_see_the_results_should_be_between_the_specified_values() {

        homePage.waitUntilLoaderScreenDisappear();
        wait.until(ExpectedConditions.visibilityOf(odometerPage.rowValue));
        String actualValue = odometerPage.rowValue.getText();
        int fValue = Integer.parseInt(firstValue);
        int sValue = Integer.parseInt(secondValue);
        String[] split = actualValue.split(",");
        int aValues = Integer.parseInt((split[0]+split[1]));

        BrowserUtils.sleep(2);
        Assert.assertTrue(aValues>fValue && aValues<sValue);



    }

    // AC-4

    @When("User click on the dropdown and select Equals method with numeric values")
    public void userClickOnTheDropdownAndSelectEqualsMethodWithNumericValues() {

        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.dropdownOptions.click();
        odometerPage.equals.click();
        odometerPage.equalBox.sendKeys(equalValue);
        odometerPage.update.click();
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));


    }


    @Then("User see  the results should match the specified value exactly")
    public void user_see_the_results_should_match_the_specified_value_exactly() {

        //wait.until(ExpectedConditions.visibilityOf(odometerPage.betweenValue));
        int eValue = Integer.parseInt(equalValue);
        String actualValue = odometerPage.equalRow.getText();
        String[] split = actualValue.split(",");
        int acValue = Integer.parseInt((split[0]+split[1]));

        Assert.assertEquals(eValue, acValue );


    }

    // AC-5

    @When("User click on the dropdown and select More than method with numeric values")
    public void userClickOnTheDropdownAndSelectMoreThanMethodWithNumericValues() {

        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.dropdownOptions.click();
        odometerPage.moreThan.click();
        odometerPage.moreThanBox.sendKeys(moreThanValue);
    }

    @Then("User see  the results should be more than the specified value")
    public void user_see_the_results_should_be_more_than_the_specified_value() {

        int moreValue = Integer.parseInt(moreThanValue);
        String actualValue = odometerPage.rowMoreThan.getText();
        String[] split = actualValue.split(",");
        int acValue = Integer.parseInt((split[0]+split[1]));
        System.out.println(acValue);

        Assert.assertTrue(moreValue<acValue);


    }

    // AC-6

    @When("User click on the dropdown and select Less than method with numeric values")
    public void userClickOnTheDropdownAndSelectLessThanMethodWithNumericValues() {

        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.dropdownOptions.click();
        odometerPage.lessThan.click();
        odometerPage.lessThanBox.sendKeys(lessThanValue);


    }

    @Then("User see  the results should be less than the specified value")
    public void userSeeTheResultsShouldBeLessThanTheSpecifiedValue() {

        int lessValue = Integer.parseInt(lessThanValue);
        String actualValue = odometerPage.lessThanValue.getText();
        String[] split = actualValue.split(",");
        int acValue = Integer.parseInt((split[0]+split[1]));
        System.out.println(acValue);

        Assert.assertTrue(lessValue>acValue);


    }


    // AC-7

    @When("User click on the dropdown and select Is Empty method")
    public void userClickOnTheDropdownAndSelectIsEmptyMethod() {

        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.dropdownOptions.click();
        odometerPage.isEmpty.click();
    }

    @Then("User see  only empty values should be displayed")
    public void user_see_only_empty_values_should_be_displayed() {

      wait.until(ExpectedConditions.visibilityOf(odometerPage.rowValue));
      odometerPage.rowValue.getText().isEmpty();

    }


    // AC-8


    @When("User click on the dropdown and select Between method with non-numeric values")
    public void userClickOnTheDropdownAndSelectBetweenMethodWithNonNumericValues() {
        homePage.waitUntilLoaderScreenDisappear();
        odometerPage.dropdownOptions.click();
        odometerPage.between.click();
        odometerPage.betweenFirstBox.sendKeys("odo");
        odometerPage.betweenSecondBox.sendKeys("meter");


    }

    @And("User see method should not accept non-numeric values")
    public void userSeeMethodShouldNotAcceptNonNumericValues() {


        System.out.println(odometerPage.counter.getText());
    Assert.assertTrue(odometerPage.counter.getText().contains("93"));

    }

    @When("User click on the dropdown and select Equals method with non-numeric value")
    public void userClickOnTheDropdownAndSelectEqualsMethodWithNonNumericValue() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Driver.getDriver().navigate().refresh();
        homePage.waitUntilLoaderScreenDisappear();
        //Thread.sleep(7000);
        //odometerPage.lastOdometerDrop.click();
        //Thread.sleep(5000);
        odometerPage.dropdownOptions.click();
        odometerPage.equals.click();
        odometerPage.equalBox.sendKeys("2,000");

    }


    @When("User click on the dropdown and select More than method with non-numeric value")
    public void userClickOnTheDropdownAndSelectMoreThanMethodWithNonNumericValue() throws InterruptedException {
        //Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        homePage.waitUntilLoaderScreenDisappear();
        //Thread.sleep(7000);
        //odometerPage.lastOdometerDrop.click();
        //Thread.sleep(5000);
        odometerPage.dropdownOptions.click();
        odometerPage.moreThan.click();
        odometerPage.moreThanBox.sendKeys("50000+");
    }

    @When("User click on the dropdown and select Less than method with non-numeric value")
    public void userClickOnTheDropdownAndSelectLessThanMethodWithNonNumericValue() throws InterruptedException {

       // Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        homePage.waitUntilLoaderScreenDisappear();
        //Thread.sleep(5000);
        //odometerPage.lastOdometerDrop.click();
        //Thread.sleep(5000);
        odometerPage.dropdownOptions.click();
        odometerPage.lessThan.click();
        odometerPage.lessThanBox.sendKeys("2000from");
    }


}









