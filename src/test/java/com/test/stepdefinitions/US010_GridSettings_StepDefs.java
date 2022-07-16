package com.test.stepdefinitions;

import com.test.pages.AllCarsPage;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US010_GridSettings_StepDefs {

    AllCarsPage allCarsPage = new AllCarsPage();

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
                WebElement tableRows = Driver.getDriver().findElement(By.xpath("//tr/td/label[.='" + columnName + "']/../.."));
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
}
