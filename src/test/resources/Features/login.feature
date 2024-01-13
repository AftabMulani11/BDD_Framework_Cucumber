Feature: JALA Technology Login test

  Background: 
    Given User already on Login Page
  Scenario: JALA Technology Login test Scenario
    Given User enters userID and password
    And Click on Remember me button
    And Click on Sign in button
    Then User validate the Dashboard
    And User click on Logout button