package org.cvial.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.cvial.Constants.FrameworkContants.*;

public class DriverFactory {

    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser) {
            case BROWSER_CHROME: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case BROWSER_FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case BROWSER_SAFARI: {
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            }
            case BROWSER_EDGE: {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            }
            case BROWSER_OPERA: {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            }
            default:
                throw new IllegalStateException("INVALID BROWSER : " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
