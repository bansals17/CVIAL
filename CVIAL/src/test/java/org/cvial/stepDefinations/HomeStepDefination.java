package org.cvial.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cvial.context.TestContext;
import org.cvial.factory.PageFactoryManager;
import org.cvial.pages.HomePage;

public class HomeStepDefination {

    private final TestContext context;
    private final HomePage homePage;

    public HomeStepDefination(TestContext context){
        this.context = context;
        homePage = PageFactoryManager.getHomePage(context.driver);
    }

    @When("^User is on homepage$")
    public void  user_is_on__homePage(){
        homePage.load();
    }

    @Then("^Login button displaying$")
    public void login_button_diplaying(){
        System.out.println("Login button is displaying");
    }
}



