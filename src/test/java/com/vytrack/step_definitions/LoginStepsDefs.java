package com.vytrack.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open the web browser");
    }
    @When("The user enters driver information")
    public void the_user_enters_credentials() {
            System.out.println("Enter valid username and password");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("You are logged in");
    }
    @When("The user enters sales manager credentials")
    public void the_user_enters_sales_manager_credentials() {
        System.out.println("Enter valid username and password");
    }
    @When("he user enters store manager credentials")
    public void he_user_enters_store_manager_credentials() {
        System.out.println("Enter valid username and password as a store manager");
    }


}
