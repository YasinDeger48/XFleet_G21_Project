@login
Feature: Login function

  @all
  Scenario Outline: User enters valid credential for login
    Given "<User>" is on the login page
    When "<User>" enters valid credentials
    Then "<User>" sees Xfleet Homepage

    Examples:
      | User          |
      | Truck Driver  |
      | Sales Manager |
      | Store Manager |

  @truck
  Scenario: Truck Driver enters valid credential for login
    Given Truck Driver is on the login page
    When Truck Driver enters valid credentials
    Then Truck Driver sees Xfleet Homepage

  @sales
  Scenario: Sales Manager enters valid credential for login
    Given Sales Manager is on the login page
    When Sales Manager enters valid credentials
    Then Sales Manager sees Xfleet Homepage

  @store
  Scenario: Store Manager enters valid credential for login
    Given Store Manager is on the login page
    When Store Manager enters valid credentials
    Then Store Manager sees Xfleet Homepage