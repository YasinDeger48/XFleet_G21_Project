package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCarPage extends BasePage {

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement createCarTitle;

}
