package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US11ManagePage {

    public US11ManagePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath="(//span[@class='title title-level-2'])[1]")
    public WebElement Vehiclemodule;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement VehicleCarTitle;

    //@FindBy(css = "i[class='fa-filter hide-text']")
   // public WebElement filterButton;
    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
   public WebElement filterButton;
    //  @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-499118502\"]/div[2]/div[1]/div/div[3]/div[1]/div/a[1]/i")
      //public WebElement filterButton;
   // @FindBy(xpath = "(//a[@title='Reset'])[1]")
    //public WebElement filterButton;
    //@FindBy(xpath = "(//i[@class='fa-repeat'])[1]")
   // public WebElement filterButton;



    @FindBy(xpath="//a[@class='add-filter-button']")
    public  WebElement manageFiltersbutton;

    //@FindBy(xpath="(//label[@class='ui-corner-all'])[2]")
    //public  WebElement Drivercheckbutton;
    @FindBy(xpath="//input[@value='Driver']")
    public  WebElement Drivercheckbutton;

    @FindBy(xpath="//div[@class='filter-item oro-drop']")
    public  WebElement Driverbutton;

    @FindBy(xpath="//button[@class='btn dropdown-toggle']")
    public  WebElement ContainsTogglebutton;

    @FindBy(xpath="(//a[@class=\"dropdown-item choice-value\"])[2]")
    public  WebElement doesNotContainButton;

    @FindBy(xpath="//a[@class='dropdown-item choice-value']")
    public List<WebElement> containslist;

    @FindBy(xpath="(//input[@type='text'])[2]")
    public WebElement inbox;

    @FindBy(xpath="//button[.='Update']")
    public WebElement update;

    @FindBy(xpath="//td[.='Mrs. Conrad Fritsch']")
    public WebElement nameLocation;

    @FindBy(xpath="(//a[@class=\"dropdown-item choice-value\"])[4]")
    public WebElement startsWith;

    @FindBy(xpath="(//a[@class=\"dropdown-item choice-value\"])[5]")
    public WebElement endsWith;

    @FindBy(xpath="(//a[@class=\"dropdown-item choice-value\"])[3]")
    public WebElement IsEqualTo;





}
