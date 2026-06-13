package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utilities.WaitUtils;

public class DoubleClickPage {

    private WebDriver driver;
    private Actions actions;

    public DoubleClickPage(WebDriver driver) {

        this.driver = driver;
        this.actions = new Actions(driver);
    }
    private By hoverButton =
            By.xpath("//button[contains(text(),'Point Me')]");
    private By mobileOption =
            By.linkText("Mobiles");
    private By laptopOption =
            By.linkText("Laptops");
    private By field1 =
            By.id("field1");
    private By field2 =
            By.id("field2");
    private By copyTextButton =
            By.xpath("//button[contains(text(),'Copy Text')]");
    public void doubleClickCopyButton() {
        WebElement button =
                WaitUtils.waitForClickable(
                        driver,
                        copyTextButton);
        actions.doubleClick(button)
               .perform();
    }
    public String getField1Text() {
        return driver.findElement(field1)
                     .getAttribute("value");
    }
    public String getField2Text() {
        return driver.findElement(field2)
                     .getAttribute("value");
    }

    public boolean verifyCopiedText() {

        return getField1Text()
                .equals(getField2Text());
    }

}