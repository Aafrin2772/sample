Feature:
To validate the login functionality

Scenario:
   To check with valid email with invalid password
   
Given Open chrome and facebook 
When To pass email and invalid pass
And To get page title
Then close the browser
   

Scenario:
   To check with invalid email with invalid password
   
Given Open chrome and facebook 
When To pass invalid email and invalid pass
And To click login button
Then close the browser























