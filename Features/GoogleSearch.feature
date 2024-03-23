Feature: google Search

Scenario: simple search

Given I am on Google homepage
When i enter the search "<terms>"
And I click Search button
Then I receive the result 

Examples:
|terms                  |
|Quality Assurance Jobs |
|Softw are testing jobs  |