Feature: Verify Various Scenarios on HeroKUAPP page
Background: Navigate to HeroKuApp
    Given User is on home page of HeroKUAPP
    Then "Available Examples" Page is Displayed
Scenario: Verify the child window text and Parent winow text
    Given User navigate to "Multiple Windows" Page
    When Click on "Click Here"
    Then New Child window opened
    And Verify the Text "New Window" at Child Window
    And Switch to Main window and Verify "Opening a new window" Text