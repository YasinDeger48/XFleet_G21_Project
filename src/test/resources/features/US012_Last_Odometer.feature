@US012
Feature: Last Odometer Filter
  User Story :
  As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page

  @AC-1 @US12
  Scenario Outline: All user types can use "Last Odometer" vehicle information under 'Fleet-Vehicles' module
    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    Then user should see "Last Odometer" filter
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

    @AC-2

    Scenario:"Last Odometer" filter should provide the methods shown as below
    -> Between
    -> Not Between
    -> Equals
    -> Not Equals
    -> More Than
    -> Less Than
    -> Equals or More Than
    -> Equals or Less Than
    -> Is Empty
    -> Is Not Empty

    Given User click on "Manager Filter" button
    When  User select the "Last Odometer" checkbox
    And   User click on the "Last Odometer" dropdown
    Then  User click on the dropdown options and see the methods


    @AC-3

    Scenario: user selects "Between" method with numeric values, the results should be between the specified values

      Given User click on the "Last Odometer" dropdown
      When User click on the dropdown and select "Between" method with numeric values
      And User click on the "Update" button
      Then User see the results should be between the specified values

    @AC-4

    Scenario: user selects "Equals" method with numeric values, the results should match the specified value exactly

      Given User click on the "Last Odometer" dropdown
      When User click on the dropdown and select "Equals" method with numeric values
      And User click on the "Update" button
      Then User see  the results should match the specified value exactly

    @AC-5

    Scenario: user selects "More than" method with numeric values, the results should be between the specified values

      Given User click on the "Last Odometer" dropdown
      When User click on the dropdown and select "More than" method with numeric values
      And User click on the "Update" button
      Then User see  the results should be more than the specified value

    @AC-6

    Scenario: user selects "Less than" method with numeric values, the results should be between the specified values

    Given User click on the "Last Odometer" dropdown
    When User click on the dropdown and select "Less than" method with numeric values
    And User click on the "Update" button
    Then User see  the results should be more than the specified value


    @AC-7

    Scenario: user selects "Is Empty" method, only empty values should be displayed.

    Given User click on the "Last Odometer" dropdown
    When User click on the dropdown and select "Is Empty" method
    And User click on the "Update" button
    Then User see  only empty values should be displayed


    @AC-8
    Scenario Outline: Methods ("Between","Equals","More Than","Less Than") shouldn't accept non-numeric values
    Given user selects as a "<method>" and enter non-numerical values
    And User click on the "Update" button
    Then user should see "<method>" should not accept non-numeric values
    Examples:
      | method    |
      | Between   |
      | Equals    |
      | More Than |
      | Less Than |





















