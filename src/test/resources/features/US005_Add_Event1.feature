@US005
Feature: Add event 1

  User Story :
  As a store manager and sales manager, I should be able to add an event


  @FLTAPS-1940 @US005 @AC1
  Scenario Outline: User can access the 'Add Event' page successfully
    Given "<UserType>" is on the login page
    When "<UserType>" enters valid credentials
    Then "<UserType>" sees Xfleet Homepage
    And User hover over the fleet button
    And User sees Vehicles button and click it
    Then User sees Vehicle Table pages
    And User clicks the random vehicles
    Then User sees the "General Information" page
    And User clicks the "Add Event" button
    Then User sees the Add Event page

    Examples: User Types of add event module
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |

  @FLTAPS-1941 @US005 @AC2
  Scenario Outline: User can click the 'Add Event' button
    Given "<UserType>" is on the login page
    When "<UserType>" enters valid credentials
    Then "<UserType>" sees Xfleet Homepage
    And User hover over the fleet button
    And User sees Vehicles button and click it
    Then User sees Vehicle Table pages
    And User clicks the random vehicles
    Then User sees the "General Information" page
    Then User sees Add Event button Visibility

    Examples:
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |



  @FLTAPS-1942 @US005 @AC3  @AC34
  Scenario Outline:User can click the 'Add Event' button the should be see 'Add Event' popup
    Given "<UserType>" is on the login page
    When "<UserType>" enters valid credentials
    Then "<UserType>" sees Xfleet Homepage
    And User hover over the fleet button
    And User sees Vehicles button and click it
    Then User sees Vehicle Table pages
    And User clicks the random vehicles
    Then User sees the "General Information" page
    And User clicks the "Add Event" button
    Then User sees the Add Event page

    Examples: User Types of add event module
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |

  @FLTAPS-1943 @US005 @AC4  @AC34
  Scenario Outline: User can be see the compulsory fields in the 'Add Event' popup page
    Given "<UserType>" is on the login page
    When "<UserType>" enters valid credentials
    Then "<UserType>" sees Xfleet Homepage
    And User hover over the fleet button
    And User sees Vehicles button and click it
    Then User sees Vehicle Table pages
    And User clicks the random vehicles
    Then User sees the "General Information" page
    And User clicks the "Add Event" button
    And User sees all compulsory fields
    Then User sees the Add Event page

    Examples: User Types for checking compulsory fields
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |

  @FLTAPS-1944 @US005 @AC5
  Scenario Outline: User clicks save button without filled the compulsory fields and see the error message
    Given "<UserType>" is on the login page
    When "<UserType>" enters valid credentials
    Then "<UserType>" sees Xfleet Homepage
    And User hover over the fleet button
    And User sees Vehicles button and click it
    Then User sees Vehicle Table pages
    And User clicks the random vehicles
    Then User sees the "General Information" page
    And User clicks the "Add Event" button
    And User sees all compulsory fields
    Then User checks error message without inputs one by one (compulsory fields)

    Examples: User Types for checking compulsory fields
      | UserType      |
      | Sales Manager |
      | Store Manager |
      | Truck Driver  |