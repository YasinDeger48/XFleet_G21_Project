package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "oro-subtitle")
    private WebElement pageSubtitle;

    @FindBy(xpath = "//a[.='Logout']")
    private WebElement logoutBtn;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement nameSurname;




    public String getSubtitle(){
        return pageSubtitle.getText();
    }
    public void clickLogoutBtn(){
        logoutBtn.click();
    }



}