package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    /*************** HOME PAGE LOCATORS    ****************/


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


    /*************** ADD EVENT COMPULSORY TITLES   ****************/


    @FindBy(xpath = "(//div[@class='span6']//label)[1]")
    public WebElement titlePopUP;

    @FindBy(xpath = "(//div[@class='span6']//label)[8]")
    public WebElement ownerPopUP;

    @FindBy(xpath = "(//div[@class='span6']//label)[9]")
    public WebElement organizerDisplayNamePopUP;

    @FindBy(xpath = "(//div[@class='span6']//label)[10]")
    public WebElement organizerEmailPopUP;

    @FindBy(xpath = "(//div[@class='span6']//label)[11]")
    public WebElement startDatePopUP;

    @FindBy(xpath = "(//div[@class='span6']//label)[12]")
    public WebElement endDatePopUP;



    /*************** ADD EVENT COMPULSORY FIELDS   ****************/

    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement titleInAddEventPopUp;

    @FindBy(xpath = "//span[@class='select2-chosen']")
    public WebElement ownerInAddEventPopUp;

    @FindBy(name = "oro_calendar_event_form[organizerDisplayName]")
    public WebElement organizerDisplayNamePopUp;

    @FindBy(xpath = "//input[contains(@name,'date_selector_oro_calendar_event_form_start-uid')]")
    public WebElement startDateInAddEventPopUp;

    @FindBy(xpath = "//input[contains(@name,'time_selector_oro_calendar_event_form_start-uid')]")
    public WebElement startHourInAddEventPopUp;

    @FindBy(xpath = "//input[contains(@name,'date_selector_oro_calendar_event_form_end-uid')]")
    public WebElement endDateInAddEventPopUp;

    @FindBy(xpath = "//input[contains(@name,'time_selector_oro_calendar_event_form_end-uid')]")
    public WebElement endHourInAddEventPopUp;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButtonPopUp;


    /*************** ADD EVENT COMPULSORY FIELDS ERROR MESSAGES ****************/

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[title]']//..//span[.='This value should not be blank.']")
    public WebElement titleErrorMessage;

    @FindBy(xpath = "//input[contains(@name,'date_selector_oro_calendar_event_form_start-uid')]//..//..//span[.='This value should not be blank.']")
    public WebElement startDateErrorMessage;

    @FindBy(xpath = "//input[contains(@name,'time_selector_oro_calendar_event_form_start-uid')]//..//..//span[.='This value should not be blank.']")
    public WebElement startTimeErrorMessage;

    @FindBy(xpath = "//input[contains(@name,'date_selector_oro_calendar_event_form_end-uid')]//..//..//span[.='This value should not be blank.']")
    public WebElement endDateErrorMessage;

    @FindBy(xpath = "//input[contains(@name,'time_selector_oro_calendar_event_form_end-uid')]//..//..//span[.='This value should not be blank.']")
    public WebElement endTimeErrorMessage;


    /*************** METHODS ****************/


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