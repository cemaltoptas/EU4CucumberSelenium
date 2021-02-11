@login @smoke
Feature: User should be able to login
  Background:
    Given The user is on the login page

  @driver
  Scenario: Login as a driver
    When The user enters driver information
    Then The user should be able to login

  @sales_manager
  Scenario: Login as a sales manager
    When The user enters sales manager credentials
    Then The user should be able to login

  @store_manager
  Scenario: Login as a store manager
    When The user enters store manager credentials
    Then The user should be able to login




