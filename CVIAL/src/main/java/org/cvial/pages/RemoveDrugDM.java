package org.cvial.pages;

import org.cvial.hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class RemoveDrugDM extends BasePage {
    public RemoveDrugDM(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath="//div[text()='00312770']//following-sibling::div[@data-columnid='upc']")
    private WebElement upcCounts;

    @FindBy(xpath = "//button[text()='Remove drug']")
    private WebElement clickOnRemoveDrugs;

    @FindBy(xpath = "//h2[text()='Select Drug to Remove']")
    private WebElement selectRemoveToDrugPopUP;

    @FindBy(xpath = "//div[text()='00312770']//preceding-sibling::div/span/input")
    private WebElement clickDin;

    @FindBy(xpath="//div[text()='02243538']")
    private WebElement clickSingleUpcDrug;

    @FindBy(xpath = "//div[text() ='00312770']")
    private WebElement expandDin;


    @FindAll({
            @FindBy(xpath = "//div[text() ='00312770']")
    })
    private List<WebElement> checkTotalUpc;

    @FindAll({
            @FindBy(xpath = "//div[text() ='02243538']")
    })
    private List<WebElement> checkSingleUpcDrug;

    public void ClickOnRemoveDrugsDrugList() {
        clickOnRemoveDrugs.click();
    }

    public void SelectRemoveDrugPopUP() {
        boolean flag = selectRemoveToDrugPopUP.isDisplayed();
        Assert.assertTrue(flag);
    }

    public void SlectDin() {
        clickDin.click();
        expandDin.click();
    }




    public void checkSingleUpcColumn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        waitForElementVisibility(clickSingleUpcDrug);
        boolean flag = false;
        clickSingleUpcDrug.click();
        int i = checkSingleUpcDrug.size();
        if(i==1)
            flag = true;
        Assert.assertTrue(flag);

    }

    public void checkMultyUpcCount(){
        scrollToMiddle(clickDin);
        int i = checkTotalUpc.size();
        i = i-1;
        String str = upcCounts.getText();
        System.out.println(str);
        String[] arr = str.split(" ");
        System.out.println(arr[0]);
        int n = Integer.parseInt(arr[0]);
        boolean flag = false;
        if(i==n)
            flag = true;
        Assert.assertTrue(flag);
    }

}

