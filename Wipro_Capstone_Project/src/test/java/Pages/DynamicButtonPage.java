package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitUtils;

public class DynamicButtonPage {

    private WebDriver driver;

    public DynamicButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    private By toggleButton =
            By.xpath("//button[text()='START' or text()='STOP']");

    public String getButtonText() {

        return WaitUtils
                .waitForVisibility(driver, toggleButton)
                .getText()
                .trim();
    }

    public void clickAndWaitForStateChange() {

        WebElement button =
                WaitUtils.waitForClickable(driver, toggleButton);

        String oldState =
                button.getText().trim();

        button.click();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(driver ->
                !driver.findElement(toggleButton)
                       .getText()
                       .trim()
                       .equals(oldState));

        String newState =
                driver.findElement(toggleButton)
                      .getText()
                      .trim();

        System.out.println(
                oldState + " -> " + newState);
    }
    public boolean isButtonDisplayed() {

        return WaitUtils
                .waitForVisibility(driver, toggleButton)
                .isDisplayed();
    }
}