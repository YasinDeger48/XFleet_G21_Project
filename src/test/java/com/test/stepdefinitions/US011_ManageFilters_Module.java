package com.test.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.US11ManagePage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US011_ManageFilters_Module {

    US11ManagePage us11ManagePage = new US11ManagePage();
   // WebDriverWait wait;
     HomePage homePage= new HomePage();
    List<WebElement> ActualNames;

    @And("User clicks the Vehicles button module")
    public void userClicksTheVehiclesButtonModule() {
        BrowserUtils.hover_Over_And_Click(us11ManagePage.Vehiclemodule);
    }

    @Then("user should see Fleet-Vehicle module")
    public void userShouldSeeFleetVehicleModule() {
        Assert.assertTrue(us11ManagePage.VehicleCarTitle.isDisplayed());
    }


    @When("user clicks filterButton")
    public void user_clicks_filter_button() {
        //wait = new WebDriverWait(Driver.getDriver(), 60);
     //  wait.until(ExpectedConditions.visibilityOf(us11ManagePage.VehicleCarTitle));
        homePage.waitUntilLoaderScreenDisappear();
        ActualNames = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[3]"));
        BrowserUtils.sleep(25);
        us11ManagePage.filterButton.click();
    }


    @When("user clicks manageFiltersbutton")
    public void user_clicks_manage_filtersbutton() {
       us11ManagePage.manageFiltersbutton.click();
    }
    @When("user clicks Drivercheckbutton")
    public void user_clicks_drivercheckbutton() {
        BrowserUtils.sleep(5);
        us11ManagePage.Drivercheckbutton.click();
    }
    @When("user clicks Driverbutton")
    public void user_clicks_driverbutton() {
        BrowserUtils.sleep(3);
        us11ManagePage.Driverbutton.click();



    }
    @When("user clicks ContainsTogglebutton")
    public void user_clicks_contains_togglebutton() {
        us11ManagePage.ContainsTogglebutton.click();
        BrowserUtils.sleep(3);
    }

   // @Then("user sees ContainsList")
   // public void userSeesContainsList() {
        
   // }

    String expected;
    @And("user enters a keyword {string} to the inputbox")
    public void userEntersAKeywordToTheInputbox(String text) {
           expected=text;
            us11ManagePage.inbox.sendKeys(text);
            BrowserUtils.sleep(2);
            us11ManagePage.update.click();
            BrowserUtils.sleep(2);
    }

    @Then("the result should contain the keyword")
    public void theResultShouldContainTheKeyword() {
       BrowserUtils.sleep(5);
        Assert.assertEquals(expected,us11ManagePage.nameLocation.getText());
    }

    @And("user clicks DoesNotContain button")
    public void userClicksDoesNotContainButton() {


     //   BrowserUtils.sleep(3);
      //  Select select= new Select(Driver.getDriver().findElement(By.xpath("//a[.='does not contain']")));
        //select.selectByVisibleText("does not contain");
        us11ManagePage.doesNotContainButton.click();
        BrowserUtils.sleep(2);
       // us11ManagePage.inbox.sendKeys("Mrs. Conrad Fritsch");
        //us11ManagePage.update.click();
    }

    @Then("the result should not contain the keyword")
    public void theResultShouldNotContainTheKeyword() {
       // Assert.assertFalse(us11ManagePage.nameLocation.isDisplayed());
           // Assert.assertNotEquals(expected,us11ManagePage.nameLocation.getText());
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//td[.='Mrs. Conrad Fritsch']"));
       System.out.println("--sizesizesize---"+ elements.size());


      //  homePage.waitUntilLoaderScreenDisappear();
      //  List<WebElement> doesnotcontainList = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[3]"));
       // for (WebElement element : doesnotcontainList) {
         //   System.out.println(element.getText());

       // }
       Assert.assertEquals(0,elements.size());

    }


    @Then("user sees ContainsList")
    public void userSeesContainsList() {

        /*  Select s = new Select(Driver.getDriver().findElement(By.xpath("(//ul[@class='dropdown-menu'])[3]//li")));
         getting the list of options in the dropdown with getOptions()
        List <WebElement> op = s.getOptions();
       int size = op.size();
       for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
            System.out.println(options);
        }  */
        List<String> moduleActuallist= new ArrayList<>();
        for(int i =1; i<10 ; i++){
            WebElement element = Driver.getDriver().findElement(By.xpath("((//ul[@class='dropdown-menu'])[3]//li)["+i+"]"));
           // System.out.println(element.getText());
            moduleActuallist.add(element.getText());
        }

        System.out.println(moduleActuallist);

        List<String> modulelist= new ArrayList<>();
        modulelist.addAll(Arrays.asList("Contains", "Does Not Contain", "Is Equal To", "Starts With","Ends With","Is Any Of", "Is Not Any Of", "Is Empty","Is Not Empty"));

        Assert.assertEquals(modulelist, moduleActuallist);

        }

    @And("user clicks Startswith button")
    public void userClicksStartswithButton() {
        us11ManagePage.startsWith.click();
    }

    @And("user enters a keyword with {string} to the inputbox")
    public void userEntersAKeywordWithToTheInputbox(String textstarts) {
        expected=textstarts;
        us11ManagePage.inbox.sendKeys(textstarts);
        BrowserUtils.sleep(2);
        us11ManagePage.update.click();

    }

    @Then("the result should start with the keyword")
    public void theResultShouldStartWithTheKeyword() {


    }

    @And("user clicks Endswith button")
    public void userClicksEndswithButton() {
        us11ManagePage.endsWith.click();
    }

    @And("user enters a keyword ending {string} to the inputbox")
    public void userEntersAKeywordEndingToTheInputbox(String textends) {
        expected=textends;
        us11ManagePage.inbox.sendKeys(textends);
        BrowserUtils.sleep(2);
        us11ManagePage.update.click();

    }

    @Then("the result should end with the keyword")
    public void theResultShouldEndWithTheKeyword() {

    }

    @And("user clicks IsEqualTo button")
    public void userClicksIsEqualToButton() {
        us11ManagePage.IsEqualTo.click();
    }

    @Then("the result should match the keyword exactly")
    public void theResultShouldMatchTheKeywordExactly() {

    }
}

