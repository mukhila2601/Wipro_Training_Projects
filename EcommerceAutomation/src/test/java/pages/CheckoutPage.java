package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By successMsg = By.className("complete-header");

    // Methods
    public void enterCheckoutDetails() {

        driver.findElement(firstName).sendKeys("Mukhila");
        driver.findElement(lastName).sendKeys("Rai");
        driver.findElement(postalCode).sendKeys("110001");
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(successMsg).getText();
    }
}