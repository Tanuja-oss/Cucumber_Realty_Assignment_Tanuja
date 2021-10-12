Feature: Real Estate Feature Application

Scenario Outline: Login to the Real Estate Application

Given Navigate to the Application login URL 
When User click on Login Register button
Then Validate Login page
Then Enter valid "<Email>" , "<password>" credentials
And Click on Signin button
Then Validate Signin page
Then Close the page

Examples:
|Email|password|
|manzoor@gmail.com|manzoor|