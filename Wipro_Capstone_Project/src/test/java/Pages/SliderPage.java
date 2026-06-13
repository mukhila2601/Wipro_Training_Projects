package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.WaitUtils;

public class SliderPage {

    private WebDriver driver;
    private Actions actions;

    public SliderPage(WebDriver driver) {

        this.driver = driver;
        this.actions = new Actions(driver);
    }

    // Slider Handle
    private By slider =
            By.xpath("//span[contains(@class,'ui-slider-handle')]");

    // Price Range Text
    private By priceRange =
            By.id("amount");

    public void moveSliderRight(int pixels) {

        WebElement sliderElement =
                WaitUtils.waitForVisibility(
                        driver,
                        slider);

        actions.dragAndDropBy(
                sliderElement,
                pixels,
                0)
                .perform();
    }

    public void moveSliderLeft(int pixels) {

        WebElement sliderElement =
                WaitUtils.waitForVisibility(
                        driver,
                        slider);

        actions.dragAndDropBy(
                sliderElement,
                -pixels,
                0)
                .perform();
    }

    public String getPriceRange() {

        return driver.findElement(priceRange)
                     .getText();
    }
}