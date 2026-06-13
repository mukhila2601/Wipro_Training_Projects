package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HiddenAjaxPage;

public class HiddenAjaxTest extends BaseTest {

    @Test
    public void automateHiddenAjax() throws InterruptedException {

        driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");

        HiddenAjaxPage page = new HiddenAjaxPage(driver);

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        page.enterInput1("Selenium");

        page.showInput2();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("input2")));

        page.enterInput2("Automation");

        page.selectCheckbox1();

        page.showCheckbox2();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("checkbox2")));

        page.selectCheckbox2();

        page.loadAjaxContent();

        // Wait for AJAX content to load
        Thread.sleep(5000);

        String content =
                driver.findElement(By.id("container"))
                        .getText();

        System.out.println("Container Content:");
        System.out.println(content);

        Assert.assertTrue(content.length() > 0,
                "AJAX content was not loaded.");
    }
}