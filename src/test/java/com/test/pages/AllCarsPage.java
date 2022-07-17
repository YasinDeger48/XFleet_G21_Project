package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AllCarsPage extends BasePage{

    /*************** ALL CARS PAGE LOCATORS    ****************/

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gearIcon;

    @FindBy(xpath = "//div[@class='column-manager-title']")
    public WebElement gridSettingsTitle;

    @FindBy(xpath = "//tbody/tr/td[1]/label")
    public List<WebElement> gridSetColNames;

    @FindBy(xpath = "//input[@data-role='column-manager-search']")
    public WebElement gridSearch;

    @FindBy(xpath = "//tr/td/label")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//span[@class='column-filter-match']")
    public List<WebElement> shownColumns;

    /*************** ALL CARS PAGE METHODS    ****************/

    public WebElement correspondingArrowOnTable(String columnName) {
        return Driver.getDriver().findElement(By.xpath("//tr/td/label[.='" + columnName + "']/../following-sibling::td[1]/*/*"));
    }

    public WebElement correspondingTableRowOnTable(String columnName) {
        return Driver.getDriver().findElement(By.xpath("//tr/td/label[.='" + columnName + "']/../.."));
    }

    public int orderOfTheElement (String columnName) {
        List<String> elementsInSettings = new ArrayList<>();

        for (WebElement name : columnNames) {
            elementsInSettings.add(name.getText());
        }

        return elementsInSettings.indexOf(columnName);


    }
}
