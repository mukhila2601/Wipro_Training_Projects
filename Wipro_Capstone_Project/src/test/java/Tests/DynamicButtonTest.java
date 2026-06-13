package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DynamicButtonPage;

public class DynamicButtonTest extends BaseTest {

    @Test
    public void verifyStartStopStartButton() throws InterruptedException {

        DynamicButtonPage page =
                new DynamicButtonPage(driver);

        Assert.assertTrue(
                page.isButtonDisplayed(),
                "Button is not displayed");

        page.clickAndWaitForStateChange();

        Thread.sleep(2000);

        page.clickAndWaitForStateChange();

        Thread.sleep(2000);

        System.out.println(
                "START -> STOP -> START sequence completed successfully");
    }
}