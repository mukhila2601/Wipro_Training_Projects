package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WaitUtils;

public class AlertPage {

    private WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }
    private By simpleAlertButton =
            By.id("alertBtn");
    private By confirmationAlertButton =
            By.id("confirmBtn");
    private By promptAlertButton =
            By.id("promptBtn");
    private By resultText =
            By.id("demo");
    public void clickSimpleAlert() {
        WaitUtils.waitForClickable(
                driver,
                simpleAlertButton)
                .click();
    }
    public void acceptSimpleAlert() {
        WaitUtils.waitForAlert(driver);
        driver.switchTo()
                .alert()
                .accept();
    }
    public void clickConfirmationAlert() {
        WaitUtils.waitForClickable(
                driver,
                confirmationAlertButton)
                .click();
    }

    public void acceptConfirmationAlert() {
        WaitUtils.waitForAlert(driver);
        driver.switchTo()
                .alert()
                .accept();
    }
    public void dismissConfirmationAlert() {
        WaitUtils.waitForAlert(driver);
        driver.switchTo()
                .alert()
                .dismiss();
    }
    public void clickPromptAlert() {
        WaitUtils.waitForClickable(
                driver,
                promptAlertButton)
                .click();
    }
    public void enterPromptText(String text) {
        WaitUtils.waitForAlert(driver);
        Alert alert =
                driver.switchTo()
                        .alert();
        alert.sendKeys(text);
        alert.accept();
    }
    public String getAlertText() {
        WaitUtils.waitForAlert(driver);
        return driver.switchTo()
                .alert()
                .getText();
    }
    public String getConfirmationResult() {
        return driver.findElement(resultText)
                .getText();
    }
    public String getPromptResult() {
        return driver.findElement(resultText)
                .getText();
    }
    public void switchToPopupWindow() {
        String parentWindow =
                driver.getWindowHandle();
        for (String window :
                driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo()
                        .window(window);
                break;
            }
        }
    }
    public String getPopupTitle() {
        return driver.getTitle();
    }
    public String getPopupURL() {
        return driver.getCurrentUrl();
    }
    public void closePopupWindow() {
        String parentWindow =
                driver.getWindowHandle();
        driver.close();
        for (String window :
                driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                continue;
            }
            driver.switchTo()
                    .window(window);
            break;
        }
    }
    public void acceptAlert() {
        WaitUtils.waitForAlert(driver);
        driver.switchTo()
                .alert()
                .accept();
    }
    public void dismissAlert() {
        WaitUtils.waitForAlert(driver);
        driver.switchTo()
                .alert()
                .dismiss();
    }
    public void enterTextInAlert(String text) {
        WaitUtils.waitForAlert(driver);
        Alert alert =
                driver.switchTo()
                        .alert();
        alert.sendKeys(text);
    }
}