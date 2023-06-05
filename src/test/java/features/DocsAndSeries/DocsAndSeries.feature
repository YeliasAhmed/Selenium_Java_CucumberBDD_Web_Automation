Feature: Verify the Docs & Series Functionality

#TC_01
  @TVO
  Scenario: Verify that the "Docs & Series" page title is available
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed

#TC_02
  @TVO
  Scenario: Verify that "All" is selected in the category navigation
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the "All" label button is available
    And Check that the All label button is selected


#TC_03
  @TVO
  Scenario: Verify that the documentaries are sorted correctly based on chosen criteria
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the Focus on Photography section is displayed
    And Check that the photography photos are displayed in this section
    And Check that the ABOUT MENTAL HEALTH section is displayed
    And Check that the mental health related photos are displayed in this section

#TC_04
  @TVO
  Scenario: Verify that the "Search" functionality is working properly
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the search button is available
    When Click on the search option
    And Check that the search field is displayed
    When Click on the search field and insert "Docs & Series" valid text
    Then Check that the Docs & Series is displayed

#TC_05
  @TVO
  Scenario: Verify that the content detail is displayed after clicking on a specific content
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the Series option is available
    When Click on the Series option
    Then Check that the Series are displayed in the series section
    When Click on any series
    Then Check that the series details are displayed


#TC_06
  @TVO
  Scenario: Verify that the "Docs & Series" page is expanded after hovering on it
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    And Click on the All button
    Then Hover on Docs & Series option
    And Check that the Docs & Series option is expanded


#TC_07
  @TVO
  Scenario: Verify that the "Next & Prev" button is working properly under Docs & Series
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the next arrow is available
    When Click on the next arrow
    Then Check that the Previous arrow is available
    When Click on the Previous arrow
    Then Check that next arrow is available


#TC_08
  @TVO
  Scenario: Verify that the "Docs & Series" cross button is working properly
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    And Click on the All button
    Then Hover on Docs & Series option
    And Check that the Docs & Series option is expanded
    And Check that the cross button is available top of the right corner
    When Click on the cross button
    Then Check that the expanded page is closed


#TC_09
  @TVO
  Scenario: Verify that the specific button is selected after clicking on it
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    Then Check that the "All" label button is available
    And Check that the All label button is selected
    And Check that the A-Z button is available
    When Click on the A-Z button
    Then Check that the A-Z button is selected

#TC_10
  @TVO
  Scenario: Verify that the "Load More" button is working properly
    Given Home page is displayed
    Then Check that the TVO today page is displayed
    And Check that the "Docs & Series" dropdown title is displayed
    When Click on the Docs & Series Dropdown option
    And Click on the All button
    Then Hover on Docs & Series option
    And Check that the Docs & Series option is expanded
    And Check that the History option is available
    When Click on the History button
    Then Scroll down and check that Load more option is available
    And Check that the last history item
    When Click on the Load More option
    Then Again check that last history item

