package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.cvial.pages.RemoveDrugDM;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LTCFSP_T1194 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;
    private final RemoveDrugDM removeDrugDM;


    public LTCFSP_T1194(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
        removeDrugDM = PageFactory.initElements(context.driver, RemoveDrugDM.class);
    }

    @And("^User selects remove drug button$")
    public void clickRemoveDrug() {
        removeDrugDM.ClickOnRemoveDrugsDrugList();
    }

    @Then("^Verify user is redirect to Select Drug to Remove pop-up$")
    public void SelectRDLPopUpDisplayed() {
        removeDrugDM.SelectRemoveDrugPopUP();
    }

    @Then("^Verify that both Next and cancel button is enabled$")
    public void CheckEnableDiasable() {
        drugManagemt.checkCancelEnable();
        drugManagemt.checkNextEnabled();


    }
    @When("^User clicks on a parent drug record in the table consisting of multiple UPC's$")
    public void ClickPDB(){
        removeDrugDM.SlectDin();

    }

    @And("^Verify display UPC under the UPC column in the table when drug consists of single UPC$")
    public void DinConsist1Upc() {
        removeDrugDM.checkSingleUpcColumn();
    }

    @And("^Verify display consolidated UPC when drug consists of multiple UPC$")
    public void DinConsistUpcs() {
        removeDrugDM.checkMultyUpcCount();
    }

    @And("^Verify that All child UPCs are expanded$")
    public void CheckUpcexpanded() {
        removeDrugDM.checkMultyUpcCount();
    }

    @Then("^Verify that All child UPCs are collapsed$")
    public void CheckUpcscollapsed() {


        removeDrugDM.checkSingleUpcColumn();
    }

}

