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

public class DrugManagemt extends BasePage {

    static String strDrug = "";

    public DrugManagemt(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//div[text()='Drug Management']")
    private WebElement DrugMngt;

    @FindBy(xpath = "//h2[text()='Create Drug List']")
    private WebElement CreateDrugListPopUp;

    @FindBy(xpath = "//BUTTON[text()='Create drug list']")
    private WebElement CreateDL;

    @FindBy(name = "name")
    private WebElement DrugName;

    @FindBy(id = "DrugListNameModal-submit")
    private WebElement Submit;

    @FindBy(xpath = "//h4[text()='abc']//parent::div//parent::div//parent::div")
    private WebElement DrugListPresent;

    @FindBy(xpath = "//h4[text()='abc']//parent::div//button")
    private WebElement ClickThreeDot;

    @FindBy(xpath = "//h4[text()='Demo3214']//parent::div//button")
    private WebElement ClickThreeDots;

    @FindBy(xpath = "//div[@class='Modal_header__3m20m']//h2")
    private WebElement ErrorPopUp;


    @FindBy(xpath = "//div[text()='Delete drug list']")
    private WebElement ClickDeleteDL;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement ClickOnDelete;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement ClickOnOK;

    @FindBy(xpath = "//button[text()='Add drugs']")
    private WebElement ClickOnAddDrugs;

    @FindBy(xpath = "//input")
    private WebElement ClickOnSearch;

    @FindBy(id = "SelectDrugModalContent-filter")
    private WebElement EnterValue;

    @FindBy(xpath = "//div[text()='02003767']//preceding-sibling::div/span/input")
    private WebElement ClickOnBox;

    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[text()='Create']")
    private WebElement createlButton;

    @FindBy(xpath = "//button[text()='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[text()='Back']")
    private WebElement backButton;

    @FindBy(xpath = "//div[text()='Drug list with this name already exists']")
    private WebElement errorMesg;

    @FindBy(xpath = "//div[text()='DIN']")
    private WebElement dinText;

    @FindBy(xpath = "//div[text()='Trade Name']")
    private WebElement treadNameText;

    @FindBy(xpath = "//div[text()='Chemical Name']")
    private WebElement chemicalNameText;

    @FindBy(xpath = "//div[text()='Pk Size']")
    private WebElement packSizeText;

    @FindBy(xpath = "//div[text()='Drug Form']")
    private WebElement drugFormText;

    @FindBy(xpath = "//div[text()='UPC']")
    private WebElement upcText;

    @FindBy(xpath = "//div[text()='Full Pack Only']")
    private WebElement fullPackText;

    @FindBy(xpath = "//div[text()='Manufacturer']")
    private WebElement ManufacturerText;

    @FindBy(xpath = "//div[text()='Drug Schedule']")
    private WebElement DrugScheduleText;

    @FindBy(xpath = "//div[text()='DSP']")
    private WebElement DspText;

    @FindBy(xpath = "//div[text()='02003767']")
    private WebElement upc;

    @FindBy(xpath = "//div[text()='00001686']//preceding-sibling::div/span/input")
    private WebElement ClickOndrug;

    @FindBy(xpath = "//div[text()='00001694']")
    private WebElement dinORGARAN;

    @FindAll({
            @FindBy(xpath = "//div[text() ='00001694']")
    })
    private List<WebElement> dinORGARANAll;

    @FindBy(xpath = "//div[text()='0620641001077']//preceding-sibling::div/span/input")
    private WebElement Childupc1;

    @FindBy(xpath = "//div[text()='0620641003040']//preceding-sibling::div/span/input")
    private WebElement Childupc2;

    @FindBy(xpath = "//div[text()='0620641003040']")
    private WebElement cpuNum;


    @FindBy(xpath = "//div[text()='0620641013292']//preceding-sibling::div/span/input")
    private WebElement Childupc3;

    @FindBy(xpath = "//div[text()='0678045000653']//preceding-sibling::div/span/input")
    private WebElement Childupc4;

    @FindBy(xpath = "//div[text() ='02004062']")
    private WebElement singleUpc1;

    @FindAll({
            @FindBy(xpath = "//div[text() ='02003767']")
    })
    private List<WebElement> allUpc;

    @FindAll({
            @FindBy(xpath = "//div[text() ='02004062']")
    })
    private List<WebElement> singleUpc;

    @FindAll({
            @FindBy(xpath = "//div[text()='02003767']//preceding-sibling::div/span/input")
    })
    private List<WebElement> allcheckbox;

    @FindBy(xpath = "//div[text()='02003767']//following-sibling::div[@data-columnid='upc']")
    private WebElement upcCount;

    @FindBy(xpath = "//div[@class='Counter_root__2GqYh Counter_enabled__3xraY']")
    private WebElement drugCount;

    @FindBy(xpath = "//h2[text()='Select Drug List(s) to Add to']")
    private WebElement drugListToAddPopUP;

    @FindBy(xpath = "//button[@id='SelectDrugListModalContent-createDrugList']")
    private WebElement createDrugListMsg;

    @FindBy(xpath = "//span[text()='new_crx_test']")
    private WebElement clickDrugListtoAdd;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement clickSubmitBtn;

    @FindBy(xpath = "//input[@id='SelectDrugListModalContent-drugListName']")
    private WebElement textbox;

    @FindBy(xpath = "//h4[text()='new_crx_test']//parent::div//following-sibling::div/div/span[2]")
    private WebElement drugCountInStore;

    @FindBy(xpath = "//h2[text()='Pharmacy Drug Lists']")
    private WebElement drugList;


    public void drugListPage() {

        Assert.assertTrue(drugList.isDisplayed());
    }

    public void AddDrugToList(String name) {
        WebElement ele = driver.findElement(By.xpath("//span[text()='"+name+"']"));
        ele.click();
    }

    public void SubmitButton() {
        waitForElementVisibility(CreateDL);
        clickSubmitBtn.click();
        takeScreenshot();
    }

    public void checkSingleUpc() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        scrollToDown(upc);
        waitForElementVisibility(singleUpc1);
        boolean flag = false;
        singleUpc1.click();
        int i = singleUpc.size();
        if (i == 1)
            flag = true;
        Assert.assertTrue(flag);

    }

    public void checkSingleUpc1() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        scrollToDown(dinORGARAN);
        waitForElementVisibility(dinORGARAN);
        boolean flag = false;
        dinORGARAN.click();
        int i = dinORGARANAll.size();
        if (i == 1)
            flag = true;
        Assert.assertTrue(flag);

    }

    public void checkUpcCount() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        scrollToDown(upc);
        waitForElementVisibility(upc);
        upc.click();
        int i = allUpc.size();
        i = i - 1;
        String str = upcCount.getText();
        System.out.println(str);
        String[] arr = str.split(" ");
        System.out.println(arr[0]);
        int n = Integer.parseInt(arr[0]);
        boolean flag = false;
        if (i == n)
            flag = true;
        Assert.assertTrue(flag);
    }

    public void checkDrugListAddPOPUP() {
        boolean flag = drugListToAddPopUP.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkCanntDeletedPOPUP() {
        boolean flag = ErrorPopUp.isDisplayed();
        if (flag) {
            String str = ErrorPopUp.getText();
            System.out.println(str);
            if ("“abc” cannot be deleted".equals(str))
                flag = true;
            else
                flag = false;
        }
        Assert.assertTrue(flag);

    }

    public void checkCreateDrugListMsg() {
        Hooks.scenario.log("Create Drug List Msg is Present");
        boolean flag = createDrugListMsg.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void clickCreateDrugListMsg() {
        waitForElementVisibility(createDrugListMsg);
        createDrugListMsg.click();

    }

    public void checkDrugListPresent() {
        boolean flag = DrugListPresent.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkCreateDrugListPopUp() {
        boolean flag = CreateDrugListPopUp.isDisplayed();
        Assert.assertTrue(flag);
    }


    public void countDrug() {
        boolean flag = false;
        String str = drugCount.getText();
        int inum = Integer.parseInt(str);
        if (inum == 1)
            flag = true;
        Assert.assertTrue(flag);
    }

    public void totalcountDrug() {
        boolean flag = false;
        String str = drugCount.getText();
        int inum = Integer.parseInt(str);
        if (inum == 2)
            flag = true;
        Assert.assertTrue(flag);
    }

    public void checkAllSelected() {
        boolean flag;
        for (WebElement ele : allcheckbox) {
            flag = false;
            flag = ele.isSelected();
            Assert.assertTrue(flag);
        }
    }

    public void checkAllDeselected() {
        boolean flag;
        for (WebElement ele : allcheckbox) {
            flag = true;
            flag = ele.isSelected();
            Assert.assertFalse(flag);
        }
    }

    public void printAllElement() {
        int a = allUpc.size();
        System.out.println(a);
        for (WebElement ele : allUpc) {
            String str = ele.getText();
            System.out.println(str);
        }
    }

    public WebElement verifyNameXpath(String text) {
        WebElement ele = driver.findElement(By.xpath("//h4[text()='" + text + "']"));
        return ele;
    }

    public void Dmanagement() {
        waitForElementVisibility(DrugMngt);
        DrugMngt.click();
        //String name ="";
        //WebElement ele = driver.findElement(By.xpath("//h4[text()='"+name+"']//parent::div//following-sibling::div/div/span[2]"));
         strDrug = drugCountInStore.getText();

        System.out.println(strDrug);

    }

    public void compareDrug(String name) {
        driver.navigate().refresh();
        WebElement ele = driver.findElement(By.xpath("//h4[text()='"+name+"']//parent::div//following-sibling::div/div/span[2]"));
        String str1 = ele.getText();
        Hooks.scenario.log("Value of drug before add : " + strDrug);
        //System.out.println("Value of drug before add : "+strDrug);
        Hooks.scenario.log("Value of drug after add : " + str1);
        //System.out.println("Value of drug after add : "+str1);
        String[] arr = strDrug.split(" ");
        int a = Integer.parseInt(arr[0]);
        a = a + 1;
        String strFinal = a + " " + arr[1];
        System.out.println("String final " + strFinal);
        boolean flag = false;
        if (str1.equals(strFinal))
            flag = true;
        Assert.assertTrue(flag);
    }


    public void Newdl() {
        waitForElementVisibility(CreateDL);
        CreateDL.click();
    }

    public void newDrugName(String str) {
        waitForElementVisibility(DrugName);
        DrugName.sendKeys(str);
    }

    public void submitButton() {
        waitForElementVisibility(Submit);
        Submit.click();
    }

    public void upcClick() {
        waitForElementVisibility(upc);
        upc.click();
    }

    public void verifyText(String text) throws InterruptedException {

        WebElement ele = verifyNameXpath(text);
        waitForElementVisibility(ele);
        Thread.sleep(5000);
        String str = ele.getText();
        Hooks.scenario.log((str));
        System.out.println(str);
    }

    public void ClickTD() {
        waitForElementVisibility(ClickThreeDot);
        ClickThreeDot.click();
    }

    public void ClickThreeDot(String str) {
        WebElement ele = driver.findElement(By.xpath("//h4[text()='"+str+"']//parent::div//button"));
        waitForElementVisibility(ele);
        ele.click();
    }

    public void ClickDeleteDrugL() {
        waitForElementVisibility(ClickDeleteDL);
        ClickDeleteDL.click();
    }

    public void CDelete() {
        waitForElementVisibility(ClickOnDelete);
        ClickOnDelete.click();
    }

    public void ClickOk() {
        waitForElementVisibility(ClickOnOK);
        ClickOnOK.click();
    }


    public void CheckBox() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        scrollToMiddle(upc);
        ClickOnBox.click();
    }

    public void ClickDrug() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ClickOndrug.click();
    }

    public void PresentDrug() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ClickOndrug.isDisplayed();
    }

    public void checkCancelEnable() {
        waitForElementVisibility(cancelButton);
        boolean flag = cancelButton.isEnabled();
        Assert.assertTrue(flag);
    }

    public void checkBackButtonEnable() {
        waitForElementVisibility(backButton);
        boolean flag = backButton.isEnabled();
        Assert.assertTrue(flag);
    }

    public void checkCreateDisable() {
        boolean flag = createlButton.isEnabled();
        Assert.assertFalse(flag);
    }




    public void checkNextDisable() {
        boolean flag = nextButton.isEnabled();
        Assert.assertFalse(flag);
    }

    public void checkNextEnabled() {
        boolean flag = nextButton.isEnabled();
        Assert.assertTrue(flag);
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void checkErrorMsg() {
        boolean flag = errorMesg.isDisplayed();
        Hooks.scenario.log("Screen will pop up with error msg: " + getElementText(errorMesg));
        takeScreenshot();
        if (flag) {
            String str = errorMesg.getText();
            if ("Drug list with this name already exists".equals(str))
                flag = true;
            else
                flag = false;
        }
        Assert.assertTrue(flag);

    }

    public void ClickAddDrug() {
        waitForElementVisibility(ClickOnAddDrugs);
        ClickOnAddDrugs.click();
    }

    public void SearchBox() {
        waitForElementVisibility(ClickOnSearch);
        ClickOnSearch.click();
    }

    public void upc(String upc) {
        waitForElementVisibility(EnterValue);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        EnterValue.sendKeys(upc);
    }

    public void createExistingDrugList(String edl) {
        waitForElementVisibility(textbox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        textbox.sendKeys(edl);
    }

    public void createnewDrugList(String edl) {
        waitForElementVisibility(textbox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        textbox.sendKeys(edl);
    }

    public void textboxselected() {
        waitForElementVisibility(textbox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        textbox.isSelected();
        textbox.isDisplayed();
    }

    public void removeTextBox() {
        Hooks.scenario.log("Text Field is not visible");
        takeScreenshot();
        boolean flag;
        try {
            textbox.isEnabled();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        System.out.println(flag);
        Assert.assertFalse(flag);
    }


    public void checkDinPresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(dinText));
        boolean flag = dinText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkTradeNamePresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(treadNameText));
        boolean flag = treadNameText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkChemicalNamePresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(chemicalNameText));
        boolean flag = chemicalNameText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkPackSizePresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(packSizeText));
        boolean flag = packSizeText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkDrugFormPresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(drugFormText));
        boolean flag = drugFormText.isDisplayed();
        Assert.assertTrue(flag);
        String str = drugFormText.getText();
        System.out.println(str);
    }

    public void checkUpcPresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(upcText));
        boolean flag = upcText.isDisplayed();
        Assert.assertTrue(flag);
        String str = upcText.getText();
        System.out.println(str);
    }


    public void checkFullPackPresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(fullPackText));
        boolean flag = fullPackText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkManufacturePresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(ManufacturerText));
        boolean flag = ManufacturerText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkDrugSchedulePresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(DrugScheduleText));
        boolean flag = DrugScheduleText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void checkDspPresent() {
        Hooks.scenario.log("Search results consists of column name on drug list page: " + getElementText(DspText));
        boolean flag = DspText.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void ExpandDrug() {
        upc.click();
    }

    public void ClickChildupc2() {
        scrollToMiddle(Childupc2);
        Childupc2.click();
    }

    public void ClickChildupc1() {
        scrollToMiddle(Childupc1);
        Childupc1.click();
    }

    public void ClickChildupc3() {
        scrollToMiddle(Childupc3);
        Childupc3.click();
    }

    public void ClickChildupc4() {
        scrollToMiddle(Childupc4);
        Childupc4.click();
    }

    public void checkDeSelectUpc() {
        waitForElementVisibility(upc);
        boolean flag = Childupc1.isSelected();
        Assert.assertTrue(flag);
        flag = Childupc2.isSelected();
        Assert.assertFalse(flag);
        flag = Childupc3.isSelected();
        Assert.assertTrue(flag);
        flag = false;
        flag = Childupc4.isSelected();
        Assert.assertTrue(flag);

    }


    public void checkSelectUpc() {
        waitForElementVisibility(upc);
        Assert.assertTrue(Childupc1.isSelected());
        Assert.assertTrue(Childupc2.isSelected());
        Assert.assertTrue(Childupc3.isSelected());
        Assert.assertTrue(Childupc4.isSelected());
    }

    public void countDin() {
        boolean flag = upc.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void DrugSelected() {
        boolean flag = ClickOnBox.isSelected();
        Assert.assertTrue(flag);
    }

    public void DrugUnselected() {
        Hooks.scenario.log("Unselected Drug is not present");
        takeScreenshot();
        boolean flag;
        try {
            upc.isDisplayed();
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        Assert.assertFalse(flag);
    }

    public void checkPreviousStateOnPreviewPage() {
        waitForElementVisibility(upc);

        Assert.assertFalse(Childupc1.isSelected());
        Assert.assertFalse(Childupc2.isSelected());
        Assert.assertFalse(Childupc3.isSelected());
        Assert.assertTrue(Childupc4.isSelected());


    }

}