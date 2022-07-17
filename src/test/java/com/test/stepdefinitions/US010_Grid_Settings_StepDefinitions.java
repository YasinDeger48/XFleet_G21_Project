package com.test.stepdefinitions;

import com.test.pages.AllCarsPage;
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

import java.util.ArrayList;
import java.util.List;

public class US010_Grid_Settings_StepDefinitions {

    AllCarsPage allCarsPage = new AllCarsPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jsExe = (JavascriptExecutor) Driver.getDriver();

    @When("User clicks gear icon")
    public void user_clicks_gear_icon() {
        allCarsPage.gearIcon.click();
    }

    @Then("Grid settings should be visible")
    public void gridSettingsShouldBeVisible() {

        String actualTitle = allCarsPage.gridSettingsTitle.getText();
        String expectedTitle = "Grid Settings";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("User should see column names")
    public void user_should_see_column_names(List<String> expectedColumnNames) {

        List<String> actualColumnNames = new ArrayList<>();

        for (WebElement gridSetColName : allCarsPage.gridSetColNames) {
            actualColumnNames.add(gridSetColName.getText());
        }

        Assert.assertEquals(expectedColumnNames, actualColumnNames);
    }


    @And("User search for {string}")
    public void userSearchFor(String searchValue) {
        allCarsPage.gridSearch.sendKeys(searchValue);
    }


    @Then("Search results should contain {string}")
    public void searchResultsShouldContain(String searchValue) {
        for (WebElement shownColumn : allCarsPage.shownColumns) {
            Assert.assertTrue(shownColumn.getText().toLowerCase().contains(searchValue));
        }
    }

    @Then("User clicks on {string} and Selection state should change after clicking")
    public void userClicksOnAndSelectionStateShouldChangeAfterClicking(String columnName) {
        for (WebElement eachName : allCarsPage.columnNames) {
            if (eachName.getText().equals(columnName)) {
                WebElement tableRows = allCarsPage.correspondingTableRowOnTable(columnName);
                if (tableRows.getAttribute("class").equals("renderable")) {
                    eachName.click();
                    Assert.assertTrue(tableRows.getAttribute("class").equals(""));
                } else if (tableRows.getAttribute("class").equals("")) {
                    eachName.click();
                    Assert.assertTrue(tableRows.getAttribute("class").equals("renderable"));
                }
            }

        }
    }

    int initialIndexOfMovingElement;

    @And("User clicks and holds the arrow on {string} row and drags and drops on {string} row")
    public void userMovesRowAboveRow(String columnName, String newColumnName) {

        initialIndexOfMovingElement = allCarsPage.orderOfTheElement(columnName);

        WebElement correspondingArrow = allCarsPage.correspondingArrowOnTable(columnName);
        WebElement newLocation = allCarsPage.correspondingArrowOnTable(newColumnName);

        actions.moveToElement(correspondingArrow).clickAndHold().perform();
        BrowserUtils.sleep(1);
        actions.moveToElement(newLocation).release(correspondingArrow).perform();

    }


    @Then("Column order of {string} should change")
    public void columnOrderOfShouldChange(String columnName) {

        BrowserUtils.sleep(2);

        int lastIndexOfMovingElement = allCarsPage.orderOfTheElement(columnName);

        Assert.assertNotEquals(initialIndexOfMovingElement, lastIndexOfMovingElement);
    }
}
