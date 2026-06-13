package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String dashboard =
                driver.findElement(By.xpath("//h6[text()='Dashboard']"))
                        .getText();

        Assert.assertEquals(dashboard, "Dashboard");
    }
}