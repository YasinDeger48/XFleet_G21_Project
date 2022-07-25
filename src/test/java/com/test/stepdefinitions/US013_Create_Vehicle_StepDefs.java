package com.test.stepdefinitions;

import com.github.javafaker.Faker;
import com.test.pages.BasePage;
import com.test.pages.CreateCarPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US013_Create_Vehicle_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CreateCarPage createCarPage = new CreateCarPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    Random random = new Random();
    Faker faker = new Faker();


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
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
    }

    @Then("Store_Sales Manager sees Xfleet Homepage")
    public void store_sales_manager_sees_xfleet_homepage() {


        String[] userType = {"Sales Manager", "Store Manager"};
        int randomUser = random.nextInt(2);

        String expectedTitle = homePage.getTitle(userType[randomUser]);
        String actualTitle = homePage.homePageTitle.getText();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("Store_Sales Manager clicks Fleet")
    public void store_sales_manager_clicks_fleet() {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        homePage.fleetButton.click();
    }

    @Then("Store_Sales Manager clicks Vehicles")
    public void store_sales_manager_clicks_vehicles() {
        homePage.vehiclesButton.click();
    }

    @Then("Create Car button should be displayed")
    public void create_car_button_should_be_displayed() {
        wait.until(ExpectedConditions.visibilityOf(homePage.createCarButton));
        Assert.assertTrue(homePage.createCarButton.isDisplayed());
    }

    //AC3

    @And("Store_Sales Manager clicks Create Car")
    public void store_salesManagerClicksCreateCar() {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        homePage.createCarButton.click();
    }

    @Then("Store_Sales Manager is on Create Car Page")
    public void store_salesManagerIsOnCreateCarPage() {
        Assert.assertTrue(createCarPage.createCarTitle.isDisplayed());
    }

    //AC4

    @Then("User should see below info in tags checkBoxes")
    public void userShouldSeeBelowInfoInTagsCheckBoxes(List<String> expectedTags) {
        List<String> actualTags = new ArrayList<>();
        for (WebElement each : createCarPage.tags) {
            actualTags.add(each.getText().trim());
        }
        Assert.assertEquals(expectedTags, actualTags);
    }

    @Then("User should see {string} in {string}")
    public void userShouldSeeIn(String entries, String determinedStructure) {

        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));

        switch (determinedStructure) {
            case "alpha-numerical":
                if ((entries.equals("licensePlate"))) {
                    createCarPage.licensePlate.sendKeys(faker.bothify("?#?#?#?#?#"));
                } else if (entries.equals("chassisNumber")) {
                    createCarPage.chassisNumber.sendKeys(faker.bothify("?#?#?#?#?#??##"));
                }
                break;
            case "alphabetical":
                switch (entries) {
                    case "driver":
                        createCarPage.driverAtCreateCar.sendKeys(faker.name().fullName());
                        break;
                    case "location":
                        createCarPage.location.sendKeys(faker.address().country());
                        break;
                    case "colour":
                        createCarPage.color.sendKeys(faker.color().name());
                        break;
                }
                break;
            case "numerical":
                switch (entries) {
                    case "modelYear":
                        createCarPage.modelYear.sendKeys(faker.number().numberBetween(1900, 2022) + "");
                        break;
                    case "lastOdometer":
                        createCarPage.lastOdometer.sendKeys(faker.number().numberBetween(0, 999999999) + "");
                        break;
                    case "catalogValue":
                        createCarPage.catalogValue.sendKeys(faker.number().randomDouble(2, 1000, 9999999) + "");
                        break;
                    case "seatNumber":
                        createCarPage.seatsNumber.sendKeys(faker.numerify("?"));
                        break;
                    case "doorsNumber":
                        createCarPage.doorsNumber.sendKeys(faker.number().numberBetween(2, 5) + "");
                        break;
                    case "co2Emission":
                        createCarPage.co2.sendKeys(faker.number().numberBetween(1, 100) + "");
                        break;
                    case "horsepower":
                        createCarPage.hp.sendKeys(faker.number().numberBetween(50, 500) + "");
                        break;
                    case "horsepowerTaxation":
                        createCarPage.hpTax.sendKeys(faker.number().randomDouble(1, 2, 32) + "");
                        break;
                    case "power":
                        createCarPage.power.sendKeys(faker.number().numberBetween(75, 820) + "");
                        break;
                }
                break;
            case "date":
                switch (entries) {
                    case "immatriculationDate":
                        createCarPage.selectRandomDate("immatriculationDate");
                        break;
                    case "firstContractDate":
                        createCarPage.selectRandomDate("firstContractDate");
                        break;
                }
                break;
        }

    }

    @Then("User should see below info in transmission dropdown")
    public void userShouldSeeBelowInfoInTransmissionDropdown(List<String> expectedTransmission) {
        List<String> actualTransmission = new ArrayList<>();
        Select select = new Select(createCarPage.transmission);
        for (WebElement each : select.getOptions()) {
            actualTransmission.add(each.getText());
        }
        Assert.assertTrue(actualTransmission.containsAll(expectedTransmission));
    }

    @Then("User should see below info in fuelType dropdown")
    public void userShouldSeeBelowInfoInFuelTypeDropdown(List<String> expectedFuelType) {
        List<String> actualFuelType = new ArrayList<>();
        Select select = new Select(createCarPage.fuelType);
        for (WebElement each : select.getOptions()) {
            actualFuelType.add(each.getText());
        }
        Assert.assertTrue(actualFuelType.containsAll(expectedFuelType));
    }

    @Then("Image is uploaded in JPEG or PNG format")
    public void imageIsUploadedInJPEGOrPNGFormat() throws AWTException {
        String file = "D:\\MASAÜSTÜ\\ARABALAR\\3008\\2.JPG";
        StringSelection stringSelection = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    //AC5

    @Then("User should see Save, Save And New, Save And Close below saving options")
    public void user_should_see_below_saving_options() {
        wait.until(ExpectedConditions.attributeToBe(homePage.loaderMasky, "class", "loader-mask"));
        createCarPage.saveDropdown.click();
        Assert.assertEquals("Save And Close", createCarPage.saveAndClose.getText());
        Assert.assertEquals("Save And New", createCarPage.saveAndNew.getText());
        Assert.assertEquals("Save", createCarPage.save.getText());

    }

    //AC5  //AC6

    @Then("User should see below {string} and related actions then success message")
    public void user_should_see_below_and_then_success_message(String savingOptions) {

        String license;
        switch (savingOptions) {
            case "save":
                createCarPage.save.click();

                license = faker.bothify("?#?#?#?#?#");
                createCarPage.licensePlate.sendKeys(license);

                wait.until(ExpectedConditions.visibilityOf(createCarPage.entitySavedMessage));
                Assert.assertEquals("Entity saved", createCarPage.entitySavedMessage.getText());
                Assert.assertFalse(Driver.getDriver().getTitle().startsWith("Create Car"));
                break;

            case "saveAndNew":
                createCarPage.saveAndNew.click();

                createCarPage.licensePlate.sendKeys(faker.bothify("?#?#?#?#?#"));

                wait.until(ExpectedConditions.visibilityOf(createCarPage.entitySavedMessage));
                Assert.assertEquals("Entity saved", createCarPage.entitySavedMessage.getText());
                Assert.assertTrue(Driver.getDriver().getTitle().startsWith("Create Car"));

                break;

            case "saveAndClose":
                createCarPage.saveAndClose.click();

                license = faker.bothify("?#?#?#?#?#");
                createCarPage.licensePlate.sendKeys(license);

                wait.until(ExpectedConditions.visibilityOf(createCarPage.entitySavedMessage));
                Assert.assertEquals("Entity saved", createCarPage.entitySavedMessage.getText());
                Assert.assertFalse(Driver.getDriver().getTitle().startsWith("Create Car"));
                break;
        }

    }
}
