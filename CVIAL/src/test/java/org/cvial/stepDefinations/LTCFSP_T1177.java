package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.support.PageFactory;

public class LTCFSP_T1177 {
    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;


    public LTCFSP_T1177(TestContext context){
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
    }




    @And("^User selects delete drug list option$")
    public void clickOnDeleteDrugList() {
        drugManagemt.ClickDeleteDrugL();
    }

    @And("^User clicks on delete button on the confirmation popup$")
    public void clickOnDelete() {
        drugManagemt.CDelete();
    }

    @And("^User clicks on Ok button on the error pop-up$")
    public void clickOnOk() {
        drugManagemt.ClickOk();
    }

    @And("^User selects the standalone drug list not associated to any store and click on three dots of \"([^\"]*)\"$")
    public void ThreeDots(String drugName) {
        drugManagemt.ClickThreeDot(drugName);
    }
    @And("^User is navigated back to drug management home page and drug list is not present$")
    public void CheckDrugListIsPresent() {

        drugManagemt.checkDrugListPresent();
    }
}

