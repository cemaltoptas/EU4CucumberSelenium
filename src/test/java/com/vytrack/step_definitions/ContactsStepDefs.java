package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class ContactsStepDefs {

    @Given("The user logged in as a {string}")
    public void the_user_logged_in_as_a(String string) {
        System.out.println("Wait a bit");

    }

    @Then("The user should see following options")
    public void the_user_should_see_following_options(List<String > menuOptions) {
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);


    }

}
