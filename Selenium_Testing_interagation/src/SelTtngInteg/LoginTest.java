package SelTtngInteg;
 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class LoginTest
{
 
	ChromeDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.out.println("Launching Browser");
		Thread.sleep(3000);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
	}
	@Test
	public void loginTest() throws InterruptedException
	{
		System.out.println("Executing Login Test");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		System.out.println("Login Successful");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Closing Browser");
		driver.quit();
		
	}
	
}