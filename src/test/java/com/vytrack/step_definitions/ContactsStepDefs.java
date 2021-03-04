package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsInfo;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.DBUtilities;
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
    public void the_user_logs_in_using_the_following_credential(Map<String, String> userInfo) {

        //Use map information to log in and verify first name and last name
        //Log i with map info
        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        //Verify username

        String actualUsername = new DashBoardPage().getUserName();
        String expectedUsername = userInfo.get("firstname ") + userInfo.get("lastname");

        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @When("The user click on {string} in contacts")
    public void the_user_click_on_in_contacts(String email) {

        ContactsPage contactsPage = new ContactsPage();
        contactsPage.getContactEmail(email).click();
    }

    @Then("The information should be match with database")
    public void the_information_should_be_match_with_database() {
        new DashBoardPage().waitUntilLoaderScreenDisappear();
        //Get information from UI
        ContactsInfo contactsInfo = new ContactsInfo();

        String actualFullName = contactsInfo.fullName.getText();
        String actualEmail = contactsInfo.email.getText();
        String actualPhoneNumber = contactsInfo.phone.getText();

        System.out.println("actualFullName = " + actualFullName);
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("actualPhoneNumber = " + actualPhoneNumber);


        //Get in formation from database

        //Query for retrieving first_name, last_name, e.email, phone from DB
        String query = "Select CONCAT(first_name,' ', last_name)as \"full_name\", e.email, phone\n" +
                "from orocrm_contact c inner join orocrm_contact_email e\n" +
                "on c.id = e.owner_id\n" +
                "join orocrm_contact_phone\n" +
                "on e.owner_id = orocrm_contact_phone.owner_id\n" +
                "Where e.email = 'mbrackstone9@example.com';";

        Map<String, Object> rowMap = DBUtilities.getRowMap(query);
        String expectedFullName = (String) rowMap.get("full_name");
        String expectedEmail = (String) rowMap.get("email");
        String expectedPhoneNumber = (String) rowMap.get("phone");

        System.out.println("expectedFullName = " + expectedFullName);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhoneNumber);

        //Assertion

        Assert.assertEquals(expectedFullName, actualFullName);
        Assert.assertEquals(expectedEmail, actualEmail);
        Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);

    }

}
