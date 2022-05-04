package org.cvial.pages;

import org.cvial.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DrugManagemtNew extends BasePage {

    static String strDrug ="";
    public DrugManagemtNew(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath="//input[@id='SelectDrugListModalContent-removeDrugList']")
    private WebElement deselectCreatedDl;

    @FindBy(xpath = "//div[text()='02004062']//preceding-sibling::div/span/input")
    private WebElement clickNewDrug;

    @FindBy(xpath = "//div[text()='00001724']//preceding-sibling::div/span/input")
    private WebElement secondDrug;

    @FindBy(xpath = "//div[text()='02004674']//preceding-sibling::div/span/input")
    private WebElement clickNewDrug1;

    @FindBy(xpath = "//h4[text()='Test April']//parent::div//parent::div")
    private WebElement newDrugList;

    @FindBy(xpath = "//div[@data-testid='UnselectDrugModal']")
    private WebElement confirmationPopUp;

    @FindBy(xpath = "(//button[text()='Back'])[2]")
    private WebElement clickBackonPopUp;

    @FindBy(xpath = "//button[text()='Back']")
    private WebElement clickBackButton;

    @FindBy(xpath = "//h2[text()='Select Drugs to Add']")
    private WebElement addDrugScreen;

    @FindBy(xpath = "//button[text() ='Unselect']")
    private WebElement clickUnselectButton;

    @FindBy(xpath = "//div[@data-druglist-name='abc']")
    private WebElement clickDrugList;

    @FindBy(xpath = "//button[@data-testid='PageContainer-backButton']")
    private WebElement clickToback;

    @FindBy(xpath = "//h2[text()='Pharmacy Drug Lists']")
    private WebElement pharmacyDL;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement clickDin;

    @FindBy(xpath = "//input[@id='DrugsTabContent-filter']")
    private WebElement enterValue;

    public void SearchDrug(String drug) {
        waitForElementVisibility(enterValue);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterValue.sendKeys(drug);
    }

    public void AllDrugsSelcted(){
        takeScreenshot();
        Assert.assertTrue(clickDin.isSelected());
    }

    public void ClickDIN(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickDin.click();
    }
    public void PresentPDL(){
        Assert.assertTrue(pharmacyDL.isDisplayed());
    }


    public void ClickToback(){
        clickToback.click();
    }
    public void ClickDrugList(String list) {
        WebElement ele = driver.findElement(By.xpath("//div[@data-druglist-name='" +list+ "']"));
        waitForElementVisibility(ele);
        ele.click();
    }

    public void DrugListpage(String name) {
        WebElement drugPage = driver.findElement(By.xpath("//h2"));
        waitForElementVisibility(drugPage);
        Hooks.scenario.log("Name displaying on Drug list page : " + getElementText(drugPage));takeScreenshot();
        Assert.assertTrue(drugPage.isDisplayed());
    }

    public void NewDrugList() {
        Hooks.scenario.log("'Test April' Drug List is present with 1 Drug");takeScreenshot();
        newDrugList.isDisplayed();
    }

    public void SelectNewDrug() {
        takeScreenshot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickNewDrug.click();
    }

    public void SelectSecondDrug() {
        secondDrug.click();
    }

    public void SelectDrugPresent() {
        Assert.assertTrue(secondDrug.isSelected());
    }

    public void PresentNewDrug() {
        takeScreenshot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(clickNewDrug.isSelected());
    }

    public void SelectNewDrug1() {
        //scrollToDown(clickNewDrug1);
        takeScreenshot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickNewDrug1.click();
    }

    public void PresentNewDrug1() {
        //scrollToDown(clickNewDrug1);
        takeScreenshot();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickNewDrug1.isSelected();
    }

    public void PreviewScreen() {
        Hooks.scenario.log("User is redirect to preview screen");takeScreenshot();
        addDrugScreen.isDisplayed();
    }

    public void ClickCretedDl(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        deselectCreatedDl.click();
    }

    public void ConfirmationPopUP() {
        Hooks.scenario.log("Screen Will Pop Up With msg 'Are you sure you want to unselect this drug?'");takeScreenshot();
        confirmationPopUp.isDisplayed();
    }

    public void ClickBackBtn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       clickBackButton.click();
    }

    public void ClickpopUpBackBtn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickBackonPopUp.click();
    }
    public void ClickUnselectBtn() {
        clickUnselectButton.click();
    }



    }

