@US010 @FLTAPS-1937
  Feature: Grid Settings

    User Story: As a user, I should be able to arrange vehicle table columns
    via "grid settings" functionality under the Fleet-Vehicles page

  Background: User should be already logged in.
    Given User logs in with random credentials

  @US010 @AC-1
    Scenario: "Grid Settings" should be visible when user clicks on the gear icon
    When User hover over the fleet button
    And User sees Vehicles button and click it
    And User sees Vehicle Table pages
    And User clicks gear icon


