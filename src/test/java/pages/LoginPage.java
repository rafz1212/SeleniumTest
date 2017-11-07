package pages;

import com.pack.base.Application;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.hamcrest.MatcherAssert.assertThat;

//import static com.sun.jmx.snmp.ThreadContext.contains;
//import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends FluentPage{

    //private static final String element1 = "identifierId";
    @FindBy(how = How.ID, using = "identifierId")
    public FluentWebElement element1;

    @FindBy(how = How.ID, using = "identifierNext")
    public FluentWebElement element2;

    @FindBy(how = How.NAME, using = "password")
    public FluentWebElement element3;

    @FindBy(how = How.ID, using = "passwordNext")
    public FluentWebElement element4;

    @FindBy(how = How.ID, using = "headingText")
    public FluentWebElement pageTitle;

    @Override
    public String getUrl(){
        return  "http://accounts.google.com";
    }
//    @Override
//    public void isAt() {
//        await().until(element1).isPresent();
//    }

    public void LoginToGmail(Application app) {
    System.out.println("LoginToGmail Method Invoked");
    fill(element1).with(app.getUsername());
    element2.click();
    fill(element3).with(app.getPassword());
    element4.click();
    }




}
