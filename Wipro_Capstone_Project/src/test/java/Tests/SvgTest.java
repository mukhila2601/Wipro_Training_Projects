package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.SvgPage;

public class SvgTest extends BaseTest {

    @Test
    public void verifySVGElements()
            throws InterruptedException {

        SvgPage page =
                new SvgPage(driver);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,3400)");

        Thread.sleep(3000);

        page.verifySvgElements();
    }
}