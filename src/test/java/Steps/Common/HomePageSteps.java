package Steps.Common;

import net.thucydides.core.steps.ScenarioSteps;




import pages.common.QMSHomePage;
import pages.common.QMSLoginPage;
import net.thucydides.core.annotations.Step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePageSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(HomePageSteps.class);

    QMSLoginPage qmsLoginPage;
    QMSHomePage qmsHomePage;


    @Step
    public void navigateToLoginPage(){

        String  userNameid = "";
        String password = "";

        qmsLoginPage.open();
        //assertTrue (aptaLoginPage.verifyPageIsOpen());
        //aptaLoginPage.loginIntoApta(userNameid,password);

    }

    @Step
    public void loginIntoSite() {



        String  userNameid = "sysop";
        String password = "abcde";
        qmsLoginPage.loginIntoApta(userNameid,password);
        //assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void accessToMainMenu(){
        qmsHomePage.mainMenuAccess();
    }

}
