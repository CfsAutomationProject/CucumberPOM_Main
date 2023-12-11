Feature: Amazon website automation


@amazon
Scenario: Verify amazon search
Given User Log into Amazon portal
When User searches for a Peoduct
Then User Captures the list of Product prices
