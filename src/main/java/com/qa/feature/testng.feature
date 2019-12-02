Feature: Free CRM Application Testing

Scenario: Login test
Given title of the page is Free CRM
When user is on homepage
Then clicks on login button
Then enters email and password

|email|password|
|subhambiswas895@gmail.com|Welcome123$|

Then verify the user name