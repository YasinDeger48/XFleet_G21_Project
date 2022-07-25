@wip
Feature: Creating Car

  # AC1
  Scenario: "Create Car" button shouldn't be displayed for the driver
    Given Truck Driver is on the login page
    When Truck Driver enters valid credentials
    Then Truck Driver sees Xfleet Homepage
    And Truck Driver clicks Fleet
    And Truck Driver clicks Vehicles
    Then Create Car button shouldn't be displayed

  # AC2 # AC3 # AC4
  Scenario Outline: "Create Car" button should be displayed and user should land in the "Create Car" page
  Form data structure should be as defined
    Given Store_Sales Manager is on the login page
    When Store_Sales Manager enters valid credentials
    Then Store_Sales Manager sees Xfleet Homepage
    And Store_Sales Manager clicks Fleet
    And Store_Sales Manager clicks Vehicles
    Then Create Car button should be displayed
    And Store_Sales Manager clicks Create Car
    Then Store_Sales Manager is on Create Car Page
    Then User should see below info in tags checkBoxes
      | Junior       |
      | Senior       |
      | Employee Car |
      | Purchased    |
      | Compact      |
      | Sedan        |
      | Convertible  |
    Then User should see "<entries>" in "<determinedStructure>"
    Then User should see below info in transmission dropdown
      | Manual    |
      | Automatic |
    Then User should see below info in fuelType dropdown
      | Gasoline |
      | Diesel   |
      | Electric |
      | Hybrid   |
    Then Image is uploaded in JPEG or PNG format

    Examples:
      | entries             | determinedStructure |
      | licensePlate        | alpha-numerical     |
      | driver              | alphabetical        |
      | location            | alphabetical        |
      | chassisNumber       | alpha-numerical     |
      | modelYear           | numerical           |
      | lastOdometer        | numerical           |
      | immatriculationDate | date                |
      | firstContractDate   | date                |
      | catalogValue        | numerical           |
      | seatNumber          | numerical           |
      | doorsNumber         | numerical           |
      | colour              | alphabetical        |
      | co2Emission         | numerical           |
      | horsepower          | numerical           |
      | horsepowerTaxation  | numerical           |
      | power               | numerical           |

  # AC5 # AC6
  Scenario Outline: Saving options
    Given Store_Sales Manager is on the login page
    When Store_Sales Manager enters valid credentials
    And Store_Sales Manager clicks Fleet
    And Store_Sales Manager clicks Vehicles
    And Store_Sales Manager clicks Create Car
    Then User should see Save, Save And New, Save And Close below saving options
    Then User should see below "<savingOptions>" and related actions then success message

    Examples:
      | savingOptions |
      | save          |
      | saveAndNew    |
      | saveAndClose  |






