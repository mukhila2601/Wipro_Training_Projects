package pageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginModule {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://www.amazon.in"); 
        driver.manage().window().maximize(); 
        Thread.sleep(3000);
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ap_email")).sendKeys("mukhilarai2601@gmail.com"); 
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.id("ap_password")).sendKeys("your_password");
        Thread.sleep(3000);
        driver.findElement(By.id("signInSubmit")).click(); 
        Thread.sleep(3000);       
        System.out.println(driver.getTitle()); 
        driver.quit();
    }
}