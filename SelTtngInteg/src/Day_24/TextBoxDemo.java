package Day_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		// Enter Full Name
		driver.findElement(By.id("userName")).sendKeys("Mukhila Rai");
		Thread.sleep(2000);
		// Enter Email
		driver.findElement(By.id("userEmail")).sendKeys("mukhila@gmail.com");
		Thread.sleep(3000);
		// Enter Current Address
		driver.findElement(By.id("currentAddress"))
				.sendKeys("Delhi, India");
		Thread.sleep(3000);
		// Enter Permanent Address
		driver.findElement(By.id("permanentAddress"))
				.sendKeys("Noida, Uttar Pradesh");
		Thread.sleep(3000);
		// Click Submit Button
		WebElement submitBtn = driver.findElement(By.id("submit"));
		submitBtn.click();

		Thread.sleep(2000);

		// Fetch Output Details
		String name = driver.findElement(By.id("name")).getText();
		String email = driver.findElement(By.id("email")).getText();
		String currentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		String permanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		Thread.sleep(3000);
		// Print Output
		System.out.println("===== Submitted Details =====");

		System.out.println(name);
		System.out.println(email);
		System.out.println(currentAddress);
		System.out.println(permanentAddress);
		Thread.sleep(3000);
		// Validation
		if(name.contains("Mukhila Rai"))
		{
			System.out.println("Name Validation Passed");
		}
		else
		{
			System.out.println("Name Validation Failed");
		}
		Thread.sleep(3000);
		System.out.println("Page Title : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());

		driver.quit();
	}
}