Feature: TIC-248
  Scenario: Verify that the button "Find" works as expected
    Given Launch Chrome browser TIC-248
    And Open loving-hermann.com page TIC-248
    Given Enter name of the product
    And Press on "Find" button
    Then Close the browser TIC-248
