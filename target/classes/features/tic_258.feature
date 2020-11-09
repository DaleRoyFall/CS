Feature: TIC-258
  Scenario: Verify that functionality "Send a review" works as expected
    Given Launch Chrome browser TIC-258
    And Open loving-hermann.com page TIC-258
    Then Open clothing menu TIC-258
    And Click on product quick view TIC-258
    Then Press on REVIEW button
    Given Enter name, email and review
    And Press on SEND button
    Then Close the browser TIC-258
