@wip1
Feature: Vehicle table view
  User Story: As a user, I should be able to see all vehicle
  information in a table under Fleet-Vehicle page

  Acceptance Criteria:
  1- All user types can see all vehicle information under 'Fleet-Vehicles' module
  2- User can see the total page number
  3- User can go to next page clicking ">" button and can go to previous page clicking "<" button
  4- User can see total recordings of vehicles
  5- User can download table data in XLS or CSV format from "Export Grid" (a confirmation message is enough to validate)

  Scenario Outline: All user types can see all vehicle information under 'Fleet-Vehicles' module
    Given user is already logged as a "<usertype>"
    When user hover over to Fleet button and clicks to Vehicles
    Then user should see all vehicle information
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

  Scenario Outline: User can see the total page number
    Given user is already logged as a "<usertype>"
    When user hover over to Fleet button and clicks to Vehicles
    Then user should see total page number
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

  Scenario Outline: User can go to next page clicking ">" button and can go to previous page clicking "<" button
    Given user is already logged as a "<usertype>"
    When user hover over to Fleet button and clicks to Vehicles
    And user clicks page forward button
    Then user should land on next page
    And user clicks page backward button
    Then user should land on previous page
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

  Scenario Outline: User can see total recordings of vehicles
    Given user is already logged as a "<usertype>"
    When user hover over to Fleet button and clicks to Vehicles
    Then user should see total recordings of vehicles
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

  Scenario Outline: User can download table data in XLSX or CSV format from "Export Grid" (a confirmation message is enough to validate)
    Given user is already logged as a "<usertype>"
    When user hover over to Fleet button and clicks to Vehicles
    And user clicks to Export Grid button and select "XLSX" format
    Then user should see a confirmation message
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |






