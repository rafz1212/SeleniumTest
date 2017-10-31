package com.seltestFramework.webdriver;

import org.junit.Assert;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selAutomation {


    @Test
        public void firefoxTest(){

        System.setProperty("webdriver.gecko.driver", "C:\\repos\\Tools\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

            driver.navigate().to("http://www.cricinfo.com/");
//            var1 = driver.getTitle();
            Assert.assertEquals("Title check failed!","Title is", driver.getTitle());

            driver.close();
            driver.quit();
    }
}
