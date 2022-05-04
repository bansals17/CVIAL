package org.cvial.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.hooks.Hooks;
import org.cvial.pages.DrugManagemt;
import org.cvial.pages.DrugManagemtNew;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.support.PageFactory;

public class LTCFSP_T1180_85 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;
    private final DrugManagemtNew drugManagemtNew;

    public LTCFSP_T1180_85(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
        drugManagemtNew = PageFactory.initElements(context.driver, DrugManagemtNew.class);
    }

    @When("^user selects 'create new list'$")
    public void CreateDrugList() {
        drugManagemt.clickCreateDrugListMsg();
    }

    @Then("^Verify Free text field to enter the drug list name is present and it's selected by default$")
    public void checktextboxpresentandselected() {
        drugManagemt.textboxselected();

    }

    @When("^User enters the name of already existing drug list as \"([^\"]*)\"$")
    public void EnterExistingDrug(String name) {
        drugManagemt.createExistingDrugList(name);
    }

    @Then("^Verify display error message that 'Drug list with this name already exists'$")
    public void ErrorMsgCheck() {
        drugManagemt.checkErrorMsg();

    }

    @When("^user deselects the newly created drug list from select drug lists pop up$")
    public void DeselctNewlyCreatedDl() {
        drugManagemtNew.ClickCretedDl();
    }

    @Then("^Verify remove the free text field and the option to create drug list should still appear$")
    public void Verify() {
        drugManagemt.checkCreateDrugListMsg();
        drugManagemt.removeTextBox();
    }

    @And("^User enters the name of new drug list as \"([^\"]*)\"$")
    public void EnterNewDrug(String name) {
        drugManagemt.createnewDrugList(name);
    }

    @Then("^Verify user redirect to the DM home page & display the drug lists with number of drugs updated accordingly$")
    public void compareDrug(String name) {
        drugManagemtNew.NewDrugList();
        drugManagemt.drugListPage();
        drugManagemt.compareDrug(name);
    }

    @When("^User selects the multiple drug tobe added$")
    public void CheckDrugs() {
        //drugManagemt.ClickDrug();
        drugManagemtNew.SelectSecondDrug();
        drugManagemt.CheckBox();
    }

    @When("^User selects the multiple drug to be added$")
    public void SelectMultiDrugs() {
        drugManagemt.CheckBox();
        drugManagemtNew.SelectNewDrug();

    }

    @When("^user deselects all UPC's of a parent drug$")
    public void DeselectAllChildUpc() {
        drugManagemt.ClickChildupc1();
        drugManagemt.ClickChildupc2();
        drugManagemt.ClickChildupc3();
        drugManagemt.ClickChildupc4();
    }

    @Then("^Verify provide a confirmation pop up  before removing the record from preview screen$")
    public void ConfirmationMsg() {
        drugManagemtNew.ConfirmationPopUP();
    }

    @Then("^Verify then there should be no change to the drug record and should be in the same state as it was previously on the preview screen$")
    public void PreviewPageState() {
        drugManagemt.checkPreviousStateOnPreviewPage();
        drugManagemtNew.PresentNewDrug();
    }

    @When("^user clicks on back button$")
    public void ClickBackBtn() {
        drugManagemtNew.ClickBackBtn();
    }

    @When("^user clicks on Pop UP back button$")
    public void ClickPopUpBackBtn() {
        drugManagemtNew.ClickpopUpBackBtn();
    }

    @Then("^Redirect the user to previous screen and changes made in the current screen shouldn't be cancelled$")
    public void PreviewScreenResult() {
        drugManagemtNew.PreviewScreen();
        drugManagemt.DrugSelected();
    }

    @When("^User selected new drugs by searching new Drug$")
    public void SelectNewDrugs() {
        drugManagemtNew.SelectNewDrug1();
    }

    @And("^user deselects all UPC of a parent drug$")
    public void DeselectChildUpc() {
        drugManagemt.ClickChildupc4();
    }

    @When("^User clicks on unselect button on the confirmation pop up$")
    public void ClickUnselectBtn() {
        drugManagemtNew.ClickUnselectBtn();

    }

    @When("^user deselects all the drugs in the preview$")
    public void DeselectAllDrugs() {
        drugManagemtNew.SelectNewDrug();
        drugManagemtNew.ClickUnselectBtn();
        drugManagemtNew.SelectNewDrug1();
        drugManagemtNew.ClickUnselectBtn();
    }

    @Then("^Verify that Total number of drugs are selected$")
    public void checkDrugsCountOnPreviewPage() {
        drugManagemt.totalcountDrug();
    }

    @Then("^verify Display the list of total selected drugs along with the UPC's in a table$")
    public void checkAllupcCountOnListPage() {
        Hooks.scenario.log("Total 2 Drug With Upc is present");
        drugManagemtNew.PresentNewDrug();
        drugManagemt.countDin();
        drugManagemt.checkSelectUpc();
        //drugManagemt.totalcountDrug();
    }

    @Then("^Verify the user redirect to search pop screen$")
    public void checkPreviewScreen() {
        drugManagemtNew.PreviewScreen();
    }

    @Then("^Verify that Next button is enabled and top right corner should show the count based on the selected drugs$")
    public void checkDrugCountAndNextbutton() {
        drugManagemt.checkNextEnabled();
        drugManagemt.totalcountDrug();
    }

    @Then("^Verify remove the drug and total number of drugs selected should be updated accordingly on the screen$")
    public void checkSelectedDrugs() {
        Hooks.scenario.log("Total 2 Drug With Upc is present");
        drugManagemtNew.PresentNewDrug();
        drugManagemtNew.PresentNewDrug1();
        drugManagemt.DrugUnselected();
    }

    @Then("^verify the list of total selected drugs along with the UPC's in a table$")
    public void SelectedDrugWithUpc() {
        Hooks.scenario.log("Total 2 Drug With Upc is present");
        //drugManagemt.PresentDrug();
        drugManagemt.countDin();
        drugManagemt.checkSelectUpc();
        //drugManagemt.totalcountDrug();
    }

    @And("^And Click on Drugs number$")
    public void SelectParentDrug() {
        drugManagemt.ExpandDrug();
    }

    @When("^user clicks on check box on a particular parent drug record in the table$")
    public void UnselectDrug() {
        drugManagemt.CheckBox();

    }

    @Then("^Verify remove the drug record in the table and total number of drugs selected should be updated accordingly on the screen$")
    public void checkSelectedDrug() {
        Hooks.scenario.log("Total 1 Drug With Upc is present");
        drugManagemt.DrugUnselected();
        drugManagemtNew.SelectDrugPresent();
    }

    @When("^user deselects remaining drugs in the preview$")
    public void UnselectallDrug() {
       drugManagemtNew.SelectSecondDrug();
    }

    @When("^User selects a drug list of \"([^\"]*)\"$")
    public void SelectDrugList(String list) {
        drugManagemtNew.ClickDrugList(list);
    }

    @Then("^Verify user is redirect the drug list page with list name$")
    public void checkDrugListPage(String name) {
        drugManagemtNew.DrugListpage(name);
    }

    @When("^User has an option to go back to DM home page$")
    public void BackToDmPage() {
        drugManagemtNew.ClickToback();
    }

    @Then("^Verify Pharmacy Drug Lists option is present and redirects user to DM home page$")
    public void DrugListPage() {
        drugManagemt.drugListPage();
        drugManagemtNew.PresentPDL();
    }

    @When("^User searches for a drug based on DIN; Trade Name and UPC as \"([^\"]*)\"$")
        public void sendKey(String name) {drugManagemtNew.SearchDrug(name);
    }

    @When("^user selects the checkbox beside the search results header$")
    public void SelectAllDrug() {
        drugManagemtNew.ClickDIN();
    }

    @Then("^Verify select all the drugs in that search results$")
    public void VerifySelectedDrugs() {

    }


}


