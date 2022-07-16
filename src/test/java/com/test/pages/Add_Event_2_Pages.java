package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Add_Event_2_Pages {

    public Add_Event_2_Pages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleet;

    @FindBy(xpath = "//table/tbody/tr[1]")
    public WebElement d16FM;

    @FindBy(xpath = "//a[@class='btn icons-holder-text no-hash']")
    public WebElement addEventButton;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicles;


    @FindBy(xpath = "(//table/tbody/tr)")
    public List<WebElement> carsTable;
}
