package com.test.pages;


import com.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GeneralInformationPage extends BasePage {

    public boolean isGeneralInfoTextDriverPresent(WebElement element) {
        try {
            return element.isDisplayed();
            //return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isDeleteButtonDriverPresent(WebElement element) {
        try {
            return element.isDisplayed();
            //return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    @FindBy(xpath = "//h5[@class='user-fieldset']/span")
    public WebElement generalInfoText;

    @FindBy(xpath = "//a[@class='btn back icons-holder-text edit-button main-group']")
    public WebElement editButton;

    @FindBy(xpath = "//a[@class=' btn icons-holder-text no-hash remove-button']")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[@class='btn icons-holder-text no-hash']")
    public WebElement addEventButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div/div")
    public WebElement licensePlateInfo;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[4]/div/div")
    public WebElement locationNameInfo;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[3]/div/div")
    public WebElement driverNameInfo;



  }
