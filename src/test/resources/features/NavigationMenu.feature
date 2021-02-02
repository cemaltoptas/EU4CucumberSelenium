@navigate
Feature: Navigation Feature Menu
  Scenario: Navigating Fleet to Vehicles
    Given The user is on the login page
    And The user enters sales manager credentials
    When The user navigates Fleet to Vechiles
    Then The title should be Vechiles
  @db
  Scenario: Navigating Marketing to Compaings
    Given The user is on the login page
    And The user enters sales manager credentials
    When The user navigates Marketing to Compaings
    Then The title should be Compaings

  Scenario: Navigating Activities to Calendar Events
    When The user is on the login page
    And The user enters sales manager credentials
    When The user navigates Activities to Calendar Events
    Then The title should be Calendar