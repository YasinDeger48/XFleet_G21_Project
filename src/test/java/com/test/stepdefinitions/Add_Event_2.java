package com.test.stepdefinitions;

import com.test.pages.Add_Event_2_Pages;
import com.test.pages.HomePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Add_Event_2 {
    int randomNumberForColor;
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
        add_Event_2_Pages.waitUntilLoaderScreenDisappear();
        int randomNumber = random.nextInt(add_Event_2_Pages.carsTable.size());
        System.out.println("randomNumber = " + randomNumber);
        add_Event_2_Pages.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(5);
        add_Event_2_Pages.carsTable.get(randomNumber).click();

    }

    @Then("User should be able to see the Add Event buton")
    public void user_should_be_able_to_see_the_add_event_buton() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(add_Event_2_Pages.addEventButton.isDisplayed());
    }


    @Then("User clicks Add Event buttun")
    public void user_clicks_add_event_buttun() {
        BrowserUtils.sleep(5);
        add_Event_2_Pages.addEventButton.click();
    }

    @When("User should be able to access the Add Event page")
    public void user_should_be_able_to_access_the_add_event_page() {

    }

    @When("User marks the event with any colour")
    public void user_marks_the_event_with_any_colour() {

        randomNumberForColor = random.nextInt(add_Event_2_Pages.colortable.size()) + 1;
        System.out.println("randomNumberForColor = " + randomNumberForColor);
        add_Event_2_Pages.colortable.get(randomNumberForColor).click();
    }

    @Then("User should be able to see that colorButton is select")
    public void userShouldBeAbleToSeeThatColorButtonIsSelect() {
        System.out.println("add_Event_2_Pages.checkedColor.isDisplayed() = " + add_Event_2_Pages.checkedColor.isDisplayed());
        Assert.assertTrue(add_Event_2_Pages.checkedColor.isDisplayed());
    }


    @When("User clicks All-day event")
    public void user_clicks_all_day_event() {

        BrowserUtils.sleep(5);
        add_Event_2_Pages.allDayEventButton.click();
        BrowserUtils.sleep(3);

    }

    @Then("User should be able to see that time boxes is disappeared")
    public void user_should_be_able_to_see_that_time_boxes_is_disappeared() {
        BrowserUtils.sleep(3);
        Assert.assertFalse(add_Event_2_Pages.start_and_endTime.isDisplayed());
    }

    @When("User clicks Repeat checkbox")
    public void user_clicks_repeat_checkbox() {
        BrowserUtils.sleep(3);
        add_Event_2_Pages.repeatButtun.click();
    }

    @When("User should be able to chose belowe \\(repeats dropdown menu) Daily, Weekly, Monthly, Yearly")
    public void user_should_be_able_to_chose_belowe_repeats_dropdown_menu_daily_weekly_monthly_yearly() {
        BrowserUtils.sleep(3);


            Select select = new Select(Driver.getDriver().findElement(By.xpath("(//select)[2]")));
            select.selectByVisibleText("Weekly");



    }

    @When("User should be able to click Ending options Never After By")
    public void user_should_be_able_to_click_ending_options_never_after_by() {
        BrowserUtils.sleep(3);
        WebElement element = Driver.getDriver().findElement(By.xpath("(//input[@type='radio'])[3]"));
        element.click();
    }

    String expectedTitle;

    @And("User enters a title {string}")
    public void userEntersATitle(String title) {
        expectedTitle=title;
        BrowserUtils.sleep(3);
        add_Event_2_Pages.titleTextBox.sendKeys(title);
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(3);
        add_Event_2_Pages.saveButton.click();
        BrowserUtils.sleep(3);
    }


    @When("User should be able to see  all events on the General information page")

    public void user_should_be_able_to_see_all_events_on_the_general_information_page() {
        System.out.println("expectedTitle = " + expectedTitle);
      //  Assert.assertTrue(add_Event_2_Pages.verifyGeneralInformation.getText().equals(expectedTitle));
        BrowserUtils.sleep(3);
        String actual = add_Event_2_Pages.verifyGeneralInformation.getText();
        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.contains(expectedTitle));
    }
}
