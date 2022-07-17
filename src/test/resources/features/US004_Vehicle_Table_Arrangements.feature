#As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page
#Acceptance Criteria:
#1- User can arrange rows/vehicle numbers to be displayed by clicking on 'View Per Page' button under Fleet-Vehicles module
#2- The value of 'View Per Page' should be '25' by default
#3- 'View Per Page' includes the values shown as below and the user can select each of them:
#      ->10
#      ->25
#      ->50
#      ->100
#4- User can sort a column in ascending or descending order by clicking the column name
#5- User can remove all sortings and filterings on the page by using the reset button


@FLTAPS-1931 @wip
Feature: Arranging vehicle table data under Fleet-Vehicle page
    @FLTAPS-1957
    Scenario: Truck Driver can arrange rows/vehicle numbers to be displayed by clicking
                on 'View Per Page' button under Fleet-Vehicles module
        Given Truck Driver is on the login page
        When Truck Driver enters valid credentials
        Then Truck Driver sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sees default value is twentyfive
        Then User can select each of the options
        Then User can arrange rows and vehicle numbers to be displayed
    @FLTAPS-1958
    Scenario: Sales Manager can arrange rows/vehicle numbers to be displayed by clicking
    on 'View Per Page' button under Fleet-Vehicles module
        Given Sales Manager is on the login page
        When Sales Manager enters valid credentials
        Then Sales Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sees default value is twentyfive
        Then User can select each of the options
        Then User can arrange rows and vehicle numbers to be displayed
    @FLTAPS-1959
    Scenario: Store Manager can arrange rows/vehicle numbers to be displayed by clicking
    on 'View Per Page' button under Fleet-Vehicles module
        Given Store Manager is on the login page
        When Store Manager enters valid credentials
        Then Store Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sees default value is twentyfive
        Then User can select each of the options
        Then User can arrange rows and vehicle numbers to be displayed

    @FLTAPS-1960
    Scenario: Truck Driver can sort a column in ascending or descending order by clicking the column name
        Given Truck Driver is on the login page
        When Truck Driver enters valid credentials
        Then Truck Driver sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sort a column in ascending or descending order by clicking the column name
    @FLTAPS-1961
    Scenario: Sales Manager can sort a column in ascending or descending order by clicking the column name
        Given Sales Manager is on the login page
        When Sales Manager enters valid credentials
        Then Sales Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sort a column in ascending or descending order by clicking the column name
    @FLTAPS-1962
    Scenario: Store Manager can sort a column in ascending or descending order by clicking the column name
        Given Store Manager is on the login page
        When Store Manager enters valid credentials
        Then Store Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        Then User sort a column in ascending or descending order by clicking the column name


    @FLTAPS-1963
    Scenario: Truck Driver can remove all sortings and filterings on the page by using the reset button
        Given Truck Driver is on the login page
        When Truck Driver enters valid credentials
        Then Truck Driver sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        And User sorts and filters by clicking columns and filters
        Then User remove all sortings and filterings on the page by using the reset button
    @FLTAPS-1964
    Scenario: Sales Manager can remove all sortings and filterings on the page by using the reset button
        Given Sales Manager is on the login page
        When Sales Manager enters valid credentials
        Then Sales Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        And User sorts and filters by clicking columns and filters
        Then User remove all sortings and filterings on the page by using the reset button
    @FLTAPS-1965
    Scenario: Store Manager can remove all sortings and filterings on the page by using the reset button
        Given Store Manager is on the login page
        When Store Manager enters valid credentials
        Then Store Manager sees Xfleet Homepage
        And User clicks Flight-Vehicle module
        And User sorts and filters by clicking columns and filters
        Then User remove all sortings and filterings on the page by using the reset button