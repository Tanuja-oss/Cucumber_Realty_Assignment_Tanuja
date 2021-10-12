Feature: Real Estate Feature Application

Scenario Outline: Login to the Real Estate Application

Given Navigate to the Application login URL 
When User click on Login Register button
Then Validate Register page
Then Enter valid "<Email>" , "<FirstName>" , "<LastName>"
Then Click on Register button
And Validate successfull message
And Close the page


Examples:
|Email|FirstName|LastName|
|manzoor@gmail.com|manzoor|mehadi|