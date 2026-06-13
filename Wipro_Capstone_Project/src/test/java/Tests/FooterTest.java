package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.FooterPage;

public class FooterTest extends BaseTest {

    @Test
    public void testFooterLinks()
            throws InterruptedException {

        driver.get(
            "https://testautomationpractice.blogspot.com/");

        FooterPage footerPage =
                new FooterPage(driver);

        footerPage.clickAllFooterLinks();
    }
}