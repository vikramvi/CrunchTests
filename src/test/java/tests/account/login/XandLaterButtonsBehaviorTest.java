package tests.account.login;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.*;

public class XandLaterButtonsBehaviorTest extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.pressAllow();

        initialPageSteps.pressJustExplore();

    }

    @Test
    @WithTagValuesOf({"other"})
    @Title("'X' & 'Later' buttons behavior - 7564")
    public void xAndLaterButtonsTest() {
        animePageSteps.bottomNavBarSteps.addAllButtonsToList()
                .selectButton(ACCOUNT_NAV);

        accountPageSteps.pressLogin();

        loginPageSteps.pressXButton();

        accountPageSteps.pressLogin();

        loginPageSteps.pressLater();

        accountPageSteps.shouldSeeAccountPage();
    }

}
