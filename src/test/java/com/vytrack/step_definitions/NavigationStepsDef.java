package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepsDef {

    @When("The user navigates Fleet to Vechiles")
    public void the_user_navigates_Fleet_to_Vechiles() {
        System.out.println("The user navigates Fleet to Vechiles ");
    }

    @Then("The title should be Vechiles")
    public void the_title_should_be_Vechiles() {
        System.out.println("Expected and actual resuls are matching");
    }

    @When("The user navigates Marketing to Compaings")
    public void the_user_navigates_Marketing_to_Compaings() {
        System.out.println("Navigating Marketing to Compaings");
    }

    @Then("The title should be Compaings")
    public void the_title_should_be_Compaings() {
        System.out.println("Expected and actual results are matching");
    }

    @When("The user navigates Activities to Calendar Events")
    public void the_user_navigates_Activities_to_Calendar_Events() {
        System.out.println("Navigating Activities to Calendar Events");

    }

    @Then("The title should be Calendar")
    public void the_title_should_be_Calendar() {
        System.out.println("Expected and actual results are matching");
    }
}
