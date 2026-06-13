package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private static final int WAIT_TIME = 20;

    public static WebElement waitForVisibility(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForPresence(WebDriver driver, By locator) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        return wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean waitForTitleContains(WebDriver driver,
                                               String title) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        return wait.until(
                ExpectedConditions.titleContains(title));
    }

    public static boolean waitForUrlContains(WebDriver driver,
                                             String urlPart) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        return wait.until(
                ExpectedConditions.urlContains(urlPart));
    }

    public static void waitForAlert(WebDriver driver) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));

        wait.until(ExpectedConditions.alertIsPresent());
    }
}