@US010 @FLTAPS-1937
Feature: Grid Settings

  User Story: As a user, I should be able to arrange vehicle table columns
  via "grid settings" functionality under the Fleet-Vehicles page

  Background: User should be already logged in.
    Given User logs in with random credentials

  @US010 @AC-1
  Scenario: "Grid Settings" should be visible when user clicks on the gear icon
    When User hover over the fleet button
    And User sees Vehicles button and click it
    And User sees Vehicle Table pages
    And User clicks gear icon
    Then Grid settings should be visible

  @US010 @AC-2
  Scenario: Column names in grid settings should be shown as below:
  -Id
  -License Plate
  -Tags
  -Driver
  -Location
  -Chassis Number
  -Model Year
  -Last Odometer
  -Immatriculation Date
  -First Contract Date
  -Catalog Value (VAT Incl.)
  -Seats Number
  -Doors Number
  -Color
  -Transmission
  -Fuel Type
  -CO2 Emissions
  -Horsepower
  -Horsepower Taxation
  -Power (KW)

    When User hover over the fleet button
    And User sees Vehicles button and click it
    And User sees Vehicle Table pages
    And User clicks gear icon
    Then User should see column names
      | Id                        |
      | License Plate             |
      | Tags                      |
      | Driver                    |
      | Location                  |
      | Chassis Number            |
      | Model Year                |
      | Last Odometer             |
      | Immatriculation Date      |
      | First Contract Date       |
      | Catalog Value (VAT Incl.) |
      | Seats Number              |
      | Doors Number              |
      | Color                     |
      | Transmission              |
      | Fuel Type                 |
      | CO2 Emissions             |
      | Horsepower                |
      | Horsepower Taxation       |
      | Power (KW)                |

  @US010 @AC-3
  Scenario Outline: User can find any column by typing the name on "Quick Search" input box
    When User hover over the fleet button
    And User sees Vehicles button and click it
    And User sees Vehicle Table pages
    And User clicks gear icon
    And User search for "<searchValue>"
    Then Search results should contain "<searchValue>"

    Examples:
      | searchValue |
      | tag         |
      | cens        |
      | driver      |
      | number      |

  @US010 @AC-4 @wip
  Scenario: User can select any column by clicking the column name
    When User hover over the fleet button
    And User sees Vehicles button and click it
    And User sees Vehicle Table pages
    And User clicks gear icon
    Then User clicks on "Id" and Selection state should change after clicking






