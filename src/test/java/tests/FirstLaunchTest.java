package tests;

import basetest.BaseTest;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

public class FirstLaunchTest extends BaseTest {

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("First launch popup notification test - 358219")
    public void firstLaunchAllowNotifications() {
        notificationPopupSteps.notificationIsVisible()
                .pressAllow();
    }

    @Test
    @WithTagValuesOf({ "smoke"})
    @Title("First launch popup notification test - 358219")
    public void firstLaunchDontAllowNotifications() {
        notificationPopupSteps.notificationIsVisible()
                .pressDontAllow();
    }
}
