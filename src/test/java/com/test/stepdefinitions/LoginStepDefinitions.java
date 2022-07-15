package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;


public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("{string} is on the login page")
    public void is_on_the_login_page(String user) {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

    @When("{string} enters valid credentials")
    public void enters_valid_credentials(String user) {
        loginPage.signIn(user);

    }

    @Then("{string} sees Xfleet Homepage")
    public void sees_xfleet_homepage(String user) {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        String expectedTitle = homePage.getTitle(user);
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);
    }

    @Given("Truck Driver is on the login page")
    public void truck_driver_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

    @When("Truck Driver enters valid credentials")
    public void truck_driver_enters_valid_credentials() {

        loginPage.signIn("Truck Driver");

    }

    @Then("Truck Driver sees Xfleet Homepage")
    public void truck_driver_sees_xfleet_homepage() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        String expectedTitle = homePage.getTitle("Truck Driver");
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);

    }

    @Given("Sales Manager is on the login page")
    public void sales_manager_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

    @When("Sales Manager enters valid credentials")
    public void sales_manager_enters_valid_credentials() {

        loginPage.signIn("Sales Manager");

    }

    @Then("Sales Manager sees Xfleet Homepage")
    public void sales_manager_sees_xfleet_homepage() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        String expectedTitle = homePage.getTitle("Sales Manager");
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);

    }

    @Given("Store Manager is on the login page")
    public void store_manager_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));

    }

    @When("Store Manager enters valid credentials")
    public void store_manager_enters_valid_credentials() {

        loginPage.signIn("Store Manager");

    }

    @Then("Store Manager sees Xfleet Homepage")
    public void store_manager_sees_xfleet_homepage() {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        String expectedTitle = homePage.getTitle("Store Manager");
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);

    }


}



