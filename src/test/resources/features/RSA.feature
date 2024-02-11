Feature: RSA practice website

  @TC1
  Scenario: How to Handle Static Dropdowns
    
    Given Logs into the RSA portal
    Then Verify Static Dropdown
    
@TC2
  Scenario: Handeling Passengers dropdown
    Given Logs into the RSA portal
    Then user selects three Adults Passengers

@TC3
Scenario: Green Cart website end to end scenario
    Given Logs into the RSA portal
    Then Verify Green Cart Website
    
@TC4
Scenario: How to Handle Windows
Given Launch RSA Practice URL
Then Verify Window Handles

@TC5
Scenario: Flipkart product price
Given User Launches Flipkart URL
Then Verify products name and price