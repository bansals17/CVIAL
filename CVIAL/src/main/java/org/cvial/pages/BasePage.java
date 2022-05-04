package org.cvial.pages;

import org.cvial.hooks.Hooks;
import org.cvial.utils.ConfigLoader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.cvial.Constants.FrameworkContants.EXPLICIT_WAIT;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        PageFactory.initElements(driver, this);
    }

    public void load(){
        driver.get(ConfigLoader.getInstance().getBaseUrl());
    }

    public WebElement waitForElementVisibility(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitForElementVisibility(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(WebElement element){
        waitForElementVisibility(element).click();
    }

    public void click(By by){
        waitForElementVisibility(by).click();
    }

    public void clearAndSendKeys(WebElement element, String value){
        element = waitForElementVisibility(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitForPageLoad(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public String getElementText(WebElement element){
        return waitForElementVisibility(element).getText();
    }

    public void scrollToDown(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while( 1>0){
            if(ele.isDisplayed())
            {
                break;}
            else{
                js.executeScript("arguments[0].scrollIntoView();", ele);
                }

               // js.executeScript("window.scrollBy(0,1000)");
        }

    }

    public void scrollToMiddle(WebElement ele){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", ele);
    }

    public void takeScreenshot(){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        //Hooks.scenario..embed(screenshot, "image/png");
        Hooks.scenario.attach(screenshot, "image/png","Please see attached Screenshpt");
    }
}



