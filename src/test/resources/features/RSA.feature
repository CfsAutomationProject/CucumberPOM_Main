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

@TC6
Scenario: Flipkart site practice
Given User Launches Flipkart URL
Then Capture all the hyper links in the page

@TC7
Scenario: Handeling child window
Given Launch RSA Practice URL
Then Verify ChildWindow

@TC8
Scenario: Table Handling
Given Launch W3schools wesite
Then navigate to Table
Then Capture all the data present in Table

@TC9 
Scenario: Get the Lowest price of the product
Given User Launches Flipkart URL
When user Search for product
Then Capture prices of products and sort then from lowest to higest



