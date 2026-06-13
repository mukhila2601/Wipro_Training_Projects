package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {

    private WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    private By input1 = By.id("input1");
    private By input2 = By.id("input2");
    private By input3 = By.id("input3");

    private By btn1 = By.id("btn1");
    private By btn2 = By.id("btn2");
    private By btn3 = By.id("btn3");

    public void fillSection1(String text) {
        driver.findElement(input1).sendKeys(text);
    }

    public void fillSection2(String text) {
        driver.findElement(input2).sendKeys(text);
    }

    public void fillSection3(String text) {
        driver.findElement(input3).sendKeys(text);
    }

    public void clickSubmit1() {
        driver.findElement(btn1).click();
    }

    public void clickSubmit2() {
        driver.findElement(btn2).click();
    }

    public void clickSubmit3() {
        driver.findElement(btn3).click();
    }
    public void fillAndSubmitForm() {

        fillSection1("Automation Section 1");
        clickSubmit1();

        fillSection2("Automation Section 2");
        clickSubmit2();

        fillSection3("Automation Section 3");
        clickSubmit3();
    }
}