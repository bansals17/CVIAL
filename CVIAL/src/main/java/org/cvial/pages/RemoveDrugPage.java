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

public class RemoveDrugPage extends BasePage {
    public RemoveDrugPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//b[@class='ExpansionLabel_root__gPxeX DrugTable_expansionLabel__IK8kp']//parent::div//preceding-sibling::div")
    private WebElement selectDrugMUPc;

    @FindBy(xpath = "(//b[@class='ExpansionLabel_root__gPxeX DrugTable_expansionLabel__IK8kp']//parent::div//preceding-sibling::div)[2]")
    private WebElement expandDrug;


    public void SelectMUpcsDrug(){
        selectDrugMUPc.click();
    }

    public void ExpandDrug(){
        expandDrug.click();
    }

}
