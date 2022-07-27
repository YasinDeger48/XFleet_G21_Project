package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US0008_DeleteACarPages {

        public US0008_DeleteACarPages(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(className = "dropdown-toggle")
        public WebElement threeDots;

        @FindBy(xpath = "//div[@class='dropdown open']")
        public WebElement dropdown;
}
