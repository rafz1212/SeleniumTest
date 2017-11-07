package com.pack.base;
import org.fluentlenium.adapter.FluentTest;
//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseIntegration extends FluentTest{
    public Application app;
    //public WebDriver driver;
    //public static String browserType = "firefox";
    //public static String appUrl = "http://accounts.google.com";

    @Override
    public WebDriver getDefaultDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\repos\\Tools\\geckodriver.exe");
        return new FirefoxDriver();
    }


     //FireFox Browser, maxmize and navigate to appURL
//    private static WebDriver initFirefoxDriver(String appUrl){
//        System.out.println("Launching Firefox Browser..");
//        System.setProperty("webdriver.gecko.driver", "C:\\repos\\Tools\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to(appUrl);
//        return driver;
//    }
//
//    //Instantiate Chrome Browser, maxmize and navigate to appURL
//    private static WebDriver initChromeDriver(String appURL){
//        System.out.println("Launching Chrome browser..");
//        System.setProperty("webdriver.chrome.driver",  "C:\\repos\\Tools\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to(appURL);
//        return driver;
//    }
//    public WebDriver getDriver(){
//    return driver;
//}
//
//    public static void setDriver(String browserType, String appUrl){
//        if (browserType == "firefox"){
//            initFirefoxDriver(appUrl);
//        }
//    }
//
//    @BeforeClass
//    public static void initializeTestBaseSetup(){
//        setDriver(browserType, appUrl);


}
