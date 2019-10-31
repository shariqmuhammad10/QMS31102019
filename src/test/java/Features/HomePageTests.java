package Features;

import Steps.Common.HomePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(SerenityRunner.class)

public class HomePageTests {

        private static final Logger Logger = LoggerFactory.getLogger(HomePageTests.class);

    @Managed
    WebDriver driver;


    @Steps
    HomePageSteps homePageSteps;

    @Test
    public void verifyLoginPageIsAppearing() {

        homePageSteps.navigateToLoginPage();
    }


    @Test
    public void VerifyLoginIntoSite() {

        homePageSteps.navigateToLoginPage();

        homePageSteps.loginIntoSite();

    }


    @Test
    public void openMainMenu(){
        homePageSteps.navigateToLoginPage();
        homePageSteps.loginIntoSite();
        homePageSteps.accessToMainMenu();


    }

    @Ignore
    @Test
    public void test2(){}

}
