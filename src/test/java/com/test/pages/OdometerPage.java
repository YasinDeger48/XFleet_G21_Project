package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OdometerPage extends BasePage {


    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy(xpath = "//i[@class='fa-asterisk menu-icon']")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehicleRow;

    @FindBy(xpath = "//input[@value='LastOdometer']")
    public WebElement lastOdometer;

    @FindBy(xpath = "//div[@class='filter-item oro-drop']")
    public WebElement lastOdometerDrop;

    @FindBy(xpath = "//div[@class='btn-group btn-block open']")
    public WebElement groupButton;

    @FindBy(xpath = "//div[@class='filter-start']")
    public WebElement startValue;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//div//a[@title='Filters']")
    public WebElement filterIcon2;


    @FindBy(xpath = "//input[@name='value']")
    public WebElement betweenFirstBox;

    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement betweenSecondBox;

    @FindBy(xpath = "//a[.='between']")
    public WebElement between;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement dropdownOptions;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement update;

    @FindBy(xpath = "//tbody//td[@data-column-label='Last Odometer']")
    public WebElement rowValue;

    @FindBy(xpath = "//td[.='216,175']")
    public WebElement equalRow;

    @FindBy(xpath = "//td[.='468,472']")
    public WebElement rowMoreThan;

    @FindBy(xpath = "//td[.='2,020']")
    public WebElement lessThanValue;


    @FindBy(xpath = "//input[@name='value']")
    public WebElement equalBox;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement moreThanBox;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement lessThanBox;


    @FindBy(xpath = "//a[.='not between']")
    public WebElement notBetween;

    @FindBy(xpath = "//a[.='equals']")
    public WebElement equals;

    @FindBy(xpath = "//a[.='not equals']")
    public WebElement notEquals;

    @FindBy(xpath = "//a[.='more than']")
    public WebElement moreThan;

    @FindBy(xpath = "//a[.='less than']")
    public WebElement lessThan;

    @FindBy(xpath = "//a[.='equals or more than']")
    public WebElement equalsMoreThan;

    @FindBy(xpath = "//a[.='equals or less than']")
    public WebElement equalsLessThan;

    @FindBy(xpath = "//a[.='is empty']")
    public WebElement isEmpty;

    @FindBy(xpath = "//a[.='is not empty']")
    public WebElement isNotEmpty;

    @FindBy(xpath = "(//label[@class='dib'])[3]")
    public WebElement counter;


    public boolean getUrl(){
        Driver.getDriver().getCurrentUrl();
        return false;
    }





















}
