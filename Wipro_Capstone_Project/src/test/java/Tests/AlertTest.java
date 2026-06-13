package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AlertPage;

public class AlertTest extends BaseTest {

    @Test(priority = 1)
    public void verifySimpleAlert() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickSimpleAlert();

        String text = alertPage.getAlertText();

        System.out.println("Alert Text: " + text);

        alertPage.acceptSimpleAlert();
    }

    @Test(priority = 2)
    public void verifyConfirmationAccept() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickConfirmationAlert();

        alertPage.acceptConfirmationAlert();

        Assert.assertTrue(
                alertPage.getConfirmationResult()
                        .contains("OK"));
    }

    @Test(priority = 3)
    public void verifyConfirmationDismiss() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickConfirmationAlert();

        alertPage.dismissConfirmationAlert();

        Assert.assertTrue(
                alertPage.getConfirmationResult()
                        .contains("Cancel"));
    }

    @Test(priority = 4)
    public void verifyPromptAlert() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.clickPromptAlert();

        alertPage.enterPromptText("Shaurya");

        Assert.assertTrue(
                alertPage.getPromptResult()
                        .contains("Shaurya"));
    }

    @Test(priority = 5)
    public void verifyPopupWindow() {

        AlertPage alertPage = new AlertPage(driver);

        // Click popup button
        driver.findElement(
                org.openqa.selenium.By.id("PopUp"))
                .click();

        // Switch to popup window
        alertPage.switchToPopupWindow();

        System.out.println(
                "Popup Title : "
                        + alertPage.getPopupTitle());

        System.out.println(
                "Popup URL : "
                        + alertPage.getPopupURL());

        Assert.assertFalse(
                alertPage.getPopupTitle().isEmpty());

        // Close popup
        alertPage.closePopupWindow();
    }
}