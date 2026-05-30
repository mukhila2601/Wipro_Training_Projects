package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class PurchaseTest {

    WebDriver driver;
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void ecommercePurchaseFlow() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLogin();

        Thread.sleep(2000);
        ProductsPage pp = new ProductsPage(driver);

        pp.addProductToCart();
        pp.openCart();

        Thread.sleep(2000);
        CartPage cp = new CartPage(driver);

        cp.clickCheckout();

        Thread.sleep(2000);
        CheckoutPage checkout = new CheckoutPage(driver);

        checkout.enterCheckoutDetails();

        checkout.clickContinue();

        Thread.sleep(2000);

        checkout.clickFinish();

        Thread.sleep(2000);
        String actualMessage = checkout.getConfirmationMessage();

        String expectedMessage = "Thank you for your order!";

        Assert.assertEquals(actualMessage, expectedMessage);

        System.out.println("Order Successfully Placed");
    }
    public void closeBrowser() {

        driver.quit();
    }
}