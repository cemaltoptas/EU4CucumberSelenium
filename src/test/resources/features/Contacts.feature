Feature: Contact page

  Scenario: Default page number
    Given The user is on the login page
    And The user enters driver information
    When The user navigates to "Customers" "Contacts"
    Then The default page number should be 1
  @wip
  Scenario: Verify Create Calendar Event
    Given The user is on the login page
    And The user enters sales manager credentials
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Calendar"

  Scenario: Menu Options
    Given The user logged in as a "driver"
    Then The user should see following options
    | Fleet |
    | Customers |
    | Activities  |
    | System  |

  Scenario: Menu Option2
    Given The user logged in as a "sales manager"
    Then The user should see following options
      | Dashboards |
      | Fleet |
      | Customers |
      | Sales |
      | Activities  |
      | Marketing |
      | Reports & Segments |
      | System  |


  Scenario: Login as a given user
    Given The user is on the login page
    When The user logs in using the following credential
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |
    Then The user should be able to login

