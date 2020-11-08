Feature: Deviantart image search
  Scenario: Verify if deviantart find my acount images
    Given Launch Chrome browser and open deviantart.com/login page
    And Login in my account
    Then Make a search from browser
    And Check the list with images
    Then Close the browser
