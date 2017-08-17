package tests.account;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;

import static common.DataStore.ACCOUNT_NAV;
import static common.DataStore.ANIME_NAV;

public class AccountScreenGUITestAnon extends BaseTest {
    @Before
    public void before() {
        notificationPopupSteps.notificationIsVisible()
                .pressDontAllow();
    }

    @Test
    @WithTagValuesOf({ "other" })
    @Title("GUI of the 'Account' screen - Anonymous User - 413845")
    public void accountPageGUITest() {
        initialPageSteps.initialPageIsVisible()
                        .pressJustExplore();

        bottomNavBarSteps.addAllButtonsToList()
                         .buttonIsSelected(ANIME_NAV)
                         .selectButton(ACCOUNT_NAV)
                         .buttonIsSelected(ACCOUNT_NAV);

        accountPageSteps.accountPageIsVisible();
    }
}