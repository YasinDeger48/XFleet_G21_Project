
@FLTAPS-1931
Feature: Arranging vehicle table data under Fleet-Vehicle page
    @AC-1Ylmz
    Scenario: User can arrange rows/vehicle numbers to be displayed by clicking
                on 'View Per Page' button under Fleet-Vehicles module
        Given "<User>" is on the login page
        When "<User>" enters valid credentials
        And "<User>" sees Xfleet Homepage
        And User clicks Flight/Vehicle module
        Then User can arrange rows/vehicle numbers to be displayed