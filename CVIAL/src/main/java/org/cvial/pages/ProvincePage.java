package org.cvial.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ProvincePage extends BasePage{

    public ProvincePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "SelectCentralFillSiteContent-provinceInput")
    private WebElement Province_DropDown;

    @FindBy(xpath = "//*[@class='Card_root__3G3B_ ItemCard_root__1nVZz ItemCard_color-1__3UHdh ItemCard_clickable__ADJId']")
    private WebElement centralFillSite_link;

    @FindBy(xpath = "//*[text()='Test Viscount  UAT']")
    private WebElement TestVisCountUAT_Text;

    @FindBy(xpath = "//*[text()=\"1685 Tech Avenue, Mississauga, ON, L4W 0A7\"]")
    private  WebElement TestVisCountUAT_Address;

    @FindBy(xpath = "//*[contains(text(), 'stores')]")
    private WebElement Store_text;

    @FindBy(xpath = "//*[contains(text(), 'drug lists')]")
    private WebElement DrugList_text;

    @FindBy(xpath = "//*[@class = \"Card_root__3G3B_ ItemCard_root__1nVZz ItemCard_color-1__3UHdh ItemCard_clickable__ADJId\"]")
    private WebElement TestViscountUAT_Link;

    @FindBy(xpath = "//h4[text()='Test Viscount  UAT']")
    private WebElement visCount;

    public void selectProvince(String provinceName) {
        click(Province_DropDown);
        clearAndSendKeys(Province_DropDown, provinceName);
        Province_DropDown.sendKeys(Keys.ENTER);
    }

    public void selectCentralFillSite(){
        click(centralFillSite_link);
    }

    public String getTestViscountUATContent(){
        return getElementText(TestViscountUAT_Link);

    }

    public void clickOnVisCount(){

        waitForPageLoad();
        visCount.click();
    }
}
