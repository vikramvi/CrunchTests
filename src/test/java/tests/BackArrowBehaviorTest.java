package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class BackArrowBehaviorTest extends BaseTest {

    @Test
    @WithTagValuesOf({ "smoke" })
    @Title("Back Arrow behavior test - 358224")
    public void backArrowBehaviorTest() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();

        initialPageSteps.initialPageIsVisible()
                .pressLoginButton();

        loginPageSteps.loginNavBarIsVisible()
                .pressBackArrow();

        initialPageSteps.initialPageIsVisible()
                .pressCreateAccountButton();

        createAccountSteps.createAccountPageIsVisible()
                .pressBackArrow();
    }

}
