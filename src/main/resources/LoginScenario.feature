@Smoke
Feature: Login Function Test

Background:
Given open browser
And go to application
  

  @Positive @TC-01
  Scenario: As a user, login should pass with valid credentials
    When put valid user name
    And put valid password
    And Click login button
    Then check login validation- Passed
    
    @Negative @TC-02
    
    Scenario: As a user, login should fail with invalid credentials
    When put invalid username
    And put invalid password
    And Click login button 
    Then check login validation - Failed
    
    @Negative @TC-03
    Scenario: As a user, login should fail with null credentials
    When put null username
    And put null password
    And Click login button
    Then check login validation-Failed
    