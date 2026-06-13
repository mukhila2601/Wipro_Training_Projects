package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.FormPage;

public class FormTest extends BaseTest {

    @Test
    public void testForm() throws InterruptedException {

        driver.get("https://testautomationpractice.blogspot.com/");

        FormPage formPage = new FormPage(driver);

        formPage.fillAndSubmitForm();

        Thread.sleep(3000);
    }
}