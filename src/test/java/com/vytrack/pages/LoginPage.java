package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        //PageFactory class provides ti initilize the following elements (FindBy)
        PageFactory.initElements(Driver.get(),this);
    }

    // driver.findElement(By.id("prependedinput"))

    @FindBy(id ="prependedInput")
    public WebElement username ;

    @FindBy(id ="prependedInput2")
    public WebElement password;

    @FindBy(id ="_submit")
    public WebElement submitBtn;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitBtn.click();

    }

    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitBtn.click();
    }

    public void loginAsDriver(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitBtn.click();
    }
    public void LoginAsSalesManager(){
        String userName=ConfigurationReader.get("salesmanager_username");
        String password=ConfigurationReader.get("salesmanager_password");
        this.username.sendKeys(userName);
        this.password.sendKeys(password);
        this.submitBtn.click();

    }

}
