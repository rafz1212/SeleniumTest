package FunctionalTests;
import com.pack.base.BaseIntegration;
import org.junit.Before;
import org.junit.Test;
import org.fluentlenium.core.annotation.Page;
import pages.LoginPage;
import com.pack.base.Application;


public class LoginTests extends BaseIntegration{

    private LoginPage gLoginPage;

    //@Page LoginPage loginPage;

    @Before
    public void setup(){
        app = new Application();
    }

    @Test
        public void loginToGmailTest(){
        app.setUsername("username");
        app.setPassword("tester");
        gLoginPage = createPage(LoginPage.class);
        gLoginPage.go();
        //gLoginPage.isAt();
        gLoginPage.LoginToGmail(app);

    }
}

