package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.hooks.Hooks;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LTCFSP_T1178 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;


    public LTCFSP_T1178(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
    }

    @And("^User clicks on Add Drugs button on Drug Management Home Page$")
    public void ClickAddDrug() {drugManagemt.ClickAddDrug();}

    @And("^User enters the value as \"([^\"]*)\" and related list will popup$" )
    public void sendKey(String name) {drugManagemt.upc(name);}



    @And("^User Click On Search Area$")
    public void Search() {drugManagemt.SearchBox();}

    @Then("^Verify that column name available on drug list page$")
    public void CheckColumnName() {

        drugManagemt.checkChemicalNamePresent();
        drugManagemt.checkDinPresent();
        drugManagemt.checkDrugFormPresent();
        drugManagemt.checkPackSizePresent();
        drugManagemt.checkTradeNamePresent();
        drugManagemt.checkUpcPresent();
        drugManagemt.checkFullPackPresent();
        drugManagemt.checkManufacturePresent();
        drugManagemt.checkDspPresent();
        drugManagemt.checkDrugSchedulePresent();

    }

    @Then("^Verify cancel button is enabled and next button is disabled$")
    public void CheckEnableDiasable() {
        drugManagemt.checkCancelEnable();
        drugManagemt.checkNextDisable();

    }
    @When("^User selects the parent drug consisting of multiple UPC$")
    public void CheckBox() {
        drugManagemt.CheckBox();
    }

    @When("^Click on DIN number$")
    public void ClickOnDINNumber() {drugManagemt.ExpandDrug();}

    @Then("^Verify all child UPC's are selected$")
    public void ChildUpcIsSelected()  {
        drugManagemt.checkAllSelected();


    }

    @When("^User deselects the parent drug consisting of multiple UPC$")
    public void CheckkBox() {drugManagemt.CheckBox();}

    @Then("^Verify that All child drugs are deselected$")
    public void ChildUpcIsDelected() {
        drugManagemt.checkAllDeselected();
    }

    @Then("^Verify that Next button is enabled and top right corner should show the count based on the selection of drugs$")
    public void checkDrugCountAndNextbutton() {
        drugManagemt.checkNextEnabled();
        drugManagemt.countDrug();
    }

    @Then("^Verify that All child UPC's are expanded$")
    public void CheckUpexpanded() {
        drugManagemt.printAllElement();
    }

    @Then("^Verify that All child UPC's are collapsed$")
    public void CheckUpccollapsed() {


            drugManagemt.printAllElement();
        }

    @Then("^Verify that UPC column consists of UPC ID or # of UPC as per filtered data$")
    public void CheckCountOfUpc()  {

        drugManagemt.checkSingleUpc();
        drugManagemt.checkUpcCount();
    }


    @Then("^Verify that UPC column consists of one UPC ID$")
    public void ClickOnSingleUpc() {


        drugManagemt.checkSingleUpc1();
    }

    @Then("^Verify that UPC column consists # of UPC count number$")
    public void CheckCountOfSingleUpc() {

        drugManagemt.checkUpcCount();

    }



    @And("^User clicks on the parent drug$")
    public void SelectParentDrug() {drugManagemt.ExpandDrug();}



    @And("^User deselects one UPC from multiple UPC$")
    public void Deselec1Upc() throws InterruptedException {drugManagemt.ClickChildupc2();}

    @When("^user clicks on next button$")
    public void SelectNestButton() {drugManagemt.clickNextButton();}

    @When("^user select required drug lists as \"([^\"]*)\"$")
    public void AddDrugintoList(String drugList) {drugManagemt.AddDrugToList(drugList);}


    @Then("^Pop up is displayed with list of all existing drug lists for user to select and an option to create new drug list$")
    public void checkCreateDrugListPOPUP() {
        drugManagemt.checkDrugListAddPOPUP();
        drugManagemt.checkCreateDrugListMsg();
    }

    @Then("^Parent record in the table should be partially selected and count on the top right corner should be same$")
    public void checkupcCountOnListPage() {
        drugManagemt.checkDeSelectUpc();
        drugManagemt.countDrug();
    }

    @Then("^verify Display the list of selected drugs along with the UPC's in a table$")
    public void checkupcCountOnPreviewPage() {
        drugManagemt.checkDeSelectUpc();
        drugManagemt.countDrug();
    }

    @Then("^verify Display the list of all selected drugs along with the UPC in a table$")
    public void checkAllupcCountOnListPage() {
        drugManagemt.checkSelectUpc();
        drugManagemt.countDrug();
    }

    @Then("^Verify that Total number of drugs selected$")
    public void checkDrugCountOnPreviewPage() {
        drugManagemt.countDin();
        drugManagemt.countDrug();
    }

    @And("^Next button should be enabled and Back button to go back to the previous screen$")
    public void CheckNextBackButton() {
        drugManagemt.checkBackButtonEnable();
        drugManagemt.checkNextEnabled();
    }


    @And("^user clicks on submit button after selecting required drug lists$")
    public void clickSubmitOption() {
        drugManagemt.SubmitButton();
    }


        @Then("^Verify user redirect to the DM home page and display the drug lists with number of drugs updated accordingly of \"([^\"]*)\"$")
        public void compareDrug(String name) {
            drugManagemt.drugListPage();
            drugManagemt.compareDrug(name);

    }



}

