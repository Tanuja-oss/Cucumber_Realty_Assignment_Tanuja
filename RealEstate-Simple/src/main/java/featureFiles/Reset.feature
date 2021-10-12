Feature: Real Estate Feature Application

Scenario Outline: Login to the Real Estate Application

Given Navigate to the Application login URL 
When User click on Login Register button
Then Click on Lost Your password
And Validate Reset password page
Then Enter "<Email>"
Then Click on Reset password button
And Close the page

Examples:
| Email |
|manzoor@gmail.com |