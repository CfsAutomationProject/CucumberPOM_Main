Feature: Amazon website automation


@amazon @TC1
Scenario: Verify amazon search
Given User Log into Amazon portal
When User searches for a Product
Then User Captures the list of Product prices


@TC2 
Scenario: Capture all the hyper links in Amazon HomePage
Given User Log into Amazon portal
When User searches for a Product
Then User captures all the hyperLinks in Homepage

@TC3
Scenario: Search for Iphone 14 and select the specific model
Given User Log into Amazon portal
When User searches for a Product
Then User Selects the desired model of Iphone from result

@TC4
Scenario: Actions in Selenium
Given User navigates to "https://www.flipkart.com/"
And User movuse over on SignIn
