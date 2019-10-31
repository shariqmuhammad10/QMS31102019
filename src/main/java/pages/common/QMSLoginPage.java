package pages.common;

import Actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;



public class QMSLoginPage extends WaitActions {

        @FindBy(xpath = "//title ['AMOS Framework']")
        private WebElementFacade pageTitle;

        @FindBy(xpath = "//input [@name='userLogin']")
        private WebElementFacade loginName;

        @FindBy(xpath = "//input [@name='userPassword']")
        private WebElementFacade passWord;

        @FindBy(xpath = "//ion-button[@type='submit']")
        private WebElementFacade loginButton;

        @FindBy(xpath = "//ion-button[@id='button-menu']")
        private WebElementFacade mainMenuButton;


    public void loginIntoApta(String userName, String passwordId) {
        //waitFor(pageTitle);
        waitFor(loginName);
        loginName.clear();
        loginName.sendKeys(userName);

        passWord.clear();
        passWord.sendKeys(passwordId);

        waitUntilLoaded(loginButton);
        loginButton.click();

    }



    public boolean verifyPageIsOpen() {
        return pageTitle.isDisplayed();

    }
}







