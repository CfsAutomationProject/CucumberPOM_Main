Feature: Login page feature


@test1
Scenario: Login page title
Given user is on login page
Then user captures all the link in Homepage


@test2
Scenario: Handling dropdown
Given user login to TryTestingThis 
Then user selects the dropdown value

@test3
Scenario: Handling Alerts Popup
Given user login to TryTestingThis 
Then verify alert popup 

#When user gets the title of the page
#Then page title should be "Login - My Store"

#@test2
#Scenario: Forgot Password link
#Given user is on login page
#Then forgot your password link should be displayed

#@test3
#Scenario: Login with correct credentials
#Given user is on login page
#When user enters username "dec2020secondbatch@gmail.com"
#And user enters password "Selenium@12345"
#And user clicks on Login button
#Then user gets the title of the page
#And page title should be "My account - My Store"