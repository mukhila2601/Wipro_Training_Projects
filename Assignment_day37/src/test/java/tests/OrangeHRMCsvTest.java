package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.CSVReader;

public class OrangeHRMCsvTest {

    @Test
    public void loginUsingCsvData() throws Exception {

        String[] data = CSVReader.getLoginData();

        String username = data[0];
        String password = data[1];

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("CSV Login Successful");
        } else {
            System.out.println("CSV Login Failed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}