Feature: Account Types
  @wip
  Scenario: Driver user
    Given The user logged in as a "driver"
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Calendar Events - Activities"
  @wip
  Scenario: Sales Manager User
    Given The user logged in as a "sales manager"
    When The user navigates to "Customers" "Accounts"
    Then The title contains "Accounts - Customers"
  @wip
  Scenario: Store manager
    Given The user logged in as a "store manager"
    When The user navigates to "Customers" "Contacts"
    Then The title contains "Contacts - Customer"


  Scenario Outline: Login with different accounts <userType>
    Given The user logged in as a "<userType>"
    When The user navigates to "<tab>" "<module>"
    Then The title contains "<title>"

    Examples:
      | userType      | tab        | module          | title                                                              |
      | driver        | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Customers  | Contacts        | Contacts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | System     | Menus           | All - Menus - System                                               |


  Scenario Outline: Different user types
    Given The user logged in as a "<userType>"


    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |
      | admin         |

