package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator
    By checkoutBtn = By.id("checkout");

    // Method
    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}