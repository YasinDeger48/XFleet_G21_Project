@US005
Feature: Add event 1

  User Story :
  As a store manager and sales manager, I should be able to add an event


  @US005 @AC1
  Scenario Outline:
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





