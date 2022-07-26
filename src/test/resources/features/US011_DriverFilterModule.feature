Feature: User is on the XFleet


 Background: Truck Driver enters valid credential for login
  Given Truck Driver is on the login page
  When Truck Driver enters valid credentials
  Then Truck Driver sees Xfleet Homepage



  @FLTAPS-2011 @wipp
  Scenario: User can see the Fleet-Vehicle module
   When User hover over the Fleet module
   And  User clicks the Vehicles button module
  Then user should see Fleet-Vehicle module


 @FLTAPS-2012 @wipp
  Scenario: "Driver" filter should provide the methods shown as below

  When User hover over the Fleet module
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  Then user sees ContainsList


@FLTAPS-2013 @wipp
Scenario: User selects "Contains" method with a keyword, the result contains the specified keyword
 When User hover over the Fleet module
 And  User clicks the Vehicles button module
 When user clicks filterButton
 And user clicks manageFiltersbutton
 And user clicks Drivercheckbutton
 And user clicks Driverbutton
 And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
 Then the result should contain the keyword

 @FLTAPS-2014 @wipp
 Scenario: User selects "Does Not Contain" method with a keyword, the result does not contain the specified keyword

  When User hover over the Fleet module
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks DoesNotContain button
  And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
  Then the result should not contain the keyword

 @FLTAPS-2015 @wipp
 Scenario: User selects "Starts-with" method with a keyword, the results should start with the specified keyword

  When User hover over the Fleet module
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks Startswith button
  And user enters a keyword with "Mrs." to the inputbox
  Then the result should start with the keyword


 @FLTAPS-2016 @wipp
 Scenario: User selects "Ends with" method with a keyword, the results should end with the specified keyword

  When User hover over the Fleet module
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks Endswith button
  And user enters a keyword ending "Fritsch" to the inputbox
  Then the result should end with the keyword

 @FLTAPS-2017 @wipp
 Scenario: User selects "Is Equal to" method with a keyword, the result should match the specified keyword

  When User hover over the Fleet module
  And  User clicks the Vehicles button module
  When user clicks filterButton
  And user clicks manageFiltersbutton
  And user clicks Drivercheckbutton
  And user clicks Driverbutton
  And user clicks ContainsTogglebutton
  And user clicks IsEqualTo button
  And user enters a keyword "Mrs. Conrad Fritsch" to the inputbox
  Then the result should match the keyword exactly

  @FLTAPS-2018 @wipp
  Scenario: Methods (Contains,Does Not Contain,StartsWith, EndsWith, Is Equal To) should not accept non-alphabetical characters

   When User hover over the Fleet module
   And  User clicks the Vehicles button module
   When user clicks filterButton
   And user clicks manageFiltersbutton
   And user clicks Drivercheckbutton
   And user clicks Driverbutton
   And user clicks ContainsTogglebutton
   And user clicks containsAndOther buttons
   And user enters  non-alphabetical characters to the inbox
   And user clicks update button
   Then method should not accept non-alphabetical character
