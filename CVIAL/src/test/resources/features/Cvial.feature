Feature: CVIAL Automation
          Verify CVIAL Flow

  @Sanity @LTCFSP-T1174
  Scenario: Verify that Admin is able to create a drug list with unique name consisting of special characters
    When User is on login Page
    And User entered credentials userid as "cf.admin01@loblawqc.ca" and as password "Summer@1234"
    Then User is successfully loggedIn
    And User select Province from dropDown
    And User select Central fill site
    Then Validate Test Viscount UAT Central site content
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And  User click on create drug list on the DM home page
    And user enters the drug list name as "Demo3214"
    And User Click on Create button
    Then verify that drug list has created by name as "Demo3214"

  @Sanity @LTCFSP-T1175
  Scenario: Verify that CF Site Manager is unable to create a drug list with the name same as an existing drug list
    When User is on login Page
    And User entered credentials userid as "cf.manager01@loblawqc.ca" and as password "Welcome!123"
    And User click on the DM home page
    And  User click on create drug list on the DM home page
    Then Create drug list popup is displayed to the user to enter the drug list name
    And user enters the drug list name as "abc"
    Then Verify Create button should be disabled and cancel button should be in enabled states
    And user should stay on the same pop up page
    And Error message should be displayed to the user as below 'Drug list with this name already exists'

  @Sanity @LTCFSP-T1176
  Scenario: Verify that CF Site Manager is unable to delete the pharmacy drug list that is associated with one store
    When User is on login Page
    And User entered credentials userid as "cf.manager01@loblawqc.ca" and as password "Welcome!123"
    And User click on the DM home page
    And User selects the standalone drug list associated with one store and click on three dots
    And User selects delete drug list option
    Then Error pop up should be displayed to the user that the drug list cannot be deleted
    Then User clicks on Ok button on the error pop-up
   And User is navigated back to drug management home page and drug list is present

  @Sanity @LTCFSP-T1177
  Scenario: Verify that Super Admin is able to delete the standalone pharmacy drug list that is not associated to any store
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    And User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User selects the standalone drug list not associated to any store and click on three dots of "Demo3214"
    And User selects delete drug list option
    And User clicks on delete button on the confirmation popup
    And User is navigated back to drug management home page and drug list is not present

  @Sanity @LTCFSP-T1178
  Scenario: Verify that Admin is able to create a drug list with unique name consisting of special characters
    When User is on login Page
    And User entered credentials userid as "cf.admin01@loblawqc.ca" and as password "Summer@1234"
    Then User is successfully loggedIn
    When User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User enters the value as "067" and related list will popup
    Then Verify that column name available on drug list page
    Then Verify cancel button is enabled and next button is disabled
    Then Verify that UPC column consists of one UPC ID
    Then Verify that UPC column consists # of UPC count number
    When User selects the parent drug consisting of multiple UPC
    Then Verify all child UPC's are selected
    And Verify that All child UPC's are expanded
    When User deselects the parent drug consisting of multiple UPC
    Then Verify that All child drugs are deselected
    When Click on DIN number
    Then Verify that All child UPC's are collapsed
    When User selects the parent drug consisting of multiple UPC
    Then Verify that Next button is enabled and top right corner should show the count based on the selection of drugs
    And Click on DIN number
    And User deselects one UPC from multiple UPC
    Then Parent record in the table should be partially selected and count on the top right corner should be same
    And user clicks on next button
    And Click on DIN number
    Then verify Display the list of selected drugs along with the UPC's in a table
    And Verify that Total number of drugs selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user clicks on next button
    Then Pop up is displayed with list of all existing drug lists for user to select and an option to create new drug list
    When user select required drug lists as "new_crx_test"
    And user clicks on submit button after selecting required drug lists
    Then Verify user redirect to the DM home page and display the drug lists with number of drugs updated accordingly of "new_crx_test"

  @Sanity @LTCFSP-T1179
  Scenario: Verify that CF Site Manager is able to successfully add a drug to existing drug list based on the entered Trade or Chemical Name
    When User is on login Page
    And User entered credentials userid as "cf.manager01@loblawqc.ca" and as password "Welcome!123"
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User enters the value as "XYL" and related list will popup
    Then Verify that column name available on drug list page
    Then Verify cancel button is enabled and next button is disabled
    Then Verify that UPC column consists of one UPC ID
    Then Verify that UPC column consists # of UPC count number
    When User selects the parent drug consisting of multiple UPC
    Then Verify all child UPC's are selected
    And Verify that All child UPC's are expanded
    When User deselects the parent drug consisting of multiple UPC
    Then Verify that All child drugs are deselected
    When Click on DIN number
    Then Verify that All child UPC's are collapsed
    When User selects the parent drug consisting of multiple UPC
    Then Verify that Next button is enabled and top right corner should show the count based on the selection of drugs
    And Click on DIN number
    And User deselects one UPC from multiple UPC
    Then Parent record in the table should be partially selected and count on the top right corner should be same
    And user clicks on next button
    And Click on DIN number
    Then Parent record in the table should be partially selected and count on the top right corner should be same
    Then verify Display the list of selected drugs along with the UPC's in a table
    And Verify that Total number of drugs selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user clicks on next button
    Then Pop up is displayed with list of all existing drug lists for user to select and an option to create new drug list
    When user select required drug lists as "Manual Fill POC Test"
    And user clicks on submit button after selecting required drug lists
    #Then Verify user redirect to the DM home page and display the drug lists with number of drugs updated accordingly of "new_crx_test"

  @Sanity @LTCFSP-T1180
  Scenario: Verify that Super Admin user is able to successfully add a drug to a new drug list based on the entered DIN
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    When User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User Click On Search Area
    And User enters the value as "020" and related list will popup
    Then Verify that column name available on drug list page
    Then Verify cancel button is enabled and next button is disabled
    Then Verify that UPC column consists of UPC ID or # of UPC as per filtered data
    When User selects the parent drug consisting of multiple UPC
    Then Verify all child UPC's are selected
    Then Verify that Next button is enabled and top right corner should show the count based on the selection of drugs
    And user clicks on next button
    And Click on DIN number
    Then verify Display the list of all selected drugs along with the UPC in a table
    And Verify that Total number of drugs selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user clicks on next button
    Then Pop up is displayed with list of all existing drug lists for user to select and an option to create new drug list
    When user selects 'create new list'
    Then Verify Free text field to enter the drug list name is present and it's selected by default
    When User enters the name of already existing drug list as "abc"
    Then Verify display error message that 'Drug list with this name already exists'
    When user deselects the newly created drug list from select drug lists pop up
    Then Verify remove the free text field and the option to create drug list should still appear
    When user selects 'create new list'
    And User enters the name of new drug list as "Test1 April"
    When user select required drug lists as "new_crx_test"
    And user clicks on submit button after selecting required drug lists
    Then Verify user redirect to the DM home page & display the drug lists with number of drugs updated accordingly

  @Sanity @LTCFSP-T1181
  Scenario: Verify that Super Admin user is able to successfully add a drug to existing drug list based on the entered DIN
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    When User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User Click On Search Area
    And User enters the value as "020" and related list will popup
    Then Verify that column name available on drug list page
    Then Verify cancel button is enabled and next button is disabled
    Then Verify that UPC column consists of UPC ID or # of UPC as per filtered data
    When User selects the parent drug consisting of multiple UPC
    Then Verify all child UPC's are selected
    And Verify that All child UPC's are expanded
    When User deselects the parent drug consisting of multiple UPC
    Then Verify that All child drugs are deselected
    When Click on DIN number
    Then Verify that All child UPC's are collapsed
    When User selects the parent drug consisting of multiple UPC
    Then Verify that Next button is enabled and top right corner should show the count based on the selection of drugs
    And Click on DIN number
    And User deselects one UPC from multiple UPC
    Then Parent record in the table should be partially selected and count on the top right corner should be same
    And user clicks on next button
    And Click on DIN number
    Then Parent record in the table should be partially selected and count on the top right corner should be same
    Then verify Display the list of selected drugs along with the UPC's in a table
    And Verify that Total number of drugs selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user clicks on next button
    Then Pop up is displayed with list of all existing drug lists for user to select and an option to create new drug list
    When user select required drug lists as "abc"
    And user clicks on submit button after selecting required drug lists
    #Then Verify user redirect to the DM home page and display the drug lists with number of drugs updated accordingly of "new_crx_test"

  @Sanity @LTCFSP-T1183
  Scenario: Verify that drug is not added to druglist when user removes/deselects all child UPC (under parent drug) from preview screen
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    When User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User enters the value as "020" and related list will popup
    Then Verify that column name available on drug list page
    When User selects the multiple drug to be added
    Then Verify that Next button is enabled and top right corner should show the count based on the selected drugs
    When user clicks on next button
    And Click on DIN number
    Then verify Display the list of total selected drugs along with the UPC's in a table
    And Verify that Total number of drugs are selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user deselects all UPC's of a parent drug
    Then Verify provide a confirmation pop up  before removing the record from preview screen
    When user clicks on Pop UP back button
    Then Verify then there should be no change to the drug record and should be in the same state as it was previously on the preview screen
    When user clicks on back button
    Then Redirect the user to previous screen and changes made in the current screen shouldn't be cancelled
    When User selected new drugs by searching new Drug
    When user clicks on next button
    And Click on DIN number
    And user deselects all UPC of a parent drug
    Then Verify provide a confirmation pop up  before removing the record from preview screen
    When User clicks on unselect button on the confirmation pop up
    Then Verify remove the drug and total number of drugs selected should be updated accordingly on the screen
    When user deselects all the drugs in the preview
   Then Verify the user redirect to search pop screen


  @Sanity @LTCFSP-T1184
  Scenario: Verify that drug is not added to druglist when user removes/deselects all child UPC (under parent drug) from preview screen
    When User is on login Page
    And User entered credentials userid as "cf.superadmin01@loblawqc.ca" and as password "Welcome!1234"
    Then User is successfully loggedIn
    When User select Province from dropDown
    And User select Central fill site
    And  Click on Test Viscount UAT
    And User click on the DM home page
    And User clicks on Add Drugs button on Drug Management Home Page
    And User Click On Search Area
    And User enters the value as "XYL" and related list will popup
    Then Verify that column name available on drug list page
    When User selects the multiple drug tobe added
    Then Verify that Next button is enabled and top right corner should show the count based on the selected drugs
    And user clicks on next button
    And Click on DIN number
    Then verify the list of total selected drugs along with the UPC's in a table
    And Verify that Total number of drugs are selected
    And Next button should be enabled and Back button to go back to the previous screen
    When user clicks on check box on a particular parent drug record in the table
    Then Verify provide a confirmation pop up  before removing the record from preview screen
    When User clicks on unselect button on the confirmation pop up
    Then Verify remove the drug record in the table and total number of drugs selected should be updated accordingly on the screen
    When user deselects remaining drugs in the preview
    Then Verify provide a confirmation pop up  before removing the record from preview screen





















