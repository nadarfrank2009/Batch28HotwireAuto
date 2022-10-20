Feature: Hotwire Login Functionality 

Scenario Outline: Login into Hotwire with valid credentials 

Given User navigates to "https://hotwire.com" 
When User clicks on the Sign In Button 
And User enters "<email>" into the email feild
And User enters "<password>" into the password feild
And User clicks on final sign In Button
Then User should be able to access "https://www.hotwire.com/checkout/account/myaccount/myinfo" 

Examples: 
|email                |password   |
|smarttech97@gmail.com|Password123|
