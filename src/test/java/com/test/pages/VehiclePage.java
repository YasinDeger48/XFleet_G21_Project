package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclePage extends BasePage{


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

    @FindBy(xpath = "//tr[10]")
    public WebElement tenthRow;

    @FindBy(xpath = "//tr[25]")
    public WebElement twentyfifthRow;

    @FindBy(xpath = "//tr[50]")
    public WebElement fiftiethRow;

    @FindBy(xpath = "//tr[58]")
    public WebElement lastRow;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-LicensePlate sortable renderable shortenable-label string-cell']")
    public WebElement licencePlateColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Driver sortable renderable shortenable-label string-cell']")
    public WebElement driverColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Location sortable renderable shortenable-label string-cell']")
    public WebElement locationColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-ChassisNumber sortable renderable shortenable-label number-cell']")
    public WebElement chasisNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-ModelYear sortable renderable shortenable-label string-cell']")
    public WebElement modelYearColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-LastOdometer sortable renderable shortenable-label number-cell']")
    public WebElement lastOdometerColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-ImmatriculationDate sortable renderable shortenable-label date-cell']")
    public WebElement immatriculationDateColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-FirstContractDate sortable renderable shortenable-label date-cell']")
    public WebElement firstContractDateColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-CatalogValue sortable renderable number-cell']")
    public WebElement cvviColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-SeatsNumber sortable renderable shortenable-label number-cell']")
    public WebElement seatsNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-DoorsNumber sortable renderable shortenable-label number-cell']")
    public WebElement doorNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Color sortable renderable shortenable-label string-cell']")
    public WebElement colorColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Transmission sortable renderable shortenable-label string-cell']")
    public WebElement transmissionNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-FuelType sortable renderable shortenable-label string-cell']")
    public WebElement fuelTypeNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-CO2Emissions sortable renderable shortenable-label number-cell']")
    public WebElement co2EmissionsNumberColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Horsepower sortable renderable shortenable-label number-cell']")
    public WebElement horsepowerColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-HorsepowerTaxation sortable renderable shortenable-label number-cell']")
    public WebElement horsepowerTaxColumnTag;

    @FindBy(xpath = "//th[@class='grid-cell grid-header-cell grid-header-cell-Power sortable renderable shortenable-label number-cell']")
    public WebElement powerColumnTag;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterBtn;

    @FindBy(xpath = "//a[.='Manage filters']")
    public WebElement manageFilterBtn;

    @FindBy(xpath = "//input[@title='Location']")
    public WebElement locationFilterCheckBox;
}
