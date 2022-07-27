@US012
Feature: Last Odometer Filter
  User Story :
  As a user, I should be able to use "Last Odometer" filter under 'Fleet-Vehicles' page


   @FLTAPS-1987 @AC-1
  Scenario Outline: All user types can use "Last Odometer" vehicle information under 'Fleet-Vehicles' module
    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    Then user should see Last Odometer filter
    Examples:
      | usertype      |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

    @FLTAPS-1988 @AC-2

    Scenario Outline:"Last Odometer" filter should provide the methods shown as below
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

    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    And  User select the Last Odometer checkbox
    And   User click on the Last Odometer dropdown
    Then  User click on the dropdown options and see the methods

      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |


    @AC-3

    Scenario Outline: user selects "Between" method with numeric values, the results should be between the specified values
      Given user is already logged as a "<usertype>"
      When user hover over on Fleet button and clicks to Vehicles
      And user click Manage filters button and able to select
      And  User select the Last Odometer checkbox
      And   User click on the Last Odometer dropdown
      When User click on the dropdown and select Between method with numeric values
      And User click on the Update button
      Then User see the results should be between the specified values

      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |

    @FLTAPS-1990 @AC-4

    Scenario Outline: user selects "Equals" method with numeric values, the results should match the specified value exactly

      Given user is already logged as a "<usertype>"
      When user hover over on Fleet button and clicks to Vehicles
      And user click Manage filters button and able to select
      And  User select the Last Odometer checkbox
      And   User click on the Last Odometer dropdown
      When User click on the dropdown and select Equals method with numeric values
      Then User see  the results should match the specified value exactly

      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |


    @FLTAPS-1991 @AC-5

    Scenario Outline: user selects "More than" method with numeric values, the results should be between the specified values

      Given user is already logged as a "<usertype>"
      When user hover over on Fleet button and clicks to Vehicles
      And user click Manage filters button and able to select
      And  User select the Last Odometer checkbox
      And   User click on the Last Odometer dropdown
      When User click on the dropdown and select More than method with numeric values
      And User click on the Update button
      Then User see  the results should be more than the specified value
      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |


  @FLTAPS-1992 @AC-6

    Scenario Outline:  user selects "Less than" method with numeric values, the results should be between the specified values

    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    And  User select the Last Odometer checkbox
    And   User click on the Last Odometer dropdown
    When User click on the dropdown and select Less than method with numeric values
    And User click on the Update button
    Then User see  the results should be less than the specified value
      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |


  @FLTAPS-1993 @AC-7

    Scenario Outline:  user selects "Is Empty" method, only empty values should be displayed.

    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    And  User select the Last Odometer checkbox
    And   User click on the Last Odometer dropdown
    When User click on the dropdown and select Is Empty method
    And User click on the Update button
    Then User see  only empty values should be displayed

      Examples:
        | usertype      |
        | Truck Driver  |
        | Sales Manager |
        | Store Manager |




  @FLTAPS-1994 @AC-8 @YUSUF
    Scenario Outline: Methods ("Between","Equals","More Than","Less Than") shouldn't accept non-numeric values

    Given user is already logged as a "<usertype>"
    When user hover over on Fleet button and clicks to Vehicles
    And user click Manage filters button and able to select
    And  User select the Last Odometer checkbox
    And  User click on the Last Odometer dropdown
    When User click on the dropdown and select Between method with non-numeric values
    Then User click on the Update button
    And User see method should not accept non-numeric values
    And  User click on the Last Odometer dropdown
    When User click on the dropdown and select Equals method with non-numeric value
    Then User click on the Update button
      And User see method should not accept non-numeric values
    And  User click on the Last Odometer dropdown
    When User click on the dropdown and select More than method with non-numeric value
    And User click on the Update button
      And User see method should not accept non-numeric values
    And  User click on the Last Odometer dropdown
    When User click on the dropdown and select Less than method with non-numeric value
    And User click on the Update button
      And User see method should not accept non-numeric values

     Examples:
       | usertype      |
       | Truck Driver  |
       | Sales Manager |
       | Store Manager |






















