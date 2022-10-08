@smoke
Feature: F02_Login | users could use login functionality to use their accounts
Background: user go to login page
#Test Scenario 1
Scenario: user could login with valid email and password
When  user login with "alexia.connelly@example.com" and "P@ssw0rd"
And   user press on login button
Then  user login to the system successfully

#Test Scenario 2
  Scenario: user could login with invalid email and password
When  user login with "wrong@example.com" and "P@ssw0rd"
And   user press on login button
Then  user could not login to the system
