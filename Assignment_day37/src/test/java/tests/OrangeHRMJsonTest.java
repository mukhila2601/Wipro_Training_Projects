package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.JsonReader;
import utils.LoginData;

public class OrangeHRMJsonTest {

    @Test
    public void loginUsingJsonData() throws Exception {

        LoginData data = JsonReader.getLoginData();

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(data.username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(data.password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("JSON Login Successful");
        } else {
            System.out.println("JSON Login Failed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}