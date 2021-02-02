package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts extends BasePage{

    public Contacts(){
        PageFactory.initElements(Driver.get(),this);
    }

  /*  @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email; */

    public  WebElement getContactEmail(String email){

        String xpath="//td[contains(text(),'"+ email +"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }
}
