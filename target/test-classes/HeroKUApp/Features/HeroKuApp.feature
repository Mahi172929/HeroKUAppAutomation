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
Scenario: Verify the text on the middle nested frame
    Given User navigate to "Nested Frames" Page
    When Switch to Middle Frame on Top Frame
    Then Verify the Text "MIDDLE" at the middle frame
    And Switch to parent Frame and display name
@latest
Scenario: Verify Data table functionality
		Given User navigate to "Sortable Data Tables" Page
		When user is able to see the "Data Tables"
		Then Verify the data table functionalities 
		And Verify the a row with "Smith" , "John", "jsmith@gmail.com","$50.00", "http://www.jsmith.com" exists on the table