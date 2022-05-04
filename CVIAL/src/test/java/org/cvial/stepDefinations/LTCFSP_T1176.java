package org.cvial.stepDefinations;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.support.PageFactory;

public class LTCFSP_T1176 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;


    public LTCFSP_T1176(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
    }

    @Then("^Error pop up should be displayed to the user that the drug list cannot be deleted$")
    public void CheckCanNotDeletedError() {

        drugManagemt.checkCanntDeletedPOPUP();
    }
    @And("^User is navigated back to drug management home page and drug list is present$")
    public void CheckDrugListIsPresent() {

        drugManagemt.checkDrugListPresent();
    }

    @And("^User selects the standalone drug list associated with one store and click on three dots$")
    public void ThreeDot() {
        drugManagemt.ClickTD();
    }
}



