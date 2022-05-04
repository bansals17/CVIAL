package org.cvial.Constants;

public class FrameworkContants {

    public static final int EXPLICIT_WAIT = 30;

    public static final String PROJECT_NAME = "CVIAL AUTOMATION";

    public static final String PARAMETER_ENV = "env";
    public static final String PARAMETER_BROWSER = "browser";

    //SUPPORTED BROWSER
    public static final String BROWSER_CHROME = "chrome";
    public static final String BROWSER_FIREFOX = "firefox";
    public static final String BROWSER_SAFARI = "safari";
    public static final String BROWSER_EDGE = "edge";
    public static final String BROWSER_IE = "ie";
    public static final String BROWSER_OPERA = "opera";


    //ENVIRONMENT CONFIGURATION FILES
    public static final String DIRECTORY_ENV_CONFIG = "src/test/resources/config/";
    public static final String ENV_CONFIG_QA = "qa_config.properties";
    public static final String ENV_CONFIG_UAT = "uat_config.properties";
    public static final String ENV_CONFIG_PROD = "prod_config.properties";

    //CUCUMBER REPORT
    public static final String REPORTS_CUCUMBER_LOCATION = "./target/cucumber";
    public static final String REPORTS_CUCUMBER_LOCAL = REPORTS_CUCUMBER_LOCATION + "cucumber.html";
}
