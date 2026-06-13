package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPage {

    private WebDriver driver;

    public FooterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By footerLinks =
            By.cssSelector("#PageList1 a");

    public void clickAllFooterLinks() throws InterruptedException {
        List<WebElement> links =
                driver.findElements(footerLinks);

        int count = links.size();

        for(int i = 0; i < count; i++) {

            links =
                driver.findElements(footerLinks);

            String linkName =
                    links.get(i).getText();

            System.out.println(
                    "Clicking: " + linkName);

            links.get(i).click();

            Thread.sleep(2000);

            System.out.println(
                    "Current URL: "
                    + driver.getCurrentUrl());

            driver.navigate().back();

            Thread.sleep(2000);
        }
    }
}