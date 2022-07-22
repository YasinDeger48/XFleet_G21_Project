package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Add_Event_2_Pages extends BasePage {


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


    @FindBy(xpath = " //span[@class='ui-dialog-title']")
    public List<WebElement> addEventPage;


    @FindBy(xpath = "(//span[@class='color'])")
    public List<WebElement> colortable;


    @FindBy(xpath = "//span[@data-selected]")
    public WebElement checkedColor;


    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement allDayEventButton;


    @FindBy(xpath = "(//input[@placeholder='time'])[1]")
    public WebElement start_and_endTime;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement repeatButtun;


    @FindBy(xpath = " (//select[@id='recurrence-repeats-view1884'])/option")
    public List<WebElement> repeatsSelectButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement titleTextBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;




}
