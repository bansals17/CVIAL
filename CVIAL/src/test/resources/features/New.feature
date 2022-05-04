Feature: CVIAL Automation
  Verify CVIAL Flow

  @Sanity @LTCFSP-T1185
  Scenario: Verify that CF Site Manager is able to remove selected drug from a drug list by searching for a specific drug
    When User is on login Page
    And User entered credentials userid as "cf.manager01@loblawqc.ca" and as password "Welcome!123"
    And User click on the DM home page
    When User selects a drug list of "test"
    #Then Verify user is redirect the drug list page with list name
    When User has an option to go back to DM home page
    Then Verify Pharmacy Drug Lists option is present and redirects user to DM home page
   When User selects a drug list of "test"
    Then Verify that column name available on drug list page
   When User searches for a drug based on DIN; Trade Name and UPC as "APO"
    #Then Verify Searched result is displayed
    When user selects the checkbox beside the search results header
    Then Verify select all the drugs in that search results
    When user clicks on a parent drug record consisting of multiple UPC’s

  @Sanity @LTCFSP-T1186
  Scenario: Verify that Super Admin is able to remove selected drug from a drug list
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    And User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    When User selects a drug list of "test"
    When User has an option to go back to DM home page
    Then Verify Pharmacy Drug Lists option is present and redirects user to DM home page
    When User selects a drug list of "test"
    Then Verify that column name available on drug list page
    When user clicks on a parent drug record consisting of multiple UPC’s
    Then Display list of all UPC’s with unassigned UPC’s in disabled mode and checkboxes shouldn’t be displayed beside the UPC’s
    When user clicks on a parent drug record consisting of single UPC’s












