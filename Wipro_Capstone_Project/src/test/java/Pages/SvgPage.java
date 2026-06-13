package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SvgPage {

    private WebDriver driver;

    public SvgPage(WebDriver driver) {
        this.driver = driver;
    }

    private By redCircle =
            By.xpath("//*[name()='circle']");

    private By greenRect =
            By.xpath("//*[name()='rect']");

    private By blueTriangle =
            By.xpath("//*[name()='polygon']");

    public void verifySvgElements() {

        System.out.println(
                "Red Circle Displayed : "
                        + driver.findElement(redCircle)
                                .isDisplayed());

        System.out.println(
                "Green Rectangle Displayed : "
                        + driver.findElement(greenRect)
                                .isDisplayed());

        System.out.println(
                "Blue Triangle Displayed : "
                        + driver.findElement(blueTriangle)
                                .isDisplayed());
    }
}