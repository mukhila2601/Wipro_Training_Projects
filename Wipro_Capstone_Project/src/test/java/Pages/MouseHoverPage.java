package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.WaitUtils;

public class MouseHoverPage {

    private WebDriver driver;
    private Actions actions;

    public MouseHoverPage(WebDriver driver) {

        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Mouse Hover Button
    private By pointMeButton =
            By.xpath("//button[text()='Point Me']");

    private By mobilesOption =
            By.linkText("Mobiles");

    private By laptopsOption =
            By.linkText("Laptops");

    public void hoverOnPointMe() {

        WebElement element =
                WaitUtils.waitForVisibility(
                        driver,
                        pointMeButton);

        actions.moveToElement(element)
               .perform();
    }

    public void clickMobiles() {

        hoverOnPointMe();

        WaitUtils.waitForClickable(
                driver,
                mobilesOption)
                .click();
    }

    public void clickLaptops() {

        hoverOnPointMe();

        WaitUtils.waitForClickable(
                driver,
                laptopsOption)
                .click();
    }
}