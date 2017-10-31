package FunctionalTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.LoginPage;

//import org.openqa.selenium.support.PageFactoryFinder;


public class LoginTests{

public WebDriver driver;


    //public FirefoxDriver driver;

    @Test
        public void firefoxTest() throws Exception{

        System.setProperty("webdriver.gecko.driver", "C:\\repos\\Tools\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        "C:\\Program Files\\Firefox Developer Edition\\firefox.exe"
        FirefoxDriver driver = new FirefoxDriver(options);


            driver.navigate().to("https://accounts.google.com/");


            //driver.findElement(By.id("identifierId")).sendKeys("username");
            //driver.findElement(By.id("identifierNext")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(5000);
           // driver.findElement(By.name("password")).sendKeys("password");
            //driver.findElement(By.id("passwordNext")).click();

            LoginPage.LoginToSite();


            driver.close();
        Thread.sleep(5000);
            driver.quit();
    }
}
