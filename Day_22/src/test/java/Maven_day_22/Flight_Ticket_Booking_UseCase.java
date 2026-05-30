package Maven_day_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight_Ticket_Booking_UseCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        String browser = "chrome";   

        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://blazedemo.com/");
        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("fromPort")));
        Thread.sleep(2000);
        Select sourceCity = new Select(source);
        Thread.sleep(2000);
        sourceCity.selectByVisibleText("Boston");
        Thread.sleep(2000);
        WebElement destination = driver.findElement(By.name("toPort"));
        Select destinationCity = new Select(destination);
        Thread.sleep(2000);
        destinationCity.selectByVisibleText("London");
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//input[@value='Choose This Flight'])[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputName")))
                .sendKeys("Mukhila Rai");
        Thread.sleep(2000);

        driver.findElement(By.id("address")).sendKeys("Noida");
        driver.findElement(By.id("city")).sendKeys("Noida");
        Thread.sleep(2000);
        driver.findElement(By.id("state")).sendKeys("UttarPradesh");
        Thread.sleep(2000);
        driver.findElement(By.id("zipCode")).sendKeys("411048");
        Thread.sleep(2000);
        WebElement cardDropdown = driver.findElement(By.id("cardType"));
        Select cardType = new Select(cardDropdown);
        Thread.sleep(2000);
        cardType.selectByVisibleText("Visa");
        Thread.sleep(2000);

        driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
        driver.findElement(By.id("creditCardMonth")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");
        Thread.sleep(2000);

        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2028");

        driver.findElement(By.id("nameOnCard")).sendKeys("Mukhila Rai");
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        String confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1"))).getText();

        if (confirmationMessage.equals("Thank you for your purchase today!")) {
            System.out.println("Flight ticket booked successfully");
            Thread.sleep(2000);
        } else {
            System.out.println("Flight ticket booking failed");
            Thread.sleep(2000);
        }
        String bookingId = driver.findElement(By.xpath("//td[text()='Id']/following-sibling::td")).getText();
        Thread.sleep(2000);
        System.out.println("Booking ID is: " + bookingId);
        Thread.sleep(2000);
        driver.quit();
    }
}