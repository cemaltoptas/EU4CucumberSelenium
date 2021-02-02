Feature: Login as different users
  @wip
  Scenario: Login As A Driver User
    Given The user is on the login page
    When The user logs in using "user10" and "UserUser123"
    Then The user should be able to login
    And The title contains "Dashboard"