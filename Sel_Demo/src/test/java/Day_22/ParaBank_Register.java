package Day_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank_Register {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Mukhila");
        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Rai");
        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Noida Street");
        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Noida");
        driver.findElement(By.id("customer.address.state"))
                .sendKeys("Delhi");
        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("201308");
        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("7827850012");
        driver.findElement(By.id("customer.ssn"))
                .sendKeys("123456789");
        driver.findElement(By.id("customer.username"))
                .sendKeys("mukhila123");
        driver.findElement(By.id("customer.password"))
                .sendKeys("Mukh@123");
        driver.findElement(By.id("repeatedPassword"))
                .sendKeys("Mukh@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='Register']"))
                .click();

        Thread.sleep(5000);
        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}