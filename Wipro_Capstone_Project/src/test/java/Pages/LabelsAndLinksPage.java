package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LabelsAndLinksPage {

    private WebDriver driver;

    public LabelsAndLinksPage(WebDriver driver) {
        this.driver = driver;
    }
    private By appleLink =
            By.id("apple");

    private By lenovoLink =
            By.id("lenovo");

    private By dellLink =
            By.id("dell");
    private By brokenLinks =
            By.xpath("//*[@id='broken-links']/a");

    public void navigateLaptopLinks()
            throws InterruptedException {

        By[] laptopLinks = {
                appleLink,
                lenovoLink,
                dellLink
        };

        System.out.println(
                "\n===== LAPTOP LINKS =====");

        for (By link : laptopLinks) {

            WebElement element =
                    driver.findElement(link);

            String linkName =
                    element.getText();

            System.out.println(
                    "\nClicking : "
                            + linkName);

            element.click();

            Thread.sleep(3000);

            System.out.println(
                    "Title : "
                            + driver.getTitle());

            System.out.println(
                    "URL : "
                            + driver.getCurrentUrl());

            driver.navigate().back();

            Thread.sleep(3000);
        }
    }

    public void navigateBrokenLinks()
            throws InterruptedException {

        List<WebElement> links =
                driver.findElements(brokenLinks);

        int count = links.size();

        System.out.println(
                "\n===== BROKEN LINKS =====");

        for (int i = 0; i < count; i++) {

            links =
                    driver.findElements(brokenLinks);

            String linkName =
                    links.get(i).getText();

            System.out.println(
                    "\nClicking : "
                            + linkName);

            links.get(i).click();

            Thread.sleep(3000);

            System.out.println(
                    "Title : "
                            + driver.getTitle());

            System.out.println(
                    "URL : "
                            + driver.getCurrentUrl());

            driver.navigate().back();

            Thread.sleep(3000);
        }
    }
}