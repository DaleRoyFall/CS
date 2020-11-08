Feature: Deviantart image search
  Scenario: Verify if deviantart find my acount images
    Given I launch Chrome browser and open deviantart.com page
    And I login in my account
    Then I make a search from browser
    And I check the list with images
    Then I close the browser
