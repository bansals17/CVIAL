package org.cvial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    /*public WebElement username_field(){
        return driver.findElement(By.name("loginfmt"));
    }

    public WebElement next_button(){
        return driver.findElement(By.id("idSIButton9"));
    }

    public WebElement password_field(){
        return driver.findElement(By.name("passwd"));
    }*/

    @FindBy(name = "loginfmt")
    private WebElement username_field;

    @FindBy(id = "idSIButton9")
    private WebElement next_button;

    @FindBy(id = "i0118")
    private WebElement password_field;

    @FindBy(id = "idSIButton9")
    private WebElement signIn_button;

    @FindBy(id = "idBtn_Back")
    private WebElement staySignIn_NO;

    @FindBy(id = "idSIButton9")
    private WebElement staySignIn_Yes;

    @FindBy(xpath = "//*[text()=\"Select Central Fill Site\"]")
    private WebElement Select_Central_Fill_Site_Text;



    public void login(String UserName, String Password){
        try{
        waitForElementVisibility(username_field);
        /*username_field().sendKeys(UserName);
        next_button().click();
        password_field().sendKeys(Password);
        signIn_button().click();*/
        clearAndSendKeys(username_field,UserName );
        click(next_button);
        waitForPageLoad();
        waitForElementVisibility(password_field);
        clearAndSendKeys(password_field,Password );

        click(signIn_button);
        waitForElementVisibility(staySignIn_NO);
        click(staySignIn_NO);}
        catch(Exception e)
        {
            driver.navigate().refresh();
            waitForElementVisibility(username_field);
        /*username_field().sendKeys(UserName);
        next_button().click();
        password_field().sendKeys(Password);
        signIn_button().click();*/
            clearAndSendKeys(username_field,UserName );
            click(next_button);
            waitForPageLoad();
            waitForElementVisibility(password_field);
            clearAndSendKeys(password_field,Password );
            click(signIn_button);
            waitForElementVisibility(staySignIn_NO);
            click(staySignIn_NO);
        }
    }

    public String afterLoginText(){
        return getElementText(Select_Central_Fill_Site_Text);
    }




}
