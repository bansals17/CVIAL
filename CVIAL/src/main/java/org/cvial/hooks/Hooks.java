package org.cvial.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.cvial.context.TestContext;
import org.cvial.factory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static org.cvial.Constants.FrameworkContants.*;

public class Hooks {


    private WebDriver driver;
    private final TestContext context;
    public static Scenario scenario;

    public Hooks (TestContext context){
        this.context = context;
    }

    @Before
    public void before(Scenario scenario) {
        Hooks.scenario = scenario;
        //scenario.log("***************************Scenario log*************************************************************************");
        System.out.println("BEFORE THREAD ID : " + Thread.currentThread().getId() + " , " + "SCENARIO NAME : " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty(PARAMETER_BROWSER, BROWSER_CHROME));
        context.driver = driver;
    }

    @After
    public void after(Scenario scenario){
        System.out.println("AFTER THREAD ID : " + Thread.currentThread().getId() + " , " + "SCENARIO NAME : " + scenario.getName());
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.quit();

    }

}
