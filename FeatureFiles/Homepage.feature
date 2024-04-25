Feature: Opening CarService Page and Getting Service Names and respective Booking Amount

  Scenario: Successfully Getting The Car Service Details
    Given User Opened Website With The URL
    When User Select Service Type As "Car"
    And User Select SubCategory AS "SUV"
    And User Click On "Go for it" Button
    Then User Navigate to the Services Details Displayed Page
    And Captures The Service Name
    And Captures The Booking Amount
