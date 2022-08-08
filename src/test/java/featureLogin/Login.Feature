Feature: Adactin hotel booking


Background: login functionality for adactin hotel booking 
Given user in launch the browsers
When user enter the username in username field 
And user enter the password into password field 
Then user click the submit button
 
 @regression_run
 Scenario: fill creiteria
     Given click  the select location drop down to location selection selection
     When click  the hotel drop down to holel selection
     Then click  the hotel type  drop down to holel selection
     
     
     @regression_run
 Scenario: change the password fuction
     Given click  the change pw field to for password change
    
         