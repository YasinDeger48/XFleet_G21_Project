Feature: User is on the XFleet


 Background: Truck Driver enters valid credential for login
  Given Truck Driver is on the login page
  When Truck Driver enters valid credentials
  Then Truck Driver sees Xfleet Homepage



  @AC1
  Scenario: User can see the Fleet-Vehicle module
   When User hover over the Fleet
   And  User clicks the Vehicles button module
  Then user should see Fleet-Vehicle module


 @AC2
  Scenario: "Driver" filter should provide the methods shown as below

  When User hover over the Fleet
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  Then user sees ContainsList


@AC3
Scenario: User selects "Contains" method with a keyword, the result contains the specified keyword
 When User hover over the Fleet
 And  User clicks the Vehicles button module
 When user clicks filterButton
 And user clicks manageFiltersbutton
 And user clicks Drivercheckbutton
 And user clicks Driverbutton
 And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
 Then the result should contain the keyword

 @AC4
 Scenario: User selects "Does Not Contain" method with a keyword, the result does not contain the specified keyword

  When User hover over the Fleet
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks DoesNotContain button
  And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
  Then the result should not contain the keyword

 @AC5
 Scenario: User selects "Starts-with" method with a keyword, the results should start with the specified keyword

  When User hover over the Fleet
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks Startswith button
  And user enters a keyword with "Mrs" to the inputbox
  Then the result should start with the keyword


 @AC6
 Scenario: User selects "Ends with" method with a keyword, the results should end with the specified keyword

  When User hover over the Fleet
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks Endswith button
  And user enters a keyword ending "Fritsch" to the inputbox
  Then the result should end with the keyword

 @AC7
 Scenario: User selects "Is Equal to" method with a keyword, the result should match the specified keyword

  When User hover over the Fleet
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks IsEqualTo button
  And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
  Then the result should match the keyword exactly