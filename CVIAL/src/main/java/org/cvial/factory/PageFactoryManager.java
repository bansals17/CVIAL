package org.cvial.factory;

import org.cvial.pages.HomePage;
import org.cvial.pages.LoginPage;
import org.cvial.pages.ProvincePage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static HomePage homePage;
    private static LoginPage loginPage;
    private static ProvincePage provincePage;


    public static HomePage getHomePage(WebDriver driver) {
        return homePage == null ? new HomePage(driver) : homePage;
    }

    public static LoginPage getLoginPage(WebDriver driver) {
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }

    public static ProvincePage getProvincePage(WebDriver driver) {
        return provincePage == null ? new ProvincePage(driver) : provincePage;
    }


}




