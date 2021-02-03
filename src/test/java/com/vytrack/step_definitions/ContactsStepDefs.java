package com.vytrack.step_definitions;

import com.vytrack.pages.DashBoardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactsStepDefs {


    @Then("The user should see following options")
    public void the_user_should_see_following_options(List<String > menuOptions) {

        BrowserUtils.waitFor(6);
        List<String> actualOptions = BrowserUtils.getElementsText(new DashBoardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("Expected " + menuOptions);
        System.out.println("Actual " + actualOptions);
    }
}
