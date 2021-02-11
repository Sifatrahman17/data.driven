Feature: Login_page
Validate Techfios Login Functionality

Background:
     Given User is on the Techfios Login Page                   

 Scenario: User should be able to login with valid credentials 
     When  User enters userName as "demo@Techfios.com"    
     When  User enters passWord as "abc123"        
     And   User clicks on signIn button    
     Then  User should land on Dashboard page  
   