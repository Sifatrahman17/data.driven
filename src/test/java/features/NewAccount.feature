Feature: New Account Page
Techfios bank and cash New Account Functionality

Background:
 Given A user already logged in as "demo@Techfios.com"  and "abc123"     
 
Scenario Outline:User should be able to login with valid credentials
and open a new account 
 When User clicks on bank and cash 
 Then User clicks on new account 
 Then User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
 Then User should be able to see validate
 
Examples:
   | accountTitle|description|initialBalance|accountNumber|contactPerson|phone|internetBankingUrl|
      |SR        | Saving     | 2000        | 1223456      |  JR         |12345|SA@gmail.com      | 