package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {


    @Then("The user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        BrowserUtils.waitFor(6);
        List<String> actualOptions = BrowserUtils.getElementsText(new DashBoardPage().menuOptions);

        Assert.assertEquals(menuOptions, actualOptions);
        System.out.println("Expected " + menuOptions);
        System.out.println("Actual " + actualOptions);
    }

    @When("The user logs in using the following credential")
    public void the_user_logs_in_using_the_following_credential(Map<String,String> userInfo) {

        //Use map information to log in and verify first name and last name
        //Log i with map info
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        //Verify username

        String actualUsername = new DashBoardPage().getUserName();
        String expectedUsername =userInfo.get("firstname ") + userInfo.get("lastname");

        Assert.assertEquals(expectedUsername,actualUsername);

    }
}
