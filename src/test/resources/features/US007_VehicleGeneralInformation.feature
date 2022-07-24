@US007 @FLTAPS-1934
Feature: Vehicle General Information
  User Story :
  As a user, I should be able to see the detailed information of a specific vehicle (General Information Page)

  @US007 @FLTAPS-1975
  Scenario Outline:User can see the General Information page by clicking on any vehicle under FleetVehicle module
    Given user is already logged as a "<UserType>"
    And user hover over to Fleet button and clicks to Vehicles
    And User clicks the any vehicles
    Then user sees General information page
    Examples:
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |

  @US007 @FLTAPS-1976
  Scenario Outline: User can see the "General Information" page clicking on the "Eye (View)" icon at the end of each row, under 'Fleet-Vehicle' module
    Given user is already logged as a "<UserType>"
    And user hover over to Fleet button and clicks to Vehicles
    And User clicks the any vehicles
    And user hover over on the three dots and clicks the eye icon
    Then user sees General information page
    Examples:
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |

  @US007 @FLTAPS-1977
  Scenario Outline: Sales/store manager should see "Edit" "Delete" and "Add Event" buttons on the "General Information" page
    Given user is already logged as a "<UserType>"
    And user hover over to Fleet button and clicks to Vehicles
    And User clicks the any vehicles
    Then manager sees Edit, Delete, and Add Event buttons
    Examples:
      | UserType      |
      | Sales Manager |
      | Store Manager |

  @US007 @FLTAPS-1985
  Scenario Outline: Driver shouldn't see "Add Event", "Edit" and "Delete" buttons
    Given user is already logged as a "<UserType>"
    And user hover over to Fleet button and clicks to Vehicles
    And User clicks the any vehicles
    Then driver does not see Edit, Delete, and Add Event buttons
    Examples:
      | UserType     |
      | Truck Driver |

  @US007 @FLTAPS-1986
  Scenario Outline: Vehicle information displayed on the "General Information" page and "Fleet-Vehicle" page should be the same
    Given user is already logged as a "<UserType>"
    And user hover over to Fleet button and clicks to Vehicles
    And User clicks the any vehicles
    Then user sees information on General Information page and Vehicle page are the same

    Examples:
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |


