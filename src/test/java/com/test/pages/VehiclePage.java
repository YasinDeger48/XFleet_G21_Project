package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclePage {


    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement dropdownViewPerPage;

    @FindBy(xpath = "//a[@data-size='10']")
    public WebElement dropdown10;

    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement dropdown25;

    @FindBy(xpath = "//a[@data-size='50']")
    public WebElement dropdown50;

    @FindBy(xpath = "//a[@data-size='100']")
    public WebElement dropdown100;

    @FindBy(xpath = "(//span[.='License Plate'])[1]")
    public WebElement licencePlateColumnTag;


    @FindBy(xpath = "(//span[.='Driver'])[1]")
    public WebElement driverColumnTag;

    @FindBy(xpath = "(//span[.='Location'])[1]")
    public WebElement locationColumnTag;

    @FindBy(xpath = "(//span[.='Chassis Number'])[1]")
    public WebElement chasisNumberColumnTag;

    @FindBy(xpath = "(//span[.='Model Year'])[1]")
    public WebElement modelYearColumnTag;

    @FindBy(xpath = "(//span[.='Last Odometer'])[1]")
    public WebElement lastOdometerColumnTag;

    @FindBy(xpath = "(//span[.='Immatriculation Date'])[1]")
    public WebElement immatriculationDateColumnTag;

    @FindBy(xpath = "(//span[.='First Contract Date'])[1]")
    public WebElement firstContractDateColumnTag;

    @FindBy(xpath = "(//span[.='CVVI'])[1]")
    public WebElement cvviColumnTag;

    @FindBy(xpath = "(//span[.='Seats Number'])[1]")
    public WebElement seatsNumberColumnTag;

    @FindBy(xpath = "(//span[.='Doors Number'])[1]")
    public WebElement doorNumberColumnTag;

    @FindBy(xpath = "(//span[.='Color'])[1]\n")
    public WebElement colorColumnTag;

    @FindBy(xpath = "(//span[.='Transmission'])[1]")
    public WebElement transmissionNumberColumnTag;

    @FindBy(xpath = "(//span[.='Fuel Type'])[1]")
    public WebElement fuelTypeNumberColumnTag;

    @FindBy(xpath = "(//span[.='CO2 Emissions'])[1]")
    public WebElement co2EmissionsNumberColumnTag;

    @FindBy(xpath = "(//span[.='Horsepower'])[1]")
    public WebElement horsepowerColumnTag;

    @FindBy(xpath = "(//span[.='Horsepower Taxation'])[1]")
    public WebElement horsepowerTaxColumnTag;

    @FindBy(xpath = " (//span[.='Power (kW)'])[1]")
    public WebElement powerColumnTag;

}
