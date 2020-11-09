Feature: TIC-262
  Scenario: Verify that functionality "Contacts" works as expected
    Given Launch Chrome browser TIC-262
    And Open loving-hermann.com page TIC-262
    Then Press on ”Contacts” button
    Given Enter name, email, subject and message on Contact Form
    And Press on SEND button TIC-262
    Then Close the browser TIC-262
