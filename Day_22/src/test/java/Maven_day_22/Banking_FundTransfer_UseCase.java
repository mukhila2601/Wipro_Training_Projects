package Maven_day_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Banking_FundTransfer_UseCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
                .sendKeys("mukhila123");
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys("Mukh@123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Transfer Funds"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("amount"))).sendKeys("100");
        Thread.sleep(3000);
        WebElement fromAcc = driver.findElement(By.id("fromAccountId"));

        Select from = new Select(fromAcc);

        from.selectByIndex(0);
        WebElement toAcc = driver.findElement(By.id("toAccountId"));

        Select to = new Select(toAcc);

        to.selectByIndex(1);
        driver.findElement(By.xpath("//input[@value='Transfer']")).click();
        WebElement successMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h1[contains(text(),'Transfer Complete!')]")));

        String message = successMsg.getText();
        if (message.equals("Transfer Complete!")) {

            System.out.println("Fund Transfer Successful");

        } else {

            System.out.println("Fund Transfer Failed");
        }

        Thread.sleep(5000);
        driver.findElement(By.linkText("Log Out")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}