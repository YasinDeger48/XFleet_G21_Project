Feature: Creating Car

  @wip
  Scenario: "Create Car" button shouldn't be displayed for the driver
    Given Truck Driver is on the login page
    When Truck Driver enters valid credentials
    Then Truck Driver sees Xfleet Homepage
    And Truck Driver clicks Fleet
    And Truck Driver clicks Vehicles
    Then Create Car button shouldn't be displayed