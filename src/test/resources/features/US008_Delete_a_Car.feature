Feature: Delete a car

  User Story :
  As a 'Sales Manager' and 'Store Manager', I should be able to delete a car



  Acceptance Criteria:
  1-All users can see the delete button by hovering over the three dots at the end of each row
  2- "Delete Confirmation" pop up should be displayed when the user clicks on the delete button
  3-"You do not have permission to perform this action." message should be displayed if the driver clicks on the "Yes, Delete" button.
  4- 'Sales Manager' and 'Store Manager' can delete any car by clicking on the delete button at the end of each row and the "Item deleted" message should be displayed.
  5- When 'Sales Manager' and 'Store Manager' go to the 'General Information' page by clicking on any vehicle/row,
  they can delete any vehicle by clicking on the 'Delete' button and the "Car deleted" message should be displayed.
  6-When 'Sales Manager' and 'Store Manager' delete a car, the corresponding car should also be removed from the Fleet-Vehicle page.


  Scenario Outline: All users can see the delete button by hovering over the three dots at the end of each row
    Given user, is already logged as a "<usertype>"
    When user, hover over to Fleet button and clicks to Vehicles
    And scroll page right
    And hover on three dots
    Then user should see delete button

    Examples:
      | usertype      |
      | Sales Manager |
      | Store Manager |

    Scenario Outline: "Delete Confirmation" pop up should be displayed when the user clicks on the delete button
      Given user, is already logged as a "<usertype>"
      When user, hover over to Fleet button and clicks to Vehicles
      And hover on three dots
      And user is click delete button
      Then user should be able to delete confirmation pop up

      Examples:
        | usertype      |
        | Sales Manager |
        | Store Manager |
