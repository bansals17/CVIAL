Feature: just example

  Scenario: abcgrtedh kjhf
    When User is on login Page









  @Sanity1 @LTCFSP-T1194
  Scenario: Verify that CF Site Manager is able to search a TradeName and remove the drug from single druglist via DM homepage
    When User is on login Page
    And User entered credentials userid as "cf.manager01@loblawqc.ca" and as password "Welcome!123"
    And User click on the DM home page
    And User selects remove drug button
    Then Verify user is redirect to Select Drug to Remove pop-up
    And User enters the UPC as "APO" and related list will popup
    Then Verify that column name available on drug list page
    Then Verify cancel button is enabled and next button is disabled
    When User clicks on a parent drug record in the table consisting of multiple UPC's
    Then Verify that both Next and cancel button is enabled
    And Verify display UPC under the UPC column in the table when drug consists of single UPC
    And Verify display consolidated UPC when drug consists of multiple UPC
    And Verify that All child UPCs are expanded
    Then Verify that All child UPCs are collapsed
    When user clicks on next button