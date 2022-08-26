Feature: Create a new lead in Leaftaps application



Scenario Outline: Create Lead with different data
Given Click CRMSFA Link
And Click Leads tab
And Click Create Leads Link
When Type the company name as <companyName>
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click create leads button
Then Verify the view leads page

Examples:
|companyName|firstName|lastName|
|TestLeaf|Swati|CR|
|Merit|Siva|T|