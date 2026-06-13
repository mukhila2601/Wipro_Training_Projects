package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.WaitUtils;

public class DragDropPage {

    private WebDriver driver;
    private Actions actions;

    public DragDropPage(WebDriver driver) {

        this.driver = driver;
        this.actions = new Actions(driver);
    }
    private By sourceElement =
            By.id("draggable");

    private By targetElement =
            By.id("droppable");
    public void performDragAndDrop() {

        WebElement source =
                WaitUtils.waitForVisibility(
                        driver,
                        sourceElement);

        WebElement target =
                WaitUtils.waitForVisibility(
                        driver,
                        targetElement);

        actions.dragAndDrop(source, target)
               .perform();
    }
    public String getDropMessage() {

        return driver.findElement(targetElement)
                     .getText();
    }

    public boolean isDroppedSuccessfully() {

        return getDropMessage()
                .equalsIgnoreCase("Dropped!");
    }
}