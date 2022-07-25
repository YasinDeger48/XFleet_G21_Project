@FLTAPS-2007
Feature: Smoke Tests
    @FLTAPS-1941
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

    @FLTAPS-1944
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


    @FLTAPS-1978
    Scenario Outline: All user types can see all vehicle information under 'Fleet-Vehicles' module
      Given user is already logged as a "<usertype>"
      When user hover over to Fleet button and clicks to Vehicles
      Then user should see all vehicle information
      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |