package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LTCFSP_T1175 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;


    public LTCFSP_T1175(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
    }

    @Then("^Create drug list popup is displayed to the user to enter the drug list name$")
    public void CheckPopUp() {

        drugManagemt.checkCreateDrugListPopUp();
    }

    @Then("^Verify Create button should be disabled and cancel button should be in enabled state$")
    public void CheckEnableAndDisable() {

        drugManagemt.checkCancelEnable();
        drugManagemt.checkNextDisable();
    }

    @Then("^Verify Create button should be disabled and cancel button should be in enabled states$")
    public void CheckEnableDisable() {

        drugManagemt.checkCancelEnable();
        drugManagemt.checkCreateDisable();

    }

    @And("^user should stay on the same pop up page$")
    public void CheckPopUpSame() {

        drugManagemt.checkCreateDrugListPopUp();
    }

    @And("^Error message should be displayed to the user as below 'Drug list with this name already exists'$")
    public void CheckerrMsg() {

        drugManagemt.checkErrorMsg();
    }
}



