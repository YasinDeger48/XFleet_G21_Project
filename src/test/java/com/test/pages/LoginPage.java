package com.test.pages;

import com.test.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    /*************** LOGIN PAGE LOCATORS    ****************/


    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginButton;




    /*************** METHODS    ****************/


    public void login(String USERNAME, String PASSWORD) {
        username.sendKeys(USERNAME);
        password.sendKeys(PASSWORD);
        loginButton.click();
    }

    public void signIn(String userType) {

        switch (userType) {
            case "Truck Driver":
                login(ConfigurationReader.getProperty("truckdriver"), ConfigurationReader.getProperty("password"));
                break;
            case "Sales Manager":
                login(ConfigurationReader.getProperty("salesmanager"), ConfigurationReader.getProperty("password"));
                break;
            case "Store Manager":
                login(ConfigurationReader.getProperty("storemanager"), ConfigurationReader.getProperty("password"));
                break;
        }


    }

}
