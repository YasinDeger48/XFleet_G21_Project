Feature: Creating Car

  Scenario: "Create Car" button shouldn't be displayed for the driver
    Given Truck Driver is on the login page
    When Truck Driver enters valid credentials
    Then Truck Driver sees Xfleet Homepage
    And Truck Driver clicks Fleet
    And Truck Driver clicks Vehicles
    Then Create Car button shouldn't be displayed

  @wip
    Scenario: "Create Car" button should be displayed for Store /Sales Manager
    Given Store_Sales Manager is on the login page
    When Store_Sales Manager enters valid credentials
    Then Store_Sales Manager sees Xfleet Homepage
    And Store_Sales Manager clicks Fleet
    And Store_Sales Manager clicks Vehicles
    Then Create Car button should be displayed