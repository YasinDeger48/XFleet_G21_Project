Feature: User is on the XFleet

  Background: Sales Manager Login


    Given Sales Manager is on the login page
    When Sales Manager enters valid credentials
    Then Sales Manager sees Xfleet Homepage


  @Ac_1
  Scenario: User can access the "Add Event" page from the "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehiclerow under Fleet-Vehicle module
    Then User should be able to see the Add Event buton

  @Ac_2
  Scenario: After clicking on "Add event" button, "Add Event" page should pop up.
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehicle/row under Fleet-Vehicle module
    Then User should be able to see the Add Event buton
    And  User clicks Add Event buttun
    When User should be able to access the Add Event page

  @Ac_3
  Scenario:  User can mark the event with any colour
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehicle/row under Fleet-Vehicle module
    Then User should be able to see the Add Event buton
    And  User clicks Add Event buttun
    When User should be able to access the Add Event page
    And User marks the event with any colour

  @Ac_4
  Scenario: User can click "All-day event" check box and after click time boxes will disappear
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehicle/row under Fleet-Vehicle module
    Then User should be able to see the Add Event buton
    And  User clicks Add Event buttun
    When User should be able to access the Add Event page
    And  User clicks All-day event
    Then User should be able to see that time boxes is disappeared

  @Ac_5
  Scenario: User can repeat the action by specifying occurrence periods and ending time:
  a)Repeat options should include the options below (repeats dropdown menu):
  -> "Daily", "Weekly", "Monthly", "Yearly"
  b)Ending options should be as below and clickable
  -> "Never"
  -> "After"
  -> "By"
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehicle/row under Fleet-Vehicle module
    Then User should be able to see the Add Event buton
    And  User clicks Add Event buttun
    When User should be able to access the Add Event page
    And  User clicks All-day event
    And  User clicks Repeat checkbox
    And  User should be able to chose belowe (repeats dropdown menu) Daily, Weekly, Monthly, Yearly
    And  User should be able to click Ending options Never After By


  @Ac_5
  Scenario: All Users can see all events on the General information page
    When User hover over the Fleet
    And  User clicks the Vehicles button
    And  User clicks any vehicle/row under Fleet-Vehicle module
    And  User should be able to see  all events on the General information page