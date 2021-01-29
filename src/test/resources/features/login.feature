Feature: User should be able to login

  Scenario: Login as a driver
    Given The user is on the login page
    When The user enters driver information
    Then The user should be able to login

  Scenario: Login as a sales manager
    Given The user is on the login page
    When The user enters sales manager credentials
    Then The user should be able to login

  Scenario: Login as a store manager
    Given The user is on the login page
    When he user enters store manager credentials
    Then The user should be able to login



