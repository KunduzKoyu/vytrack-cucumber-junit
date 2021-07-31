
@smoke
Feature:As a Truck driver/ Sales Manager/ Store Manager
  I should be able to log in with valid credentials to Vytrack's Fleet Management module.

  Background: Assuming user is on login page
  Given The user is on Vytrack login page

  Scenario: Login as a Truck Driver
    When the user enters correct username and password for Truck Driver and clicks on Log in button
    Then user should be able to log in to his Truck Driver account

  @smoke
  Scenario: Login as a Sales Manager
    When the user enters correct username and password for Sales Manager and clicks on Log in button
    Then user should be able to log in to his Sales Manager account


  Scenario: Login as a Store Manager
    When the user enters correct username  and password Store Manager and clicks on Log in button
    Then user should be able to log in to his Store Manager account




