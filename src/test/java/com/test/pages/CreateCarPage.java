package com.test.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateCarPage extends BasePage {

    Random random = new Random();
    Faker faker = new Faker();

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement createCarTitle;

    @FindBy(xpath = "//input[@name='custom_entity_type[LicensePlate]']")
    public WebElement licensePlate;

    @FindBy(xpath = "//div[@class='oro-clearfix']")
    public List<WebElement> tags;

    @FindBy(xpath = "//input[@name='custom_entity_type[LicensePlate]']")
    public WebElement driverAtCreateCar;

    @FindBy(xpath = "//input[@name='custom_entity_type[Driver]']")
    public WebElement location;

    @FindBy(xpath = "//input[@name='custom_entity_type[Location]']")
    public WebElement chassisNumber;

    @FindBy(xpath = "//input[@name='custom_entity_type[Color]']")
    public WebElement color;

    @FindBy(xpath = "//input[@name='custom_entity_type[ModelYear]']")
    public WebElement modelYear;

    @FindBy(xpath = "//input[@name='custom_entity_type[LastOdometer]']")
    public WebElement lastOdometer;

    @FindBy(xpath = "//input[@name='custom_entity_type[CatalogValue]']")
    public WebElement catalogValue;

    @FindBy(xpath = "//input[@name='custom_entity_type[SeatsNumber]']")
    public WebElement seatsNumber;

    @FindBy(xpath = "//input[@name='custom_entity_type[DoorsNumber]']")
    public WebElement doorsNumber;

    @FindBy(xpath = "//input[@name='custom_entity_type[CO2Emissions]']")
    public WebElement co2;

    @FindBy(xpath = "//input[@name='custom_entity_type[Horsepower]']")
    public WebElement hp;

    @FindBy(xpath = "//input[@name='custom_entity_type[HorsepowerTaxation]']")
    public WebElement hpTax;

    @FindBy(xpath = "//input[@name='custom_entity_type[Power]']")
    public WebElement power;

    @FindBy(xpath = "//div[@class='uploader input-widget-file']")
    public WebElement logo;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement immatriculationDate;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement firstContractDate;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement dateMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement dateYear;

    @FindBy(xpath = "//a[@class='ui-state-default']")
    public List<WebElement> dateDayList;

    @FindBy(xpath = "//select[@name='custom_entity_type[Transmission]']")
    public WebElement transmission;

    @FindBy(xpath = "//select[@name='custom_entity_type[FuelType]']")
    public WebElement fuelType;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement entitySavedMessage;

    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement saveDropdown;

    @FindBy(xpath = "//button[@class='action-button dropdown-item']")
    public WebElement saveAndClose;

    @FindBy(xpath = "(//button[@class='main-group action-button dropdown-item'])[1]")
    public WebElement saveAndNew;

    @FindBy(xpath = "(//button[@class='main-group action-button dropdown-item'])[2]")
    public WebElement save;

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement afterCreatingCarLicenseSubtitle;

    public void selectRandomDate(String entry) {

        switch (entry) {
            case "immatriculationDate":
                this.immatriculationDate.click();
                break;
            case "firstContractDate":
                this.firstContractDate.click();
                break;
        }

        new Select(this.dateMonth).selectByIndex(random.nextInt(12));
        new Select(this.dateYear).selectByVisibleText(faker.number().numberBetween(1942,2024)+"");
        this.dateDayList.get(random.nextInt(29)).click();

    }


}
