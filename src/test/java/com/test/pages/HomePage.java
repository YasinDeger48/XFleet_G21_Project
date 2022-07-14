package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homePageTitle;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement vehiclesButton;

    @FindBy(css = "[title='Add an event to this record']")
    public WebElement addEventButton;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tableRows;

    @FindBy(xpath = "//div[contains(@style,'position: absolute; width: 1000px;')]")
    public WebElement popUpForm;

    @FindBy(xpath = "//body/div[5]")
    public WebElement firstPopUpForm;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement popUpCloseButton;

    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCarButton;















    //methods


    public String getTitle(String userType){
        String response ="";


        switch (userType) {
            case "Truck Driver":
                response = "Quick Launchpad";
                break;
            case "Sales Manager":
            case "Store Manager":
                response = "Dashboard";
                break;

        }
        return response;
}
}