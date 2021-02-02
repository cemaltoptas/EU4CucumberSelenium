package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsInfo extends BasePage{

    @FindBy(css = "div.pull-left>h1.user-name")
    public WebElement fullName;

    @FindBy(css = "a.phone")
    public WebElement phone;

    @FindBy(css = "a.email")
    public  WebElement email;
}
