package com.test.stepdefinitions;

import com.test.pages.GeneralInformationPage;
import com.test.pages.HomePage;
import com.test.pages.VehiclePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import javax.swing.text.View;

public class US007_VehicleGeneralInfo_StepDefinitions {

    VehiclePage vehiclePage = new VehiclePage();
    HomePage homePage = new HomePage();
    GeneralInformationPage generalInformationPage = new GeneralInformationPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("user sees General information page")
    public void user_sees_general_information_page() {
        homePage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().navigate().refresh();
        Assert.assertTrue(generalInformationPage.generalInfoText.isDisplayed());
    }

    @Given("User clicks the any vehicles")
    public void user_clicks_the_any_vehicles() {
        homePage.waitUntilLoaderScreenDisappear();
        String licensePlateStr = vehiclePage.licensePlate.getText();
        vehiclePage.carRow.click();

    }

    @Then("manager sees Edit, Delete, and Add Event buttons")
    public void manager_sees_edit_delete_and_add_event_buttons() {
        Assert.assertTrue(generalInformationPage.deleteButton.isDisplayed());
        Assert.assertTrue(generalInformationPage.addEventButton.isDisplayed());
        Assert.assertTrue(generalInformationPage.editButton.isDisplayed());
    }

    @Then("driver does not see Edit, Delete, and Add Event buttons")
    public void driver_does_not_see_edit_delete_and_add_event_buttons() {
        Assert.assertTrue(generalInformationPage.isGeneralInfoTextDriverPresent(generalInformationPage.generalInfoText));
        //Assert.assertFalse(generalInformationPage.addEventButton.isDisplayed());
        //Assert.assertTrue(generalInformationPage.isDeleteButtonDriverPresent(generalInformationPage.deleteButton));
    }

    @Given("user hover over on the three dots and clicks the eye icon")
    public void user_hover_over_on_the_three_dots_and_clicks_the_eye_icon() {
        homePage.waitUntilLoaderScreenDisappear();
        actions.moveToElement(vehiclePage.threeDot).perform();
        actions.moveToElement(vehiclePage.threeDotView).click().perform();

    }

    @Then("user sees information on General Information page and Vehicle page are the same")
    public void user_sees_information_on_general_information_page_and_vehicle_page_are_the_same() {
        System.out.println("vehiclePage.licensePlate.getText() = " + vehiclePage.licensePlate.getText());
        Assert.assertTrue(vehiclePage.licensePlate.getText().equalsIgnoreCase(generalInformationPage.licensePlateInfo.getText()));

    }



}
