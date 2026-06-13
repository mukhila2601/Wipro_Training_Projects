package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LabelsAndLinksPage;

public class LabelsAndLinksTest extends BaseTest {

    @Test
    public void verifyLabelsAndLinks()
            throws InterruptedException {

        LabelsAndLinksPage page =
                new LabelsAndLinksPage(driver);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,4500)");

        Thread.sleep(3000);

        page.navigateLaptopLinks();

        Thread.sleep(2000);

        js.executeScript(
                "window.scrollBy(0,500)");

        Thread.sleep(2000);

        page.navigateBrokenLinks();
    }
}