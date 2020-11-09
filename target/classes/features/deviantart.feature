Feature: Deviantart image search
  Scenario: Verify if deviantart find my acount images
    Given Launch Chrome browser
    And Open deviantart.com login page
    Then Login in my account
    And Make a search from browser
    Then Check the list with images
    And Close the browser
