package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage {

    private WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    private By dropDown =
            By.xpath("//input[@placeholder='Select an item']");

    public void selectItem(String itemName)
            throws InterruptedException {

        driver.findElement(dropDown).click();

        Thread.sleep(2000);

        WebElement item =
                driver.findElement(
                        By.xpath("//*[text()='"
                                + itemName
                                + "']"));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        item);

        Thread.sleep(1000);

        item.click();
        Thread.sleep(2000);

        System.out.println(
                "Selected : " + itemName);
    }
}