Feature: Getting Error Message By providing Invalid E-mail ID
  
  Scenario: Successfully Getting Error Message
    Given User Click on Register Button
    When User Enters Other Details along with Invalid Email
    And User Click On SignUp Button
    Then User Get Error Message
