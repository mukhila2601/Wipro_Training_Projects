package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DropDownPage;

public class DropDownTest extends BaseTest {

    @Test
    public void verifyDropDown()
            throws InterruptedException {

        DropDownPage page =
                new DropDownPage(driver);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollBy(0,3800)");

        Thread.sleep(3000);

        page.selectItem("Item 10");

        page.selectItem("Item 25");

        page.selectItem("Item 50");

        page.selectItem("Item 51");
    }
}