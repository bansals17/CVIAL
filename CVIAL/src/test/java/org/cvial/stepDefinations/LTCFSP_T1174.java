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

public class LTCFSP_T1174 {

    private final TestContext context;
    private final LoginPage loginPage;
    private final ProvincePage provincePage;
    private final DrugManagemt drugManagemt;


    public LTCFSP_T1174(TestContext context){
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        provincePage = PageFactoryManager.getProvincePage(context.driver);
        drugManagemt = PageFactory.initElements(context.driver, DrugManagemt.class);
    }

    @When("^User is on login Page$")
    public void User_is_on_loginPage(){
        loginPage.load();
    }

       @And("^User entered credentials userid as \"([^\"]*)\" and as password \"([^\"]*)\"$")
    public void user_enter_credential(String userId, String password){
        loginPage.login(userId, password);
    }

    @Then("^User is successfully loggedIn$")
    public void User_is_successfully_loggedIn(){
        String expectedText = loginPage.afterLoginText();
        System.out.println("Validate user is able to login : " + expectedText);
        Assert.assertEquals("Select Central Fill Site", expectedText);
    }

    @When("^User select Province from dropDown$")
        public void select_province()  {
            provincePage.selectProvince("Ontario");
    }

    @And("^User select Central fill site$")
    public void selectCentralFillSite() {
       // provincePage.selectCentralFillSite();
    }

    @Then("^Validate Test Viscount UAT Central site content$")
    public void validateContentOnTestViscountUAT(){
        String ExpectedText = provincePage.getTestViscountUATContent();
        System.out.println("Text on UAT Site : " + provincePage.getTestViscountUATContent());
        if(ExpectedText.equalsIgnoreCase("Test Viscount  UAT")){
            System.out.println("Text on Test Viscount UAT site contains : " + "Test Viscount  UAT");
        }
        else{
            System.out.println("Text on Test Viscount UAT site not contains : " +"Test Viscount  UAT");
        }

    }

    @And("^Click on Test Viscount UAT$")
    public void clickOnTestViscount() {
        provincePage.clickOnVisCount();
    }


    @And("^User click on the DM home page$")
    public void clickOnDM() {
        drugManagemt.Dmanagement();
    }

    @And("^User click on create drug list on the DM home page$")
    public void clickOnCDL() {drugManagemt.Newdl(); }


    @And("^user enters the drug list name as \"([^\"]*)\"$")
    public void sendKey(String name) {drugManagemt.newDrugName(name);}

    @And("^User Click on Create button$")
    public void clickOnCL() {drugManagemt.submitButton();}

    @Then("^verify that drug list has created by name as \"([^\"]*)\"$")
    public void verifyName(String name) throws InterruptedException {drugManagemt.verifyText(name);}


}



