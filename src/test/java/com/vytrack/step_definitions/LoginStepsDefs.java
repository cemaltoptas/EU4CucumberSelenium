package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepsDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
       // WebDriver driver = Driver.get();
       // driver.get(url);   if we create the object url we will not allowed to use
        // driver object in other blocks
        //Using Singleton is the best approach
        Driver.get().get(url);
    }
    @When("The user enters driver information")
    public void the_user_enters_credentials() {

        String userName = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
       // loginPage.username.sendKeys(userName);
       // loginPage.password.sendKeys(password);
       // loginPage.submitBtn.click();
        loginPage.login(userName,password);
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        // When using Assert.assertEquals in junit , first expected then actual!!!
        Assert.assertEquals("Dashboard",actualTitle);
    }
    @When("The user enters sales manager credentials")
    public void the_user_enters_sales_manager_credentials() {

        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }
    @When("The user enters store manager credentials")
    public void he_user_enters_store_manager_credentials() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }


}
