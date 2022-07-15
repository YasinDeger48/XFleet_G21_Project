package com.test.stepdefinitions;

import com.test.pages.BasePage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class US013_Create_Vehicle_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    Random random = new Random();

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

    //AC2

    @Given("Store_Sales Manager is on the login page")
    public void store_sales_manager_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
    }

    @When("Store_Sales Manager enters valid credentials")
    public void store_sales_manager_enters_valid_credentials() {
        String[] userType = {"Sales Manager", "Store Manager"};
        int randomUser = random.nextInt(2);
        loginPage.signIn(userType[randomUser]);
    }

    @Then("Store_Sales Manager sees Xfleet Homepage")
    public void store_sales_manager_sees_xfleet_homepage() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        String[] userType = {"Sales Manager", "Store Manager"};
        int randomUser = random.nextInt(2);

        String expectedTitle = homePage.getTitle(userType[randomUser]);
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("Store_Sales Manager clicks Fleet")
    public void store_sales_manager_clicks_fleet() {
        homePage.fleetButton.click();
    }

    @Then("Store_Sales Manager clicks Vehicles")
    public void store_sales_manager_clicks_vehicles() {
        homePage.vehiclesButton.click();
    }

    @Then("Create Car button should be displayed")
    public void create_car_button_should_be_displayed() {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        Assert.assertTrue(homePage.createCarButton.isDisplayed());
    }


}
