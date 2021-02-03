Feature: Contact page

  Scenario: Default page number
    Given The user is on the login page
    And The user enters driver information
    When The user navigates to "Customers" "Contacts"
    Then The default page number should be 1

  Scenario: Verify Create Calendar Event
    Given The user is on the login page
    And The user enters sales manager credentials
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Calendar"
  @wip
  Scenario: Menu Options
    Given The user logged in as a "driver"
    Then The user should see following options
    | Fleet |
    | Customers |
    | Activities  |
    | System  |
