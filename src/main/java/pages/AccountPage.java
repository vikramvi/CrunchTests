package pages;

import common.DataStore;
import components.BottomNavigationBar;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

import static common.DataStore.*;

public class AccountPage extends AbstractPage {

    @iOSFindBy(accessibility = "Account")
    public WebElementFacade accountNavBar;

    @iOSFindBy(accessibility = "Log In", className = "XCUIElementTypeStaticText")
    public WebElementFacade loginButton;

    @iOSFindBy(accessibility = "Create Account")
    public WebElementFacade createAccountButton;

    @iOSFindBy(accessibility = "Settings")
    public WebElementFacade settingsButton;

    @iOSFindBy(accessibility = "Upgrade Account")
    public WebElementFacade upgradeAccount;

    @iOSFindBy(accessibility = REGISTERED_USER_EMAIL)
    public WebElementFacade userEmailButton;

    @iOSFindBy(accessibility = "Button")
    public WebElementFacade logOutXbutton;

    @iOSFindBy(accessibility = "Log Out", className = "XCUIElementTypeStaticText" )
    public WebElementFacade logoutPopUp;

    @iOSFindBy(accessibility = "Cancel")
    public WebElementFacade logoutCancel;

    @iOSFindBy(accessibility = "Log Out", className = "XCUIElementTypeButton")
    public WebElementFacade logoutApprove;

    private static final By allAccountButtons = By.className("XCUIElementTypeButton");

    public WebElementFacade getLogoutApprove() {
        List<WebElementFacade> list = findAll(allAccountButtons);
        return list.get(list.size()-1);
    }

}
