Feature: Login to the Leaftaps Application

@smoke
Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the login button
Then Verify the home page is displayed

Scenario: Negative Login
Given Type the username as 'DemoSales'
And Type the password as 'crmsfa123'
When Click on the login button
But Error message is displayed
