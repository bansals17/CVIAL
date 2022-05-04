package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.hooks.Hooks;
import org.cvial.pages.*;
import org.openqa.selenium.support.PageFactory;

public class LTCFSP_T1186_90 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;
    private final DrugManagemtNew drugManagemtNew;
    private final RemoveDrugPage removeDrugPage;

    public LTCFSP_T1186_90(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
        drugManagemtNew = PageFactory.initElements(context.driver, DrugManagemtNew.class);
        removeDrugPage = PageFactory.initElements(context.driver, RemoveDrugPage.class);
    }
    @When("^user clicks on a parent drug record consisting of multiple UPC’s$")
    public void DrugWMUPCS() {
        removeDrugPage.SelectMUpcsDrug();
        removeDrugPage.ExpandDrug();
    }

}
