Feature: Vehicle General Information
  User Story :
  As a user, I should be able to see the detailed information of a specific vehicle (General Information Page)

@US007
  Background:For the scenarios in the feature file, user is expected to be on login page
    Given Store manager/sales manager is on the login page

  Scenario: Login as Store manager/sales manager
    When user enters username as store manager/sales manager
    And user enters password as store manager/sales manager
    Then user should see managers' dashboard

  Scenario: Login as driver
    When user enters username as driver
    And user enters password as driver
    Then user should see drivers' dashboard

