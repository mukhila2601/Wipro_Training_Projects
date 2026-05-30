package pageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginModule {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.name("username"))
              .sendKeys("your_username");
        Thread.sleep(3000);
        driver.findElement(By.name("password"))
              .sendKeys("your_password");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}