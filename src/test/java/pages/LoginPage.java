package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "identifierId") private static WebElement element1;
//    @FindBy(how = How.ID, using = "identifierNext") private WebElement element2;
//    @FindBy(how = How.ID, using = "password") private WebElement element3;
//    @FindBy(how = How.ID, using = "passwordNext") private WebElement element4;

    public @FindBy(id = "") WebElement test;

//    @FindBy(how = How.


    public static void LoginToSite(){

          element1.sendKeys("username");
//        element2.click();
//        element3.sendKeys("password");
//        element4.click();
    }



}
