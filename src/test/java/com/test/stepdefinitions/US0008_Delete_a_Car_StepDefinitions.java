package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.US0008_DeleteACarPages;
import com.test.pages.VehiclePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US0008_Delete_a_Car_StepDefinitions {

    HomePage homePage=new HomePage();

    Actions actions=new Actions(Driver.getDriver());

    LoginPage loginPage=new LoginPage();

    JavascriptExecutor jsExe = (JavascriptExecutor) Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    US0008_DeleteACarPages deleteACarPages=new US0008_DeleteACarPages();

    VehiclePage vehiclePage=new VehiclePage();

    @Given("user, is already logged as a {string}")
    public void user_is_already_logged_as_a(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        loginPage.login("salesmanager101","UserUser123");
    }
    @When("user, hover over to Fleet button and clicks to Vehicles")
    public void user_hover_over_to_fleet_button_and_clicks_to_vehicles() {
        homePage.waitUntilLoaderScreenDisappear();
        actions.moveToElement(homePage.fleetButton).perform();
        homePage.vehiclesButton.click();
        BrowserUtils.sleep(3);

    }
    @When("scroll page right")
    public void scroll_page_right() {
        homePage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(vehiclePage.vehicleTableColumnHeaders.isDisplayed());
        jsExe.executeScript("window.scrollBy(2000,0)");
    }
    @When("hover on three dots")
    public void hover_on_three_dots() {
        deleteACarPages.threeDots.isDisplayed();
        actions.moveToElement(deleteACarPages.threeDots).perform();
    }
    @Then("user should see delete button")
    public void user_should_see_delete_button() {
        deleteACarPages.dropdown.isDisplayed();

    }

    @When("user is click delete button")
    public void user_is_click_delete_button() {
        deleteACarPages.dropdown.click();
    }
    @Then("user should be able to delete confirmation pop up")
    public void user_should_be_able_to_delete_confirmation_pop_up() {

    }

}
