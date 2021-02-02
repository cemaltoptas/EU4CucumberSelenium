Feature: Contact page
  @wip
  Scenario: Default page number
    Given The user is on the login page
    And The user enters driver information
    When The user navigates to "Customers" "Contacts"
    Then The default page number should be 1
